package testorg;
//Library
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.test.Base.Base;
import org.testing.pages.signin;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC3 extends Base
{
	 
	

	 @Test
	 public void signin() throws InterruptedException
	 {
		 WebElement signin=driver.findElement(By.id(pr.getProperty("Signin")));
			signin.click();
			
			signin s=new signin(driver,pr);
			s.login("kimomohite@gmail.com", "kimo7090");
	   
	  
		   WebElement Library1=driver.findElement(By.id(pr.getProperty("Library")));
		   Library1.click();
		   Thread.sleep(3000);
	 }

	 
}
