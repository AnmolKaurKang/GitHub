package Testt.Testing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class List extends BaseTest {

	@Test
	public void getElements()
	{
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("siri");
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		java.util.List<WebElement> li= driver.findElements(By.className("s-suggestion")); //storing values in List
		for(WebElement l:li)//retrieving
		{
			if(l.equals("siril"))
			{
			//System.out.print("values"+l);
				l.click();
			}
			else
			{
				System.out.print("No such element in Dropdown");
			}
		}
		
		
		
	}
	@Test
	public void Sorted() throws InterruptedException
	{
		driver.get("https://www.amazon.in");
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("ab");
		Thread.sleep(5000);
		java.util.List<WebElement> li= driver.findElements(By.className("s-suggestion"));
		ArrayList<String> arr=new ArrayList<String>();
		//got error------The type List is not generic; it cannot be parameterized with arguments <WebElement>
		System.out.println("The original values in List are:");
		for(int i=0;i<li.size();i++)
		{
			String text=li.get(i).getText();
			arr.add(text);
		}
		
		//After Sorting-----
		System.out.println("The sorted values in List are:");
		/* no li=	new ArrayList<WebElement>();
		 no Collections.sort(li); ///this is not working
	
		//store the vlaues of List in Array
		String[] s=new String[li.size()];
		for(int i=0;i<li.size();i++)
{
			s[i]=li.get(i).getText();
	}
		Collections.sort(s);*/
	//	ArrayList<String> sort=new ArrayList(Arrays.asList(li));
		//ArrayList<String> sort=new ArrayList<String>();//return--Object
		Collections.sort(arr);
		//System.out.print(sort);
		for(String sorted:arr)
		{
			System.out.print(sorted);
		}
			
	}
		
	
	
    @Test
	private void noDuplicate() {
    	driver.get("https://www.amazon.in");
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("ab");
		java.util.List<WebElement> li= driver.findElements(By.className("s-suggestion"));
		//HAshSet
		HashSet<String> hs=new HashSet<String>();
		
	//	System.out.print(hs);
		
		
	}
}
