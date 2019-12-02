package JavaScriptExecutors_WebDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HighLightElement_JS {
	
	  
	public static void main (String arg[])     throws Exception {
		
		 System.setProperty("webdriver.chrome.driver","D:\\Selenium-Training\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();  // Maximize Window
		
		driver.manage().deleteAllCookies();    // Delete All Cookies 
		
		 
		// Implicitly Wait 
		
		String URL="https://crmpro.com/index.html";
		System.out.println("Application Opened::");
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get(URL);
		 
		
		// Login to ORANGEHRM 
		 
		
		 
		
		driver.findElement(By.name("username")).sendKeys("Venky461");
		System.out.println("Entered USername");
		
		driver.findElement(By.name("password")).sendKeys("Venky461");
		System.out.println("Entered Password::");
		
	WebElement lgnBtn=	driver.findElement(By.xpath("//input[contains(@type, 'Submit')]"));
	
   flash(lgnBtn,driver);
		
		 
	}


		
		
		public static void flash  (WebElement elem, WebDriver driver ) 
		
	{
		JavascriptExecutor   js = ((JavascriptExecutor) driver );
		
		String bgcolor =  elem.getCssValue("backgroundColor");
		
		
		for ( int i =0; i>=100; i ++) 
		{
			
		changeColor("rgb(0,200,0)",elem,driver);
		changeColor(bgcolor ,elem,driver);
		
		} 
			
			
			
		}
	
public static void  changeColor (String color ,WebElement elem, WebDriver driver)
		
		{
			
			
			JavascriptExecutor  js = ((JavascriptExecutor) driver);
			
			js.executeScript(" arguments[0].style.backgroundColor = ' " + color + " '  ", elem);
			
			
			try {
				
				Thread.sleep(2000);
				
				
			}
			
			catch(InterruptedException e )  
			
			{
				
				
				
			}
			
		}
		
		
		
		
	}
	


