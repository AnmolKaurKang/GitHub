package Testt.Testing;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BaseTest {
static WebDriver driver;


	@BeforeMethod
	public void initializeBrowser()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\10694225\\Desktop\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	 
	}
	
@AfterMethod
public void Close()
{
	//driver.close();--only that current window
	driver.quit();
	}
	
	
}
