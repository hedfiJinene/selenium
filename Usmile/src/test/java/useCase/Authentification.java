package useCase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authentification {

	public static void main(String[] args) throws InterruptedException {
		// Chemin Chrome
		System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
		//Ouvrir navigateur
		WebDriver driver = new ChromeDriver();
		// Maximiser la fenetre 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		//Ouvrir l'url
		driver.get("https://dashboard.u-smile.app/login");
		
		//Déclaration variable
		WebElement Email , password, bouton ;
		//Identification variable
		Email = driver.findElement(By.xpath("//*[@id=\"input-3\"]"));
		password =driver.findElement(By.xpath("//*[@id=\"input-5\"]"));
		bouton =driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div/div/div[2]/div/div[3]/form/div/div[2]/button"));
		//Action
		Email.sendKeys("derouichewifek88@gmail.com");
		password.sendKeys("$2y$10$8JbJh84fJAOAer01mzFbPOpEuzw/n3eKmLiKdATT1fQvLFLWOucXq");
		bouton.click();

			
						
						
		WebElement boutonprod ;
		boutonprod = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div/main/div[1]/div[2]/div[2]/button/span[3]"));
		boutonprod.click();
		
		WebElement boutonpioch ;
		boutonpioch= driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div/main/div[2]/div[2]/div[1]/div[2]/button/span[3]"));
		boutonpioch.click();
		
		WebElement Arret;
		Arret = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div/div/div[2]/div/div/div[2]/div/button[2]/span[3]"));
		Arret.click();
		
		WebElement Arretbouton;
		Arretbouton=driver.findElement(By.xpath("/html/body/div[5]/div/div[6]/button[1]"));
		Arretbouton.click();
		
		
		
						
						
      

		
		 
		
	}

}
