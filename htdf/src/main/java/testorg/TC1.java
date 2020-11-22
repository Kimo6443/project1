package testorg;
import java.io.IOException;

//youtube signin,trending and signout
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.test.Base.Base;
import org.testing.pages.signin;
import org.testing.utilities.Screenshot;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.yaml.snakeyaml.tokens.Token.ID;


public class TC1 extends Base
{ 


@Test
public void sign() throws InterruptedException, IOException
{
	WebElement signin=driver.findElement(By.id(pr.getProperty("Signin")));
	signin.click();
	
	signin s=new signin(driver,pr);
	s.login("kimomohite@gmail.com", "kimo7090");
    
	WebElement subscriptions=driver.findElement(By.id(pr.getProperty("trending")));
	   subscriptions.click();
	   Thread.sleep(3000);
	   
	   Screenshot.takescreenshot(driver, "/htdf/src/main/java/testorg/first.png");

}


}
