package org.testing.pages;

import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.test.Base.Base;

public class videoplay extends Base
{
	ChromeDriver driver;
	Properties pr;
	
	public videoplay(ChromeDriver driver,Properties pr)
	{
		this.driver=driver;
		this.pr=pr;
	}
	
	signin s=new signin(driver,pr);
	s.
}
