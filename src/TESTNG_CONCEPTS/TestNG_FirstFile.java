package TESTNG_CONCEPTS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.testng.Assert;

 
    
 

public class TestNG_FirstFile {
	
	
	@Test
public void verifyTitle() {
		
System.setProperty("webdriver.chrome.driver","D:\\\\\\\\Selenium_Student_SW\\\\\\\\Drivers\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");  // Open Browser 
		
WebDriver driver = new ChromeDriver();     // Instant Browser

	
  
	driver.navigate().to("http://demo.guru99.com/test/newtours/");    // Open Web Page



	 String expectedTitle = "Welcome: Mercury Tours";
     String actualTitle = driver.getTitle();
     Assert.assertEquals(actualTitle, expectedTitle);
     
     System.out.println(driver.getTitle());

     driver.close();



	}
	

}
