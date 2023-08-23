package exemple_cucumber;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Authentificationn {
	WebDriver driver; 
	
	@Given("Ouvrir navigateur")
	public void ouvrir_navigateur() {
	    System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
	    driver.manage().window().maximize();
	    driver.manage().timeouts()
	}

	@Given("Ouvrir URL")
	public void ouvrir_url() {
	    
	}

	@When("Saisir login")
	public void saisir_login() {
	   
	}

	@When("Saisir mot de passe")
	public void saisir_mot_de_passe() {
	    
	}

	@When("Cliquer sur Entrer")
	public void cliquer_sur_entrer() {
	    
	}

	@Then("Vérifier le profil")
	public void vérifier_le_profil() {
	   
	}

}
