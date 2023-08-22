package UseCase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CompteFB {

	public static void main(String[] args) {
		// Chemin Chrome driver
		System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
		//Ouvrir navigateur 
		WebDriver driver= new ChromeDriver();
		//maximiser la fenetre 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		//Accéder à l'Url 
		driver.get("https://www.facebook.com/login.php");
		WebElement bouton1;
		bouton1 = driver.findElement(By.xpath("//*[@id=\"login_link\"]/div[3]/a"));
		
		bouton1.click();
		//Déclaration des variables
		WebElement prenom, nomfamille , gsm ,mdp,ljour,lmois,lannée,bradio,seconnecter;
		
		//Identification variables
		prenom = driver.findElement(By.name("firstname"));
		nomfamille=driver.findElement(By.name("lastname"));
		gsm=driver.findElement(By.name("reg_email__"));
		mdp=driver.findElement(By.name("reg_passwd__"));
		ljour=driver.findElement(By.id("day"));
		lmois=driver.findElement(By.id("month"));
		lannée=driver.findElement(By.id("year"));

		bradio=driver.findElement(By.className("_8esa"));
		seconnecter=driver.findElement(By.name("websubmit"));
		
		
		//Actions
		prenom.sendKeys("jinene");
		nomfamille.sendKeys("hedfi");
		gsm.sendKeys("28887787");
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
