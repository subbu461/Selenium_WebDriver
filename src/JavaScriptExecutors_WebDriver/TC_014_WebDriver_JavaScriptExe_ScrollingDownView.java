package JavaScriptExecutors_WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_014_WebDriver_JavaScriptExe_ScrollingDownView {
	
public static void main(String arg[]) throws Exception{
		
		
	System.setProperty("webdriver.chrome.driver","D:\\Selenium-Training\\Drivers\\chromedriver_win32\\chromedriver.exe");
	
		
		WebDriver driver = new ChromeDriver();
		System.out.println("Browser opened");
		
		driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
		driver.manage().window().maximize();
		System.out.println("URL Opened");
		
		// Enter Username using JavaScriptExecutor
		
	
		JavascriptExecutor jsusername = (JavascriptExecutor) driver;
		jsusername.executeScript("document.getElementsByName('txtUserName')[0].value='admin'");
		
		System.out.println("Entered Username" );
		
		
		// Enter Usernameusing JavaScriptExecutor
		JavascriptExecutor jspassword = (JavascriptExecutor) driver;
		jspassword.executeScript("document.getElementsByName('txtPassword')[0].value='admin'");
		System.out.println("Entered password" );
		
	// javaScript Executor : Scrolling down until webelement in the view 
		
WebElement clearText = driver.findElement(By.name("clear"));
 

JavascriptExecutor jsclear = (JavascriptExecutor) driver;
jsclear.executeScript("arguments[0].scrollIntoView(true);", clearText);	
clearText.click();		
System.out.println(" Click on Clear Button " );

Thread.sleep(5000L);
		
	// again 

	driver.findElement(By.name("txtUserName")).sendKeys("admin");
	System.out.println(" Again Entered Username" );
	driver.findElement(By.name("txtPassword")).sendKeys("admin");
	System.out.println( "Again password " );	
		
		
		//JavaScript Executor For Login Action 
		 
		WebElement login=driver.findElement(By.name("Submit"));
		JavascriptExecutor  executor =(JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click()",login);
		Thread.sleep(2000);
		
		System.out.println("Login completed Using Javascript Executor :");
		
		//After Entering WebPage Go for search and Type some date there using ajva script 
		
		
		
		Thread.sleep(4000L);
		
//JavaScrpt Executor for Logout Action 
		WebElement logout= driver.findElement(By.linkText("Logout"));
		JavascriptExecutor executor1 = (JavascriptExecutor)driver;
	    executor1.executeScript("arguments[0].click()",logout);
		
	    System.out.println("Logout completed Using Javascript Executor :");
	    // Close browser
	    
	    driver.close();
	    
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
