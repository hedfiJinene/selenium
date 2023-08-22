package UseCase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class Listedéroulante {

	public static void main(String[] args) {
		
				// Chemin Chrome driver
				System.setProperty("webdriver.chrome.driver","src/test/ressources/chromedriver.exe");
				//Ouvrir navigateur
				WebDriver driver= new ChromeDriver();
				//maximiser la fenetre
			driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
				//Accéder à l'url
				driver.get("https://demoqa.com/select-menu");
				WebElement listedéroulante;
				listedéroulante= driver.findElement(By.id("oldSelectMenu"));
				Select Select= new Select (listedéroulante);
				Select.selectByValue("7");
						
						

	}

}
