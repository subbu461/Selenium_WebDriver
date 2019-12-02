package TESTNG_CONCEPTS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.testng.Assert;
 
import org.testng.Reporter;  
 import org.testng.annotations.Test;
 
public class TestNG_No_Priority {
	
	 WebDriver driver;
	
	// Method 1 : Open Browser say Google Chrome
	@Test (priority=0)
	public void openBrowser() {
		  
		 
		driver=new ChromeDriver();
		  Reporter.log("Opened Browser "); 
		
	}
		

	// Method 2: launch Browser with URL
	
	@Test(priority=1)
		public void launchBrowser() {
			
			
			 driver.get("http://www.google.co.in");
			 
			  Reporter.log("Google Browser Is Opened");
		} 
	
	
	// Method 3 :Perfomance search and sendkeys FACEBOOK
	
	@Test(priority=2)
	public void searchOperationperform() {
		
		 driver.findElement(By.xpath(".//*[@title='Search']")).sendKeys("Facebook");
		
		  Reporter.log("SearchOperation Performed in Google Search Bar ");
		
	}
	
	

	
	 // Method 4: Verify Google search page title.			
    @Test	(priority=3)	
    public void FaceBookPageTitleVerification() throws Exception {				
        driver.findElement(By.xpath(".//*[@value='Search']")).click();						
        Thread.sleep(3000);		
        Assert.assertEquals(driver.getTitle().contains("Facebook - Google Search"), true);	
        Reporter.log("Title is Verified ");
    }		
}
	
	
	
	
	
	


