package TESTNG_CONCEPTS;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By; 
import java.io.File;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

  

import org.testng.annotations.Test;
import org.testng.Reporter;
public class TestNG_WebDriver_FailureScreenshot {
	
	WebDriver driver;
	@Test(priority = 1) 
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium_Student_SW\\Drivers\\chromedriver_win32\\chromedriver.exe"); 	
		
		driver= new ChromeDriver();
		
	}
	
	@ Test(priority = 3)
	public void tearDown(){
	 driver.quit();
	}
	
	@Test(priority = 2)
	public void screenShotCapture() throws Exception {
		
		try {
			
			Reporter.log("Chrome Browser should opened:");
			driver.manage().window().maximize();
			// Open Application in Chrome Browser
			
			driver.navigate().to("www.google.com");
			Reporter.log("Application should be Opened:");
			//TimeResponse Provided 
			Thread.sleep(8000);
			Reporter.log("Time Provided to open the Application:");
			if(driver.getTitle().equals("OrangeHRM - New Level of HR Management")) {
				
				System.out.println("Title Matched ");	
					
			}
				else {
				
				System.out.println("Title not matched and Expected Title is:"+driver.getTitle());
				}
			
			//Enter Username By calling Value
			
			driver.findElement(By.name("txtUserName")).sendKeys("admin");	
			System.out.println("Entered Username by calling variable");
			
			//Enter Username By calling Value
			
			driver.findElement(By.name("txtPassword")).sendKeys("admin");
			System.out.println("Entered Password  by calling variable");
			
			//Click login Button
			driver.findElement(By.name("Submit")).click();
			System.out.println("Click login Button ");
			Thread.sleep(5000);
			
			if(driver.getTitle().equals("OrangeHRM")) {
				
				System.out.println("Title Matched in HomePage: ");	
					
			}
				else {
				
				System.out.println("Title not matched and Expected Title is:"+driver.getTitle());
				}
			
			//Data Import/Export Submenu
			
			WebElement element1=driver.findElement(By.linkText("Data Import1/Export"));
			Actions action1=new Actions (driver);
			action1.moveToElement(element1).perform();
			Thread.sleep(5000);
			 System.out.println("Navigated to Data Import/Export Main menu MouseOver");
			
			// Click on Export Option
			
			driver.findElement(By.linkText("Export")).click();
			System.out.println("Click on Export option through Link");
			
			//add any wait 
			Thread.sleep(5000);
	 		System.out.println("Provided some wait statement");
			
			// Click on logout 
			driver.findElement(By.linkText("Logout")).click();
			System.out.println("Click on logout option through Link");
		}
		 catch  (Exception e ){
			 
			 
			File file2 =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(file2,new File("D:\\TestResults.png"));
			 
		 }
		
		driver.quit();
		
	
	
	}	
	

}
