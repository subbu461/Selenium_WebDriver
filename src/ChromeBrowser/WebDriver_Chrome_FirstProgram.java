package ChromeBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.ie.InternetExplorerDriver;
public class WebDriver_Chrome_FirstProgram {
	  
	        
	  
	
	public static void main(String arg[]) throws Exception  {
		
		
		 
		System.setProperty("webdriver.ie.driver","D:\\Selenium-Training\\Drivers\\chromedriver.exe");	
		
		WebDriver  driver = new InternetExplorerDriver();
		driver.manage().window().maximize();                        //  maximize window 

		String expectedTitle = "Welcome: Mercury1 Tours";
		String actualTitle = "";
		  
	// Launch Browser and Base URL 
		
		driver.get("http://demo.guru99.com/test/newtours/");
		
		// Get Actual Title 
		actualTitle =driver.getTitle();
		System.out.println(actualTitle);
		// Compare Actual Title with Expected Title and Print Results
		
		
		if (actualTitle.contentEquals(expectedTitle)) {
			
			System.out.println("Test Passed:");
			
			 
		}
		else {
			System.out.println("Test Failed:");
			
		}
		
		// To close Particular window in the Browser 
	driver.close();
	
	// To close all windows in the Browser
	
	driver.quit();	

	}

}
