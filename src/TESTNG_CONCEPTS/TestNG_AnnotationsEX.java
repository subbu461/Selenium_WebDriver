package TESTNG_CONCEPTS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestNG_AnnotationsEX {
	
	public String URL="http://demo.guru99.com/test/newtours/";
	public String driverpath="D:\\\\\\\\Selenium_Student_SW\\\\\\\\Drivers\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe";
	
	public WebDriver driver;


@BeforeTest
	public void open()  {
		
		System.setProperty("webdriver.chrome.driver",driverpath);  // Open Browser 
		

		 driver = new ChromeDriver();     // Instant Browser
		
		
	
		
		  
			driver.navigate().to(URL);    // Open Web Page
		
		
			  System.out.println("Browser should Opened");
		
		  
	}
	
	


  
	@Test
	
public void verifyHomePage()  {
		

	
	 String expectedTitle = "Welcome: Mercury Tours";
     String actualTitle = driver.getTitle();
     Assert.assertEquals(actualTitle, expectedTitle);
     
  
		
     System.out.println("Verified Title is" +driver.getTitle());	
		
		
	}
	
	
	
	@AfterTest

	public void closeBrowser()  {
		
		driver.close();
		   
		   System.out.println("Browser should Closed");

	}

	
	
	
	
}
	
	
	

