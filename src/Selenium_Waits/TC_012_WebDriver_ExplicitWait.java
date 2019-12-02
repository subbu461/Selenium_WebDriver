package Selenium_Waits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;



public class TC_012_WebDriver_ExplicitWait {
	
public static void   main(String arg[])   {
		
		
	System.setProperty("webdriver.chrome.driver","D:\\Selenium-Training\\Drivers\\chromedriver_win32\\chromedriver.exe");
	
		
	 	WebDriver driver= new ChromeDriver();  
	
	 	   
	 	
		  
		driver.navigate().to("http://www.SoftwareTestingMaterial.com");    // navigate to URL
	 	
		
		driver.manage().window().maximize();	  // maximize window 
		
		
		
		WebDriverWait wait = new WebDriverWait(driver,15);
		
		
		wait.until(ExpectedConditions.titleIs("Software Testing Material - A site for Software Testers"));
			
		
		
		
	 driver.quit();                          // Close the window
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
