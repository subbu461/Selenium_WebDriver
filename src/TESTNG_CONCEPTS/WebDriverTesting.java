
package TESTNG_CONCEPTS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
 import org.testng.annotations.*;

import org.testng.Reporter;



 public class WebDriverTesting { 
	
	private WebDriver driver;
	
	@Test (priority=1) 
	
	public void StarUp() {
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium_Student_SW\\Drivers\\chromedriver_win32\\chromedriver.exe");
		
		driver=new ChromeDriver ();
		Reporter.log("Open Application Successfuly");
		
	}
	
	
	
	@Test (priority=2)
	public void login ()  throws Exception  {
		// URL Of Facebook 
		
		driver.navigate().to("https://www.facebook.com/");
		
		// Credentials of Facebook 
		
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("venkatrainasubbu");
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("venky461");
		driver.findElement(By.xpath("//*[@id='u_0_2']")).click();
		Thread.sleep(4000);
		Reporter.log("Login Successfully");
	 
		
		
	}               
	
	@Test (priority=3)      
	
	public void teardown () {
			
			driver.quit();
			Reporter.log("Close Application Successfuly");
		}
	
	
	
}