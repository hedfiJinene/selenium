package UseCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement {

	public static void main(String[] args) throws InterruptedException {
		//Chemin Chrome
		System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
//Ouvrir l'url
		WebDriver driver = new ChromeDriver();
		//Maximiser la fenetre
		driver.manage().window().maximize();
		//Accéder à l'url
		driver.get("https://demoqa.com/menu");
		//Sleep
				Thread.sleep(5000);
				//Déclaration des élément
				WebElement bouton;
				//Identification
				bouton= driver.findElement(By.xpath("//*[@id=\"nav\"]/li[2]/a"));
				
				//Action
				Actions action=new Actions (driver); 
				action.moveToElement(bouton).perform();
		
	}

}
