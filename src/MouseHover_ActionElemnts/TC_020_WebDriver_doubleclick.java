package MouseHover_ActionElemnts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.Alert;

public class TC_020_WebDriver_doubleclick {
	

	
	
public static void main (String arg[])    throws Exception {
	
		
	System.setProperty("webdriver.chrome.driver","D:\\Selenium-Training\\Drivers\\chromedriver.exe");
	
		 
		
		  WebDriver driver=new ChromeDriver();
	
	//Launching Sample site
			driver.get("http://artoftesting.com/sampleSiteForSelenium.html");
		 	
			//Right click in the TextBox
			Actions action = new Actions(driver);
			WebElement dlebtnclick = driver.findElement(By.id("dblClkBtn"));
		      Thread.sleep(2000L);
			System.out.println(dlebtnclick.getText());
			action.doubleClick(dlebtnclick).perform();
			
			Alert alert= driver.switchTo().alert(); 
			Thread.sleep(2000L);
			System.out.println(alert.getText());
			alert.accept();
			System.out.println("Alert Acepted");
			
			//Thread.sleep just for user to notice the event
			Thread.sleep(3000);
			
			//Closing the driver instance
			driver.quit();
	
	  
	
	
	
}
	
	

}
