package TESTNG_CONCEPTS;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
 
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
 
  
public class TestNG_AssertConcept {
	
	WebDriver driver;
	
@BeforeMethod      
	
	public void setUp()  { 
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium-Training\\Drivers\\chromedriver_win32\\chromedriver.exe");
		
		 driver=new ChromeDriver();        // To Launch Browser 
		 
		 driver.manage().window().maximize();
		 driver.get("http://www.google.com");
		 
		 driver.manage().deleteAllCookies();
		 
		 driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 
	}
	
	
@Test


public void assertEqualsMethod()  {
	
	String actTitle=driver.getTitle();
	
	String expTitle ="Google";
	
	System.out.println(actTitle);
	Assert.assertEquals(actTitle, expTitle);
	
	  
		
}      

public void assertTrueMethod() {
	
	
	boolean b = driver.findElement(By.xpath("//[@id='hplogo']")).isDisplayed();
	
	Assert.assertTrue(b);
	Assert.assertEquals(b, true);
	
	
	 
}


	@AfterMethod
	
	public void tearDown() {
		
		
		driver.quit();  
		
		
		
	}
}
