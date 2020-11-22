package testorg;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.test.Base.Base;
import org.testing.utilities.Screenshot;
import org.testing.utilities.logsCapture;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testing 
{
	ChromeDriver driver=new ChromeDriver();
	
	@BeforeMethod
	public void openBrowser1() throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Kishor\\\\Desktop\\\\chromedriver.exe");
	    
	
	  
	    driver.get("https://www.youtube.com/");
	    driver.manage().window().maximize();
	}
	

@Test
public void signin() throws InterruptedException, IOException
{
	WebElement signin=driver.findElement(By.xpath("//paper-button[@aria-label='Sign in']"));
	signin.click();
  WebElement username=driver.findElement(By.xpath("//input[@aria-label='Email or phone']"));
  username.sendKeys("kimomohite@gmail.com");
 
  Thread.sleep(3000);
  //Screenshot.takescreenshot(driver, "D:\\images\\first.png");
  
  logsCapture.takelogs("Testing", "successfull");

}

}
