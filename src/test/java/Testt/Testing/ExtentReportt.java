package Testt.Testing;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;


 public class ExtentReportt {
	
	
	public ExtentReports report=new ExtentReports();
	//public static ExtentSparkReporter reporter;
	@BeforeTest
	public  ExtentReports ExtentReport()
	{
	
    //String path= System.getProperty(("user.dir")+"\\REPORTS\\Extent.html");
    //report=new ExtentReports();
    ExtentSparkReporter reporter=new ExtentSparkReporter(("user.dir")+"\\REPORTS\\Extent.html");
	
		reporter.config().setReportName("TEST CASES RESULT");
	
	reporter.config().setDocumentTitle("SELENIUM PRACTICE");
	//ExtentReports extent=new ExtentReports();
	
		
	
	
	report.attachReporter(reporter);
	//report.init(path, true);
	return report;
	
	
		
	
	
	
	
	
}

	
}
