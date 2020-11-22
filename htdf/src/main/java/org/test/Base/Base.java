package org.test.Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base 
{
	
		
		public ChromeDriver driver=new ChromeDriver();
		public Properties pr;
		
	@BeforeMethod
	public void openBrowser1() throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Kishor\\\\Desktop\\\\chromedriver.exe");
	    File f=new File("../htdf/objectsrepo.properties");
	    FileInputStream fi=new FileInputStream(f);
	     pr=new Properties();
	     pr.load(fi);
	     
	    driver.get("https://www.youtube.com/");
	    driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void signout() throws InterruptedException
	{
		WebElement w5=driver.findElement(By.id("avatar-btn"));
		w5.click();
		Thread.sleep(3000);
		WebElement w6=driver.findElement(By.xpath("//a[@href='/logout']"));
		w6.click();
		driver.close();
	}
}
