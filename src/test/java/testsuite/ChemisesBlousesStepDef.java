package testsuite;

import org.openqa.selenium.chrome.ChromeDriver;

import helper.Config;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.ChemisesBlousesPage;

public class ChemisesBlousesStepDef {
	@Given("acceder a la page du Chemises & Blouses")
	public void acceder_a_la_page_du_chemises_blouses() {
		Config.driver = new ChromeDriver();
	    Config.confChrome();
	    Config.maxWin();
	    String url= "https://mabrouk.tn/categorie-produit/vetements-femmes/chemises-blouses/";
	    Config.driver.get(url);
	    
	}

	@When("utilisateur clique sur le produit {string}")
	public void utilisateur_clique_sur_le_produit(String string) throws Exception {
		ChemisesBlousesPage page = new ChemisesBlousesPage();
		page.cliquer_produit(string);
	    
	}

	@Then("utilisateur sur la page {string}")
	public void utilisateur_sur_la_page(String string) throws Exception {
		ChemisesBlousesPage page = new ChemisesBlousesPage();
		page.verifyprod(string);
	    
	}


}
