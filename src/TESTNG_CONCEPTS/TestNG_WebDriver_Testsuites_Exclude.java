package TESTNG_CONCEPTS;
import org.testng.annotations.*;

public class TestNG_WebDriver_Testsuites_Exclude {
	
	@Test(groups="sanity")
	public void method1()  {
		
	System.out.println("This is method 1")	;
		
		
	}
	
	@Test(groups="Regression")
	public void method2()  {
		
		System.out.println("This is method 2")	;
			
			
		}
	
	@Test(groups="Functional")
	public void method4()  {
		
		System.out.println("This is method 4")	;
			
			
		}
	
	@Test(groups="Sanity")
	public void method3()  {
		
		System.out.println("This is method 3")	;
			
			
		}

}
