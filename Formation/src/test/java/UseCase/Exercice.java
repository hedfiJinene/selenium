package UseCase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercice {

	public static void main(String[] args) {
		//Chemin
		System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
		//Ouvrir navigateur
		WebDriver driver= new ChromeDriver();
		//maximer la fenetre 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		//Ouvrir l'url
		driver.get("https://www.youtube.com/");
		//Déclaration des variables
		WebElement barrerecherche , boutton ;
		//Identification 
		barrerecherche= driver.findElement(By.name("search_query"));
		boutton=driver.findElement(By.id("search-icon-legacy"));
		//action
		barrerecherche.sendKeys("Tunisie");
		boutton.click();

	}

}
