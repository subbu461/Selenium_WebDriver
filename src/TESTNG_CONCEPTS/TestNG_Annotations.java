package TESTNG_CONCEPTS;


import org.testng.annotations.Test;


public class TestNG_Annotations {


	// Test method: It is used  to execute methods in the class 
	
	@Test
	public void login () {
		
		
		
		System.out.println ("Login Completed :::");
		
		
	}
	
	// Dependson Methods @Test ::: Will get Executed only if in case of "login" get Passed otherwise it will Skip This Method
	@Test(dependsOnMethods="login")
	
public void logout () {
		
		
	System.out.println ("Logout Completed :::");
		
		
		
	}
	
	
	
	
	
	
}
