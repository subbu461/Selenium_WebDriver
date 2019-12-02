package TESTNG_CONCEPTS;

import org.testng.annotations.Test;

public class TestNG_InvocationCount {
	
	
	
	@Test(invocationCount=10)
	
	
	public void  printData()  {
		
		int a= 10;
		int b=40;
		
		int c= a+b;
		
		System.out.println("Sum of the two Integers is " + c );
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
