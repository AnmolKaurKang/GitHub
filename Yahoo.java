package Testt.Testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import junit.framework.Assert;

import java.util.*;

@Listeners(Testt.Testing.Listeners.class)
public class Yahoo extends BaseTest{

	//WebDriver driver;
	//Priority can be only assigned to @TEST
/*@Test
	public void initializeBrowser ()
	{ 
	try {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\10694225\\Desktop\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
	DesiredCapabilities ds=new DesiredCapabilities();
	//wrong----- key-value  pair ds.setBrowserName("CHROME------");
	ds.setCapability(CapabilityType.BROWSER_NAME, "CHROME---");//--no effect--???
	ds.setCapability("BROWSER_NAME","CHROME");
	
String BrowserVersion = null;
	String bs=(String) ds.getCapability(BrowserVersion);
	System.out.print(bs);
	
	ds.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
	ChromeOptions opt=new ChromeOptions();

	opt.merge(ds);
		driver=new ChromeDriver();
		LogEntries entry = driver.manage().logs().get(LogType.BROWSER);
        // Retrieving all log 
        java.util.List<LogEntry> logs= entry.getAll();
        // Print one by one
        for(LogEntry e: logs)
        {
        	System.out.println(e);
        }
        
        }//Logger log--- concept!!!!!
        
	 
	
	catch(Exception e)
	{
		System.out.print("The Exception is"+e);
	}

	}*/
@Test(priority=-1,description="Testing Landing PAge",alwaysRun=true)
//alwaysRun = true, dependsOnMethods = "testStep_1", description = "Enter the names, and verify that they are appearing correctly ")
	public void signUp()
	{   driver.navigate().to("https://www.yahoo.com");
		driver.findElement(By.cssSelector("div[title='Sign In']")).click();
		
	}
@Test(priority=0)
public void Fail()
{
	Assert.assertEquals(false,true);}

@Test(priority=1)
public void nterEmail()
{
	WebElement id=driver.findElement(By.id("login-username"));
	Actions a =new Actions(driver);
	id.sendKeys("anmol.kang@yahoo.com");
	WebElement SignInButton=driver.findElement(By.id("login-signin"));
	a.doubleClick(SignInButton);//----didnt perform anything!!!!
	a.doubleClick(SignInButton).build().perform();
	
	}
@Test(priority=2)
public void accountVerification()
{
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	if(driver.findElement(By.className("fail-challenge")).isDisplayed())
	{
		System.out.print("Account is Deactivated");
	}
	}

@Test
public void closeBrowser()
{
	driver.quit();}


}
