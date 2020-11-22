package org.testing.pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.test.Base.Base;


public class signin 
{
	ChromeDriver driver;
	Properties pr;
	public signin(ChromeDriver driver,Properties pr)
	{
		this.driver=driver;
		this.pr=pr;
	}
	
public void login(String username,String password) throws InterruptedException
{
	
  
	WebElement username1=driver.findElement(By.id(pr.getProperty("username")));
	username1.sendKeys(username);
 
  
  WebElement nextbutton=driver.findElement(By.id(pr.getProperty("next")));
  nextbutton.click();
  Thread.sleep(3000);
  
  WebElement password1=driver.findElement(By.id(pr.getProperty("password")));
  password1.sendKeys(password);
 
  Thread.sleep(3000);
  
  WebElement nextbutton1=driver.findElement(By.id(pr.getProperty("next2")));
  nextbutton1.click();
  Thread.sleep(3000);
}
}
