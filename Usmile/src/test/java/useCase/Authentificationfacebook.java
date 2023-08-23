package useCase;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authentificationfacebook {

	public static void main(String[] args) throws InterruptedException {
		//Chemin Chrome
		System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
		//Ouvrir navigateur
		WebDriver driver = new ChromeDriver();
		//maximiser la page
		driver.manage().window().maximize();
		//Ouvrir l'url
		driver.get("https://fr-fr.facebook.com/");
		
		Thread.sleep(5000);
		//Déclaration des variables 
		
		WebElement Email , password , bouton;
		Email = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		password = driver.findElement(By.xpath("//*[@id=\"pass\"]"));
		bouton = driver.findElement(By.xpath("//*[@id=\"u_0_5\"]"));
		Email.sendKeys("jinenehedfi896@gmail.com");
		password.sendKeys("06242835hedfijinene");
		bouton.click();
		Thread.sleep(5000);
		
		
		
		
		
		
		

	}

}
