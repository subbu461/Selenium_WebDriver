 package OtherTopics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.WebElement; 
import  java.util.concurrent.TimeUnit;

public class TC_029_WebDriver_HeadlessChromeTest {
	
	 public static void main (String args[]) throws Exception  {
		
		 System.setProperty("webdriver.chrome.driver","D:\\Selenium-Training\\Drivers\\chromedriver_win32\\chromedriver.exe");
			
		
		
		
		// Chrome Version Should be Gretar Than 59 Always  on MAC And 60 In Windows 
		// windows-size=1400,800
		ChromeOptions options=new ChromeOptions();
		
		options.addArguments("window-size=1400,800");
		options.addArguments("headless");
				
		
		
		WebDriver  driver =  new ChromeDriver(options);
				
			driver.get("https://crmpro.com/index.html");   // Launch WebSite 
			driver.manage().window().maximize();                       // maximize Window 
			System.out.println("WebApplications Opened::");
			
			
		// Dynamic wait 
			
			//driver.manage().timeouts().pageLoadTimeout(40,Timeout.SECONDS);
			//driver.manage().timeouts().implicityWait(40,Timeout.SECONDS);
			
		// 	Login Page
			
			System.out.println("Title Of the Page is Before Login ::" + driver.getTitle());
			
			driver.findElement(By.name("username")).sendKeys("Venky461");
			System.out.println("USERNAME Entered::");
			driver.findElement(By.name("password")).sendKeys("Venky461");
			System.out.println("PASSWORD Entered::");
			driver.findElement(By.xpath("//*[@id='loginForm']/div/div/input")).click();
			System.out.println("CLICK on LOGIN Button ::");
			Thread.sleep(4000);
	
			System.out.println("Title Of the Page is After Login ::" + driver.getTitle());	

           driver.quit();               // close Application
           System.out.println("CLOSE Application ::");	
			}
	
}
