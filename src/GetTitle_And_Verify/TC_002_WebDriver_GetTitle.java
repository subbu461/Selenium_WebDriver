package GetTitle_And_Verify;



import org.openqa.selenium.WebDriver;
// We are using using chrome for webdriver....

import org.openqa.selenium.chrome.ChromeDriver;

public class TC_002_WebDriver_GetTitle {

	public static void main (String args[])  {
		
		// Declaration and instantiation of an object and methods 
		
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium-Training\\Drivers\\chromedriver.exe");
		
		 
		WebDriver  driver = new ChromeDriver();
		  
		// Variables 
		
		 
		String URL = "http://demo.guru99.com/test/newtours/";
		String expectedTitle="Welcome: Mercury Tours";
		String actualTitle="";
		
		
		
		
		// Launch Chrome and direct it to URL 
		
		driver.get(URL);
		
		System.out.println("Test Started :");
		
		// get The actual value of the Title
		
		actualTitle = driver.getTitle();
		
		  System.out.println(actualTitle);
		
		// Compare the Actual result with Expected result and Print Result
		
		
		if (actualTitle.contentEquals(expectedTitle))
		{
			
		System.out.println("Test passed:");	
			
		}
		
		else 
			
		{
			
			System.out.println("Test Failed:");
			
		}
		
		
		
		
		driver.close();
		System.out.println("Test Ended");
		
		
	}
	
	
	
	
	
	
	
}
