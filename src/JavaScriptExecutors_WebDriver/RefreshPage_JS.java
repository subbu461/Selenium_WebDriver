package JavaScriptExecutors_WebDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RefreshPage_JS {
	
	
	public static void main ( String arg[])  {
		
	        System.setProperty("webdriver.chrome.driver","D:\\Selenium-Training\\Drivers\\chromedriver.exe");	
	       
	        WebDriver driver= new ChromeDriver();
	        
	      // Open Browser
	        
	        String URL="https://www.progressive.com/";
	      
	        driver.get(URL);
		 
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		
		// Refresh Page. Normal Process 
		
		driver.navigate().refresh();
		
		System.out.println("Page is refreshed ::");
		
		
		// RefreshApplication :: JavaScript 
		
		JavascriptExecutor js =  ((JavascriptExecutor) driver );
		
		js.executeScript("history.go()");
		
		System.out.println("Page is Refereshed Using JS ::");
		
		
		// Close 
		
		driver.close();
		
	}

}
