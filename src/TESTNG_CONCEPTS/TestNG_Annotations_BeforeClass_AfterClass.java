package TESTNG_CONCEPTS;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNG_Annotations_BeforeClass_AfterClass {
	
	@BeforeClass
	public void login () {
		
		System.out.println("LOGIN COMPLETED::");
		
	}
	
	@AfterClass
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
