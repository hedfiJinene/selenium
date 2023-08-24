package exemple_cucumber;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Authentificationn {
	WebDriver driver; 
	
	@Given("Ouvrir navigateur")
	public void ouvrir_navigateur() {
	    System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		
	}

	@Given("Ouvrir URL")
	public void ouvrir_url() {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	    
	}

	@When("Saisir login")
	public void saisir_username() {
		WebElement user;
		user = driver.findElement(By.name("username"));
		user.sendKeys("admin");
	}

	@When("Saisir mot de passe")
	public void saisir_mot_de_passe() {
		WebElement mdp;
		mdp = driver.findElement(By.name("password"));
		mdp.sendKeys("admin123");
	}

	@When("Cliquer sur Entrer")
	public void cliquer_sur_entrer() {
		WebElement bouton;
		bouton = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
	    
	}

	@Then("Vérifier le profil")
	public void vérifier_le_profil() {
		WebElement profil;
		profil = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/p"));
	   
	}

}
