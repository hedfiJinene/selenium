package UseCase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercice2 {

	public static void main(String[] args) {
		// Chemin
		System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
		//Ouvrir navigateur
		WebDriver driver= new ChromeDriver();
		//Maximiser la fenetre
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		//Ouvrir Url
		driver.get("https://google.com/")	;
		//Déclaration des variables
		WebElement barre  ;
		//Identification des variables 
		barre=driver.findElement(By.id("APjFqb"));
		 //Actions
		barre.sendKeys("tunisie");
		barre.sendKeys(Keys.ENTER);
		// Vérification
		String Url_obtenu ;
		 Url_obtenu = driver.getCurrentUrl();
		 if (Url_obtenu.contains("tunisie")) 
			 System.out.println("test ok"); 

		 else
		 
			 System.out.println("test non ok"); 
		 
		 
		
			 
		 
		 
		 

		
	
	}
	

}
