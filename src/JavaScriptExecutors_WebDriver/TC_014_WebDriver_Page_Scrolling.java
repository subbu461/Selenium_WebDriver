package JavaScriptExecutors_WebDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class TC_014_WebDriver_Page_Scrolling {
	   
	
	 
	public  static void main (String arg[])  throws Exception {
	
		System.setProperty("webdriver.chrome.driver","D:\\Selenium-Training\\Drivers\\chromedriver_win32\\chromedriver.exe");
		
	WebDriver driver=new ChromeDriver() ;   // WebDriver interface instance 
	 Thread.sleep(4000);
	 driver.manage().window().maximize();
   
	// Javascript Executor  
	  
	 JavascriptExecutor  js =(JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,1000)");
	
	  
	
	 driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
		driver.findElement(By.name("txtUserName")).sendKeys("admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin");
	    driver.findElement(By.name("Submit")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.linkText("Logout")).click();
	   driver.close();
	  driver.quit();
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
