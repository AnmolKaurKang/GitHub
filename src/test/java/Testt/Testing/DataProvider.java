package Testt.Testing;

import org.testng.annotations.Test;

public class DataProvider {
 
	
	//this is basically used to pass values multiple times for a single test case.
	//we have @Tes where we are passing that values..l.and we have to spwcify a method too dataproivider--1D..2D array
	
	@Test(dataProvider="SearchKEy")
	public void M(int age,String name)
	
	{
		System.out.print("the age is"+age);
	System.out.print("The name is"+name);
		
	}
	@org.testng.annotations.DataProvider(name="SearchKEy")
	public static Object[][] getData(){
		return new Object[][]
				{
				{5,"Anmol"},
				{6,"Ajay"}
				
		
	} ;
	}
	
	
}
