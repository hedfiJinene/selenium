package useCase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProductionSmile {

	public static void main(String[] args) {
		//chemin Chrome
		System.setProperty("webdriver.chrome.driver","src/test/ressources/chromedriver.exe" );
		//Ouvrir navigateur
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		//Ouvrir URL
		driver.get("https://dashboard.u-smile.app/televendeurs");
		//Déclaration variable
		WebElement production;
		//Identification variable
		production =driver.findElement(By.className("v-btn__content"));
		production.click();
	}

}
