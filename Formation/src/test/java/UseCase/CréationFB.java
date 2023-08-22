package UseCase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class CréationFB {

	public static void main(String[] args) {
		// Chemin
		System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
		//Ouvrir navigateur
		WebDriver driver =new ChromeDriver();
		//maximiser la fentere
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		//Ouvrir Url
		driver.get("https://www.facebook.com/login.php");
		//Déclaration des elements 
		WebElement bouton1 ;
		bouton1=driver.findElement(By.xpath("//a[normalize-space()='Créer nouveau compte']"));
		bouton1.click();
		WebElement prenom, nomfamille , mail,cmail ,mdp,ljour,lmois,lannée,bradio,seconnecter;
		//Identification variable
		prenom=driver.findElement(By.xpath("//input[@name='firstname']"));
		nomfamille=driver.findElement(By.xpath("//input[@name='lastname']"));
		mail=driver.findElement(By.xpath("//input[@name='reg_email__']"));
		cmail=driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
		mdp=driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
		ljour=driver.findElement(By.id("day"));
		lmois=driver.findElement(By.id("month"));
		lannée=driver.findElement(By.id("year"));
		bradio=driver.findElement(By.className("_8esa"));
		seconnecter=driver.findElement(By.name("websubmit"));
		
		bradio=driver.findElement(By.className("_8esa"));
		seconnecter=driver.findElement(By.name("websubmit"));

		//Actions
		prenom.sendKeys("jinene");
		nomfamille.sendKeys("hedfi");
		mail.sendKeys("jinenehedfi9@gmail.com");
		Actions action=new Actions (driver);
		action.keyDown(mail,Keys.CONTROL).sendKeys("a").sendKeys("c").keyUp(Keys.CONTROL).perform();
		action.keyDown(cmail,Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
		mdp.sendKeys("password23");
		Select select=new Select(ljour);
		select.selectByValue("8");
		Select select1=new Select(lmois);
		select1.selectByValue("2");
		Select select2=new Select(lannée);
		select2.selectByValue("1990");
		bradio.click();
		seconnecter.click();
		

	}

}
