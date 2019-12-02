package ChromeBrowser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;
import java.util.HashMap;
import java.util.Map;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;



 


public class WebDriver_FaceBook_Login_Logout {
	
	public static void main (String arg[]) throws Exception  {
		 
		   
	  	// Open FaceBook WebSite	  
		
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium-Training\\Drivers\\chromedriver.exe");
	
		 	WebDriver driver= new ChromeDriver();  
		
		 	  
		 	driver.manage().window().maximize();
		    driver.get("https://www.facebook.com/");
		    Thread.sleep(2000);
		     
		    System.out.println("FaceBook Application  Browser Opened: ");
	 	 	// USERNAME
		 	driver.findElement(By.name("email")).sendKeys("venkatrainasubbu");
		 	 
		 	//PASSWORD
		 	driver.findElement(By.name("pass")).sendKeys("venky461");
		 	 
		 	// click:: LOGIN 
		 	driver.findElement(By.id("loginbutton")).click();
		 	
			System.out.println("Login Successfully ");
		    Thread.sleep(5000L); 
		    
		   // driver.findElement(By.id("userNavigationLabel")).click();
	        //Thread.sleep(4000);
	        driver.findElement(By.xpath("//*[contains(text(),'Log Out')]")).click();
	        System.out.println("Logout successfully");
	        		
	}

}
