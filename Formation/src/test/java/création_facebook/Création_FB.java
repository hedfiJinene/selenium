package création_facebook;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Création_FB {
	WebDriver driver; 
	@Given("Ouvrir navigateur")
	public void ouvrir_navigateur() {
	    System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
	    
	}

	@Given("Ouvrir URL")
	public void ouvrir_url() {
		driver.get("https://www.facebook.com/login.php");
		
		@When("Cliquer sur le bouton créer un nouveau compte")
		public void cliquer_sur_le_bouton_créer_un_nouveau_compte() {
			WebElement bouton1 ;
			bouton1=driver.findElement(By.xpath("//a[normalize-space()='Créer nouveau compte']"));
			bouton1.click();
			
		    
		}

		@When("Saisir le Prénom {String}")
		public void saisir_le_prénom (String string) {
			WebElement prenom;
			prenom=driver.findElement(By.xpath("//input[@name='firstname']"));
			prenom.sendKeys("jinene");
		}

		@When("Saisir le nom {String}")
		public void saisir_le_nom() {
			WebElement nom , 
			nom=driver.findElement(By.xpath("//input[@name='lastname']"));
			nom.sendKeys("hedfi");
			
		}

		@When("Saisir le mail{String}")
		public void saisir_le_mail() {
		   WebElement mail ,
		   mail=driver.findElement(By.xpath("//input[@name='reg_email__']"));
		   mail.sendKeys("jinenehedfi9@gmail.com");
		}

		@When("Confirmer le mail{String}")
		public void confirmer_le_mail() {
		    
		}

		@When("Saisir le mot de passe")
		public void saisir_le_mot_de_passe() {
		    
		}

		@When("Saisir jour naissance")
		public void saisir_jour_naissance() {
		   
		}

		@When("Saisir mois naissance")
		public void saisir_mois_naissance() {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}

		@When("Saissir année naissance")
		public void saissir_année_naissance() {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}

		@When("Choisir le bouton radio")
		public void choisir_le_bouton_radio() {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}

		@Then("Cliquer sur s'inscrire")
		public void cliquer_sur_s_inscrire() {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}

	}

	private void saisir_le_prénom() {
		// TODO Auto-generated method stub
		
	}

}
