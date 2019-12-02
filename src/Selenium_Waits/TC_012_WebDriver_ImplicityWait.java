package Selenium_Waits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import  java.util.concurrent.TimeUnit;


public class TC_012_WebDriver_ImplicityWait {
	
	public static void   main(String arg[])   {
		
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium-Training\\Drivers\\chromedriver_win32\\chromedriver.exe");
		
	 	
	 	WebDriver driver= new ChromeDriver();  
	
	 	  
	 	
		 
		driver.navigate().to("http://www.SoftwareTestingMaterial.com");    // navigate to URL:
		
		

	 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);   // Implicity wait
	 	
		
		driver.manage().window().maximize();	  // maximize window 
		
		
		driver.quit();                          // Close the window
		
		
		
	}
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
