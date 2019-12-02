package TESTNG_CONCEPTS;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;


import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org. testng.annotations.Test;

import org.testng.Reporter;


public class TestNG_WebDriver_With_TestNG {
	
	private WebDriver driver;
	
	@BeforeClass
	public void Startup()  {
		
		
		System.setProperty("webdriver.chrome.driver","D:\\\\\\\\Selenium_Student_SW\\\\\\\\Drivers\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");  // Open Browser 
		
		 driver = new ChromeDriver();     // Instant Browser	
		
	}
	
	
	@Test //(description ="OrangeHRM Login")
	
	public void login () throws Exception {
		
		Reporter.log("****TestCaseSteps*******");
		driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
		Reporter.log("1.Application Opened");
		 
		driver.findElement(By.name("txtUserName")).sendKeys("admin");
			Reporter.log("2.Typing UserName");	
		 
		driver.findElement(By.name("txtPassword")).sendKeys("admin");
			Reporter.log("2.Typing Password");
		
		driver.findElement(By.name("Submit")).click();
		
		Reporter.log("3.Login Complete");
			
		Thread.sleep(4000L);	
      driver.findElement(By.linkText("Logout")).click();
		
		Reporter.log("4.Logout Complete");	
			
			
	}
	
	@AfterClass
	public  void teardown() {
		
		
		driver.quit();
		
		
	}
	
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


