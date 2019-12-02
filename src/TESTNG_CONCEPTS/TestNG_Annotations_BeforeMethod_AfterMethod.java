package TESTNG_CONCEPTS;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_Annotations_BeforeMethod_AfterMethod {
	
	
	
	 
	@BeforeMethod
	public void login () {
		   
		System.out.println("LOGIN COMPLETED::");
		
	}
	
	@AfterMethod
public void logout () {
	
	
	
	System.out.println("LOGOUT COMPLETED::");
		
		
	}
	
	@Test(priority=1)
	public void addEmployee()
	
	
	{
		
		System.out.print("ADDED EMPLOYEE SUCCESSFULLY");
	}
	
	@Test(priority=2)
public void delEmployee()
	
	
	{
		
		System.out.print("DELETE EMPLOYEE SUCCESSFULLY");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
