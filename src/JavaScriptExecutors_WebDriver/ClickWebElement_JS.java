package JavaScriptExecutors_WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
 
public class ClickWebElement_JS {
	
	
	public static void main(String arg[]) throws Exception{
		
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium-Training\\Drivers\\chromedriver.exe");
		
		 
		WebDriver driver = new ChromeDriver();
		System.out.println("Browser opened");
		
		driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
		driver.manage().window().maximize();
		System.out.println("URL Opened");
		
		// Enter Username and Password
		
		driver.findElement(By.name("txtUserName")).sendKeys("admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin");
		 
		//JavaScript Executor For Login Action  
		 
		WebElement login=driver.findElement(By.name("Submit"));
		JavascriptExecutor  executor =(JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click()",login);
		Thread.sleep(2000);
		
		System.out.println("Login completed Using Javascript Executor :");  
		 
		
		//JavaScrpt Executor for Logout Action 
		WebElement logout= driver.findElement(By.linkText("Logout"));
		JavascriptExecutor executor1 = (JavascriptExecutor)driver;
	    executor1.executeScript("arguments[0].click()",logout);
		
	    System.out.println("Logout completed Using Javascript Executor :");
	    // Close browser
	    
	    driver.close();
	    
		
	}
	

}
