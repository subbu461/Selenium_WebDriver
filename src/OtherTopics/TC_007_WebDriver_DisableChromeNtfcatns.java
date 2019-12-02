package OtherTopics;

import java.util.Map;
import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TC_007_WebDriver_DisableChromeNtfcatns  {
	
	
	
	public static void main (String arg[])  throws Exception {
		
 System.setProperty("webdriver.chrome.driver", "D:\\Selenium-Training\\Drivers\\chromedriver_win32\\chromedriver.exe");		
		
		// Create a object of HashMap Class

       Map <String , Object >  prefs= new HashMap<String, Object>();
		
       // set the notification setting it will overriding default setting 
       
       prefs.put("profile.default_content_setting_values.notications", 2);
		
	// Create a object of ChromeOptions
       
       ChromeOptions options = new ChromeOptions();
       
       // Set Experimental Options 
       
       options.setExperimentalOption("prefs", prefs);
       
       
     
	WebDriver driver = new ChromeDriver(options);
	
	driver.get("https://www.redbus.in/");
	 Thread.sleep(10000);
	 
	 driver.manage().window().maximize();
		
		// From Point 
	 
	 String Source="Bangalore";
	 driver.findElement(By.xpath("//*[@id=\'src\']")).sendKeys(Source);
	 Thread.sleep(5000L);
	
	 // To Point 
	 
		String Destination="Rajampeta";
		driver.findElement(By.xpath("//*[@id=\'dest\']")).sendKeys(Destination);
		 Thread.sleep(5000L);
		 
		 
		  
	// Select date 
		 
		 //driver.findElement(By.id("onward_cal")).click();
		 
		// List<WebElements> alldates =
		
		// Search option 
		
		//driver.findElement(By.xpath("//*[@id=\'search_btn\']")).click();
		 
		
	}
	
	
	
	
	
	
	

}
