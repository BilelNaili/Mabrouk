package page;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import helper.Config;

public class ChemisesBlousesPage {
	@FindBy (xpath="/html/body/div[5]/div[4]/div[4]/div/div[4]/div/ul/li/div/div[2]/h3/a")
	List <WebElement> prod;
	@FindBy (xpath="/html/body/div[5]/div[4]/div[2]/div/div[1]/div[2]/div[2]/div/div[2]/div/div/h1")
	WebElement verif_prod;
	
	public ChemisesBlousesPage() {
		PageFactory.initElements(Config.driver, this);
	}
	
	public void cliquer_produit (String x) throws Exception {
		Thread.sleep(4000);
		try {
			for(WebElement product : prod) {
				if(product.getText().contains(x)) {
					product.click();
				}
			}
			
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void verifyprod(String abc) throws Exception {
		Thread.sleep(4000);
		Assert.assertEquals(abc, verif_prod.getText());
	}

}
