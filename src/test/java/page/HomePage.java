package page;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import helper.Config;

public class HomePage {
	@FindBy (xpath="/html/body/div[4]/header/div/div/div[2]/nav/div/div[3]/div[1]/ul/li")
	List <WebElement> menu1;
	@FindBy (xpath="/html/body/div[4]/header/div/div/div[2]/nav/div/div[3]/div[1]/ul/li[4]/div/ul/li/a/span")
	List <WebElement> menu2;
	@FindBy (xpath="/html/body/div[5]/div[4]/div[2]/div[2]/div/h1")
	WebElement verif_home;
	
	public HomePage() {
		PageFactory.initElements(Config.driver, this);
	}
	
	public void choisir_categorie(String menu_pr, String cat) throws Exception {
		Thread.sleep(10000);
		try {
			for (WebElement menus:menu1) {
				Thread.sleep(3000);
				System.out.println(menus.getText());
				Thread.sleep(3000);
				if (menus.getText().contains(menu_pr));
				Config.actions = new Actions (Config.driver);
				Config.actions.moveToElement(menus).perform();
				Thread.sleep(5000);
				for (WebElement categorie : menu2) {
					System.out.println(categorie.getText());
					if (categorie.getText().contains(cat)) {
						categorie.click();
					}
				}
			}
			
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void verifyCat(String x) throws Exception {
		Config.attente(10);
		Thread.sleep(10000);
		Assert.assertEquals(x, verif_home.getText());
	}

}
