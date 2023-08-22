package UseCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class Authentification {

	public static void main(String[] args) throws InterruptedException {
		// Chemin de chrome driver
		System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
        
		//ouvrir navigateur
		WebDriver navigateur = new ChromeDriver();
		//maximise la fenetre 
		navigateur.manage().window().maximize();
		
		//Ouvrir l'URL
		navigateur.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//Sleep
		Thread.sleep(5000);
		
		//Déclaration des éléments
		WebElement user, mdp, bouton;
		
		//Identification des éléments
		user = navigateur.findElement(By.name("username"));
		mdp = navigateur.findElement(By.name("password"));
	    bouton = navigateur.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));

				//Action
				user.sendKeys("admin");
				mdp.sendKeys("admin123");
				bouton.click();
				
				//Sleep
				Thread.sleep(5000);
				
				//vérification des résultats attendu
				WebElement profil;
				profil = navigateur.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/p"));
				
				
				
				
		
	}

}
