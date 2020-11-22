package org.testing.utilities;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import bsh.org.objectweb.asm.Type;

public class Screenshot 
{//ss requires 2 things-1.driver obj 2.path to save ss

	public static void takescreenshot(ChromeDriver driver,String path) throws IOException
{
	File f=driver.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(f, new File(path));
}
}
