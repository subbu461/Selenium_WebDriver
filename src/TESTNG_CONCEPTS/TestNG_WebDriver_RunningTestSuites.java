package TESTNG_CONCEPTS;

import org.testng.annotations.*;



public class TestNG_WebDriver_RunningTestSuites {
	
	
	@Test(groups="Regresssion",priority=2)
	public void  method1()  {
		
		
		System.out.println("This method is for method1");
		
			
	}
	
	@Test(groups="Sanity",priority=1)
public void  method2()  {
		
		
		System.out.println("This method is for method2");
		
			
	}
	
@Test(groups="Regresssion",priority=1)
public void  method3()  {
	
	
	System.out.println("This method is for method3");
	
		
}
	
	
@Test(groups="Sanity",priority=2)	
	
	
public void  method4()  {
	
	
	System.out.println("This method is for method4");
	
		
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
