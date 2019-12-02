package TESTNG_CONCEPTS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class TestNG_Session_Handling {
	
	
	public static void main (String ...strings)  {
		
		 
		 
		 //First session of WebDriver
		System.setProperty("webdriver.chrome.driver","D:\\\\\\\\Selenium_Student_SW\\\\\\\\Drivers\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");  // Open Browser
	    WebDriver driver = new ChromeDriver();
	    //Goto guru99 site
	    driver.get("http://demo.guru99.com/V4/");
	    
	    
	    //Second session of WebDriver
	    WebDriver driver2 = new ChromeDriver();
	    //Goto guru99 site
	    driver2.get("http://demo.guru99.com/V4/");
		
		
		
		
	}
	
	
	
	
	
	
	

}
