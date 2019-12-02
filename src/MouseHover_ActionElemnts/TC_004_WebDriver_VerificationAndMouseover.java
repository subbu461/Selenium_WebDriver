package MouseHover_ActionElemnts;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;


public class TC_004_WebDriver_VerificationAndMouseover {
	
	public static   String un="admin";
	 public static  String pw="admin";
	
	
	
	public static void main (String arg[])throws Exception {
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
	
	if(driver.getTitle().equals("OrangeHRM")) {
		
		System.out.println("Title Matched in HomePage: ");	
			
	}
		else {
		
		System.out.println("Title not matched and Expected Title is:"+driver.getTitle());
		}
	//Admin Mainmenu MouseOver
	WebElement element=driver.findElement(By.linkText("Admin"));
	Actions action=new Actions (driver);
	action.moveToElement(element).perform();
	Thread.sleep(5000);
	System.out.println("Navigated to Admin Main menu MouseOver");
	
	//Data Import/Export Submenu
	
	WebElement element1=driver.findElement(By.linkText("Data Import/Export"));
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
	

	//Close Application
	driver.close();
	System.out.println("Application should be closed in webpage");
	
	//close Browser
	driver.quit();
	System.out.println("Browser should be terminated ");
}
	
}


