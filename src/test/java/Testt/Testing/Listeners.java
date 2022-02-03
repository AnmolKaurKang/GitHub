package Testt.Testing;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentReporter;

public class Listeners extends ExtentReportt implements ITestListener {
	public ExtentTest test;
	ExtentReportt obj=new ExtentReportt();
	ExtentReports repo= obj.ExtentReport();
	  
	
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		//System.out.println("The method started is"+result.getName());
		//test=repo.createTest(result.getName());
		test=repo.createTest(getClass().getSimpleName());
		
		test.log(Status.INFO,"The Test has Started"+result.getName());
		
		
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.print("The method passed is"+result.getName());
		test.log(Status.PASS,"Teh test has passed"+result.getName());
	
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.print("The method failed is"+result.getName());
		test.log(Status.FAIL,"The methos has failed"+result.getName());
		try {
			System.out.print("taking screenshot");
			
			Screenshot.Screenshott(result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
	
	}

	public void onFinish(ITestContext context) {
		
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

}
