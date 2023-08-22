package UseCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demoboutton {

	public static void main(String[] args) throws InterruptedException {
		// Chemin Chrome driver
		System.setProperty("webdriver.chrome.driver","src/test/ressources/chromedriver.exe");
		//Ouvrir navigateur
		WebDriver driver= new ChromeDriver();
		//maximiser la fenetre
		driver.manage().window().maximize();
		//Accéder à l'url
		driver.get("https://demoqa.com/buttons");
		//Sleep
		Thread.sleep(5000);
		//Déclaration des élément
		WebElement bouton, bouton2;
		
		//Identification des éléments
		bouton= driver.findElement(By.xpath("//*[@id=\"doubleClickBtn\"]"));
		bouton2= driver.findElement(By.xpath("//*[@id=\"rightClickBtn\"]"));
		//Action
		Actions action =new Actions(driver);
		action.doubleClick(bouton).perform();
		action.contextClick(bouton2).perform();
		
		//vérification résultat
		
		WebElement message;
		WebElement message2;
		
		message= driver.findElement(By.id("doubleClickMessage"));
		message2= driver.findElement(By.id("rightClickMessage"));
		
		String texte;
		String texte2;
		
		texte= message.getText();
		texte2= message.getText();
		
		
		
		
		

	}

}
