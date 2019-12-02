package GetTitle_And_Verify;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_002_WebDriver_VerifyTitle {
	
	
	public static void main ( String arg[] ) throws Exception {
	
		   String un="admin";
		  String pw="admin";
	
	// Open Chrome Browser
			System.setProperty("webdriver.chrome.driver","D:\\Selenium-Training\\Drivers\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
		
			System.out.println("Chrome Browser should opened:");
			driver.manage().window().maximize();
			// Open Application in Chrome Browser
			driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
			
			System.out.println("Application should be Opened:");
			//TimeResponse Provided  
			Thread.sleep(8000);
			System.out.println("Time Provided to open the Application:");
			
		  
			
		    //verify the  HRMS title
			
			if(driver.getTitle().equals("OrangeHRM - New Level of HR Management")) {
				
			System.out.println("Title Matched ");	
				
		}
			else {
			
			System.out.println("Title not matched and Expected Title is:"+driver.getTitle());
			}
			
		
		//Enter Username By calling Value
		
		driver.findElement(By.name("txtUserName")).sendKeys(un);	
		System.out.println("Entered Username by calling variable");
		
		//Enter Username By calling Value
		
		driver.findElement(By.name("txtPassword")).sendKeys(pw);
		System.out.println("Entered Password  by calling variable");
		
		//Click login Button
		driver.findElement(By.name("Submit")).click();
		System.out.println("Click login Button ");
		Thread.sleep(5000);
		// Click on logout 
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("Click on logout option through Link");
		

		//Close Application
		driver.close();
		System.out.println("Application should be closed in webpage");
		
		//close Browser
		driver.quit();
		System.out.println("Browser should be terminated ");
	
	
	}
	
	
	
	
	
	
	
	

}
