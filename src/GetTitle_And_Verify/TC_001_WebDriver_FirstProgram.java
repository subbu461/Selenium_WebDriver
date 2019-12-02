package GetTitle_And_Verify;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

    
public class TC_001_WebDriver_FirstProgram { 
	
	public static void main ( String arg[])  {
		
	// Declaration and installation of objects and Variables 
		 
		  
		System.setProperty("webdriver.chrome.driver","D:\\Selenium-Training\\Drivers\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
		
		String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = "";
		
	// Launch Browser and Base URL 
		
		driver.get("http://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		
		
		// Get Actual Title 
		actualTitle =driver.getTitle();
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
