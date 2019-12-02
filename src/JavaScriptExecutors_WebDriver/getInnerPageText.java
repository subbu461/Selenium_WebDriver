package JavaScriptExecutors_WebDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getInnerPageText {
	
	
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
	
	
	// get Inner Page of the Text : JavaScript 
	
	
	JavascriptExecutor js = ((JavascriptExecutor) driver);
	
	 String pageInnerText=js.executeScript("return document.documentElement.innerText;").toString();
	
	System.out.println(pageInnerText);
	
	
	
	
	
	
	
	}
}
