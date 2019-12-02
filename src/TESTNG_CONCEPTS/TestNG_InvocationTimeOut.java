package TESTNG_CONCEPTS;

import  org.testng.annotations.Test;

public class TestNG_InvocationTimeOut {
	
	
	
	@Test(invocationTimeOut=2000)
	
	public void exceptionTimeOut()  {
		
		
		int i=1;
		//int n= 1000;
		
		while(i==1)
		{
			
		System.out.println("Number is :: " + "" + i);	
			
			
		
		}
		
		
		
		
		
		
	}
	
	
	
	
	

}
