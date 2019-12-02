package GetTitle_And_Verify;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
public class TC_001_WebDriver_ChromeBrowser {
	 
	
public static void main ( String args[]) throws Exception	 {
	
System.setProperty("webdriver.chrome.driver","D:\\Selenium-Training\\Drivers\\chromedriver.exe");   // Driver Path -chrome

WebDriver driver = new ChromeDriver();  // Driver Instatiation 
  
 
// Data Variables 

String USN="venky461";

String PWD="venky461";
    
 String ExpectedTitle="CRMPRO";

//  ** Chrome Driver ** //
 
driver.get("https://www.crmpro.com/");	  // Enter URL 
System.out.println("Opened Browser");
driver.manage().deleteAllCookies();             // DeleteAll Cookies

driver.findElement(By.name("username")).sendKeys(USN);   // Enter UserName 
System.out.println("Enter UserName");

driver.findElement(By.name("password")).sendKeys(PWD);   // Enter Password	
System.out.println("Enter Password");

driver.findElement(By.xpath("//*[@id='loginForm']/div/div/input")).click();   // Click Login 
System.out.println("Click Login Button");

Thread.sleep(4000L);
	

// **  Verify Company Title **//

 
if (driver.getTitle().equals(ExpectedTitle)) {
	
	System.out.println("Title Matched: ");
	
}  
else { 
	
	System.out.println( "Title Not Matched and Title is" + driver.getTitle() ); 
	
	
}
 
// To Perform Mouse Over Actions -Contacts //

 driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);



//  **  Close Current Page **  //
driver.quit();   
System.out.println("Browser Has Been Closed");
} 
	
}
