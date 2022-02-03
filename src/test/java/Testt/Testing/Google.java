package Testt.Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Google extends BaseTest{
	
	@Test(priority=1)
	public void verifyTitle()
	{
		driver.get("https://www.google.com");
		String title=driver.getTitle();
		if(title.equals("Google"))
		{
			System.out.print("The Tile is Correct");
		}
		else
			{System.out.print("The Tile is Not Correct");	
			}
			
	//driver.navigate().to("https://www.google.co.in");
	
	}
	
	@Test(priority=2)
	public void nextGen()
	{
		driver.get("https://www.nextgenerationautomation.com");
		driver.findElement(By.xpath("//span[text()='Log In / SignUp']")).click();
		
	}
	
	@Test(priority=3)
	public void generic(String Locator)
	{
		//  Example: locatorPath = "xpath_//table[@class='dataTable']/tbody/tr"
	}
	
	@Test()
	public void googleSearch()
	{
		boolean a=driver.findElement(By.name("btnK")).isDisplayed();
		
	if(a)
	{
		System.out.println("Google Search is Displyed");
	}
	else
	{
		System.out.println("Google Search is not displayed");
	}
	}
	
	@Test
	public void enterData()
	{ driver.get("https://www.google.com");
		WebElement search=driver.findElement(By.name("q"));
		search.isDisplayed();
		search.sendKeys("SELENIUM QUESTIONS");
	}
	
	@Test
	public void searchButton()
	{ driver.get("https://www.google.com");
		WebElement searchButton=driver.findElement(By.cssSelector("div.CcAdNb"));
		Boolean a1=searchButton.isDisplayed();
		Boolean a2=searchButton.isEnabled();
		if(a1)
		{
			System.out.println(" Search Button is displayed");
		}
		else
		{
			System.out.println(" Search Button is not displayed");
		}
		
		if(a2)
		{
			System.out.println(" Search Button is enabled");
		}
		else
		{
			System.out.println(" Search Button is not enabled");
		}
		
		/*if(a1 && a2)
		{
			searchButton.click();
		}*/
	}
	@Test
	public void clickOnSearch()
	{
		driver.findElement(By.cssSelector("div.CcAdNb")).click();
	}

}
