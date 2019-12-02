package TESTNG_CONCEPTS;

import org.testng.annotations.Test;

public class TestNG_GoogleFeaturesMethods {
	
	
	
	
	@Test
	public void loginTest()
	
	{
		//int i=8/0;
		System.out.println("Login Test");
		
	}
	
	
	
	@Test(dependsOnMethods="loginTest")
	public void homePageTest()
	
	{
		 
		
		System.out.println("HomePage Verificcation Test");
		
		
	}
	
	@Test(dependsOnMethods="loginTest")
	public void SearchPageTest()
	
	{
		
		
		System.out.println("Search In Homeage Test");
		
		
	}
	

	@Test(dependsOnMethods="loginTest")
	public void registrationTest()
	
	{
		
		
		System.out.println("registrationPage Test");
		
		
	}


}
