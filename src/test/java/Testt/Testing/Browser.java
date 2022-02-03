package Testt.Testing;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Browser {
	
WebDriver driver;


//String path="C:\\Users\\10694225\\Desktop\\Testing\\src\\test\\java\\Test\\Testing\\data.properties";

	@Test
	public void initializeBrowser()
	{
		//WebDriver driver;
		Properties prop=new Properties();;


		//String path="C:\\Users\\10694225\\Desktop\\Testing\\src\\test\\java\\Test\\Testing\\data.properties";
		try {
		InputStream fis = new FileInputStream("C:\\Users\\10694225\\Desktop\\Testing\\src\\test\\java\\Test\\Testing\\data.properties");
		 }
		catch(Exception e)
		{
			System.out.print(e);
			}
		String browser = prop.getProperty("browser");

		if(browser.equals("chrome"))
	
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\10694225\\Desktop\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
	 driver=new ChromeDriver();
	
	}
	
	else if(browser.equals("Firefox"))
	{ //code
	
	//...
	}
	
	else if(browser.equals("IE"))
	{
		///
	}
	else
	{
		////
	}
	}
	
@Test
public void Close()
{
	//driver.close();--only that current window
	driver.quit();
	}
	
	
}

