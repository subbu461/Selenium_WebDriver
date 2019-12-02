package Log4JConcept;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Log4JXML_Example {
	
	
	
public static void main (String arg[] )  throws Exception {
		
		
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium-Training\\Drivers\\chromedriver.exe");
		 
		WebDriver driver= new ChromeDriver();
		 
		// Logger Class     
		
		Logger logger = Logger.getLogger("Log4JProperties_Example");
		DOMConfigurator.configure("log4j.xml");
		
		logger.info("Chrome Browser Opened::"); 
		  
		// Open Application 
		driver.get("http://www.newtours.demoaut.com/");
		logger.info("Application Has Been Opened::");
		
		// Click on Register 
		
		driver.findElement(By.linkText("REGISTER")).click();
		Thread.sleep(4000L);
		logger.info("Clicked on REGISTER::");
		 
		
		//Contact Information 
		
		driver.findElement(By.name("firstName")).sendKeys("Venkata");
		
		driver.findElement(By.name("lastName")).sendKeys("SubbaReddy");
		
		driver.findElement(By.name("phone")).sendKeys("8106424830");
		
		driver.findElement(By.id("userName")).sendKeys("m.subbu461@gmail.com");
		
		logger.info("Contact  Information Filled");
		
		
		//Mailing Information 
		
		driver.findElement(By.name("address1")).sendKeys("NALLAPUREDDYPALLI");
		
		driver.findElement(By.name("address2")).sendKeys("RAJAMPETA");
		
		driver.findElement(By.name("city")).sendKeys("KADAPA");
		
		driver.findElement(By.name("state")).sendKeys("AP");
		
		driver. findElement(By.name("postalCode")).sendKeys("560037");
		
		logger.info("Mailing Information Filled");
		 
		// Country DropDown 
		
	WebElement  country = 	driver.findElement(By.name("country"));
	
		Select drpListCountry  = new  Select  (country);
		
		drpListCountry.selectByVisibleText("INDIA");
		
		  
		// User Information 
		
		driver.findElement(By.id("email")).sendKeys("Venky461");
		   
		driver.findElement(By.name("password")).sendKeys("Venky461");
		
		driver.findElement(By.name("confirmPassword")).sendKeys("Venky461");
		
	 	driver.findElement(By.name("register")).click();
		
		logger.info("User Information Filled");
		
		 
	// Close Browser 
		
		driver.quit();
		logger.info("Browser Closed");

}
}