package JavaScriptExecutors_WebDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingPage_JS {
	
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
	
	
	
	// Scrolling Page ::  Javascript 
	
	//**DownScrolling:;
	
	   JavascriptExecutor  js = ((JavascriptExecutor)driver);
	  
	   js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	
	   System.out.println("Window Page Has Down Scrolled::");
	
	
	
	
	
	
}
}
