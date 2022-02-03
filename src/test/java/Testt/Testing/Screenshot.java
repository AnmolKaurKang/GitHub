package Testt.Testing;

import java.io.File;
import java.io.IOException;

import org.apache.logging.log4j.core.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
//import org.apache.commons.io.FileUtils;

public class Screenshot extends BaseTest  {
//method to take screenshot
	
	public static void Screenshott (String name) throws IOException
	{
		//TakesScreenshot ts=((TakesScreenshot)driver); //typecasting
	File source=	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); //using the inbuilt function---
	try
	{
	//File dest=new File("C:\\Users\\10694225\\Desktop\\Testing\\Screenshot\\");
			//org.apache.commons.io.FileUtils.copyFile(source,dest+"_"+" "+".png");
		org.apache.commons.io.FileUtils.copyFile(source,new File("C:/Users/10694225/Desktop/Testing/Screenshot/"+name+".png"));
			}
	catch(Exception e)
	{
		System.out.print(e);
	}
	}
}
