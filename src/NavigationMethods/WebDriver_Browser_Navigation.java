package NavigationMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver_Browser_Navigation {
	
	
	

	public static void main (String arg[])    throws Exception {
		
	
		System.setProperty("webdriver.chrome.driver","D:\\Selenium-Training\\Drivers\\chromedriver_win32\\chromedriver.exe");
		
	 
	
	  WebDriver driver=new ChromeDriver();

//Launching Sample site
		driver.get("http://artoftesting.com/sampleSiteForSelenium.html");
		driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	
	// click on link 
	WebElement clckLink= driver.findElement(By.cssSelector("div.navbar-header" )); 
				
	clckLink.click();
	System.out.println(clckLink.getText());
		Thread.sleep(4000L);			

	// navigate to back 
		
		driver.navigate().back();
		
		System.out.println("Navigated back ");
		Thread.sleep(4000L);
		
	
		// navigate to forward 
		
				driver.navigate().forward();
				
				System.out.println("Navigated forward ");
	
		// navigate to refresh	
				
driver.navigate().refresh();
				
				System.out.println(" Refresh page");	
	
				
				driver.quit();
	}
	

}
