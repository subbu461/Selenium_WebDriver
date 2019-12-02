package WindowsHandler;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

import  java.util.ArrayList;

public class TC_015_WebDriver_WindowsHandelers {
	
	public static void main(String arg[])throws Exception {
 
		System.setProperty("webdriver.chrome.driver","D:\\Selenium-Training\\Drivers\\chromedriver.exe");
		
	WebDriver driver= new ChromeDriver();
	  
	System.out.println("Browser opened");
	 
	driver.get("D:\\Selenium-Training\\HtmlFiles\\multiplewindows.html");
	Thread.sleep(3000);
	System.out.println("Webpage window Is Opened");
	
	// Click on Window 1
	driver.findElement(By.id("btn1")).click();
	Thread.sleep(2000);
	System.out.println("Window1 is Opened:");
	 
	  
	 
	// click on windowHandles : handle no of windows 
	
	driver.findElement(By.id("btn2")).click();
	ArrayList<String> windowshandlers= new ArrayList<String>(driver.getWindowHandles());
	driver.switchTo().window(windowshandlers.get(1));
	System.out.println("Window2 is Opened:");
	Thread.sleep(2000);
	// Close Browser 
	driver.close();
	driver.quit();
	System.out.println("Close all Webpages in Browser");
}
}