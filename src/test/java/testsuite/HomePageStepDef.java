package testsuite;

import org.openqa.selenium.chrome.ChromeDriver;

import helper.Config;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.HomePage;

public class HomePageStepDef {
	
	@Given("utilisateur accede a la page d accueil Mabrouk")
	public void utilisateur_accede_a_la_page_d_accueil_mabrouk() throws Exception {
	    Config.driver = new ChromeDriver();
	    Config.confChrome();
	    Config.maxWin();
	    String url= "https://mabrouk.tn/";
	    Config.driver.get(url);
	    Thread.sleep(5000);
	}

	@When("utilisateur survole la souris sur le menu {string} et clique sur le sous menu {string}")
	public void utilisateur_survole_la_souris_sur_le_menu_et_clique_sur_le_sous_menu(String string, String string2) throws Exception {
		HomePage page = new HomePage();
		page.choisir_categorie(string, string2);
	   
	}

	@Then("utilisateur se redirige vers la page {string}")
	public void utilisateur_se_redirige_vers_la_page(String string) throws Exception {
		HomePage page = new HomePage();
		page.verifyCat(string);
	    
	}

}
