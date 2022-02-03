package Testt.Testing;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Parameterr {  //call it from tesng.xml  not directly here.
	//1 paarameter-- 1 key vakue pair
	@Parameters({"email","names"})
	
	@Test
     public void nameAndEmail(String email,String name)
    {
		System.out.print("The name is"+name);
		System.out.print("The Email is"+email);
		
		
    }
}
