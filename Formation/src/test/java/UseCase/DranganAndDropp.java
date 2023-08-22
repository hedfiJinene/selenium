package UseCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class DranganAndDropp {


	public static void main(String[] args) throws InterruptedException {
		// Chemin Chrome
		System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
//Ouvrir navigateur
		WebDriver driver= new ChromeDriver();
		//maximiser la fenetre
		driver.manage().window().maximize();
		//Accéder à l'url
		driver.get("https://demoqa.com/droppable");
		//Sleep
		Thread.sleep(5000);
		//Déclaration des élément
		WebElement bouton, bouton2;
		//Identification
		bouton= driver.findElement(By.id("draggable"));
		bouton2= driver.findElement(By.id("droppable"));
		//Action
		Actions action=new Actions (driver); 
		action.dragAndDrop(bouton, bouton2).perform();
		//Vérification résultat
		 String actualText = bouton2.getText();
	        String expectedText = "Dropped!";
	        Assert.assertEquals(expectedText, actualText);
	        System.out.println("Test ok");
	        
		
		
		
		
		
	}

}
