package JavaScriptExecutors_WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_014_Webdriver_JavaScriptExe_TypeinTextBox {
	
	
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
		
		
		// Enter Usernameusing JavaScriptExecutor
		JavascriptExecutor jspassword = (JavascriptExecutor) driver;
		jspassword.executeScript("document.getElementsByName('txtPassword')[0].value='admin'");
		
		
		//driver.findElement(By.name("txtUserName")).sendKeys("admin");
	//driver.findElement(By.name("txtPassword")).sendKeys("admin");
		 
		
		
		
		
		
		
		
		
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
