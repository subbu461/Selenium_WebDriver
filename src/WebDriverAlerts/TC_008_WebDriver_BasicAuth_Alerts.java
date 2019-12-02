package WebDriverAlerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_008_WebDriver_BasicAuth_Alerts {
	
	 
	 
	public static void main (String arg[])   {
	
		System.setProperty("webdriver.chrome.driver","D:\\Selenium-Training\\Drivers\\chromedriver_win32\\chromedriver.exe");
		
	   WebDriver driver= new ChromeDriver();
	
	// such types of pop ups in webpages, we are using credentials in URL Itself
	driver.navigate().to("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	
	// Print the messages after sending sendkeys in basic authentication Popups 
	
	String  pageMessage=  driver.findElement(By.cssSelector("p")).getText();
	
	System.out.println(pageMessage);

driver.close();
	 
	driver.quit();
	
	
	
	
	}
	
	
	
	
	
	

}
