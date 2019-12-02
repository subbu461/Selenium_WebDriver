package OtherTopics;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class TC_007_WebDriver_ChromeOptions {
	
	 
	
	public static void main (String arg[]) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium-Training\\Drivers\\chromedriver_win32\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		
		// Adding Extension to the Chrome Browser 
		//options.addExtensions(new File("D:\\Selenium-Training\\Drivers\\chromedriver_win32\\chromedriver.exe"));
		 
	 
		
		// Disable info-bars in  chromeBrowser
		
		options.addArguments("--disable-infobars");
		
		// Disable Extensions 
		options.addArguments("--disable-extensions");
		
		// disable Notifications 
		
		options.addArguments("--disable-notifications");
		
	 	WebDriver driver = new ChromeDriver(options);
		
		driver.get("");
		
		
		Thread.sleep(4000);
		driver.close();
		
	}
	

}
