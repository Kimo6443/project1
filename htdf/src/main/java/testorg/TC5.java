package testorg;

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

public class TC5 extends Base
{
	
	 @Test
	 public void signin() throws InterruptedException
	 {
		 WebElement signin=driver.findElement(By.id(pr.getProperty("Signin")));
			signin.click();
			
			signin s=new signin(driver,pr);
			s.login("kimomohite@gmail.com", "kimo7090");
	   
	   WebElement video=driver.findElement(By.id(pr.getProperty("videotitle")));
	   video.click();
	   Thread.sleep(10000);
	   WebElement subs=driver.findElement(By.id(pr.getProperty("subscribe")));
	 subs.click();//paper-button[@aria-label='Subscribe']
	 }
	 

	
}
