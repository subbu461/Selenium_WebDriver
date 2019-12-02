package NavigationMethods;

import java.awt.Dimension;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver_RefreshPage {

	
	public static void main (String arg[])   throws Exception {
		 
		 
		System.setProperty("webdriver.chrome.driver","D:\\Selenium-Training\\Drivers\\chromedriver.exe");
		
		 
		
	 	  WebDriver driver=new ChromeDriver();
  
	//Launching Sample site
			driver.navigate().to("http:www.google.com");
			driver.manage().deleteAllCookies();
			Dimension dim = new Dimension (480,620);
			
			
			try {
		// Printing Current URL	
			String currentURL= driver.getCurrentUrl();
			System.out.println(currentURL);
			
			
			
			// Create Object of Dimmenssion class  : resize window  
			
			
		//driver.manage().window().maximize();
		Thread.sleep(4000L); 
			}
			
			 
			catch (Exception e)
			{
				
				
			System.out.println(e.getMessage());	
			}
		
	// Refresh the page With different Syntaxes 
			
	//1. navigate()  method 
		driver.navigate().refresh();
		System.out.println("REFRESH The Page");
		Thread.sleep(4000L);
		
		
		//2  . driver.getCurrentUrl()
		
	driver.get(driver.getCurrentUrl());
		System.out.println("REFRESH The Page");
		Thread.sleep(4000L);
		 
		
		//3.
		
		driver.navigate().to(driver.getCurrentUrl());
		System.out.println("REFRESH The Page");
		Thread.sleep(4000L);
		
		//4 .SendKeys
		
		driver.findElement(By.name("txtUserName")).sendKeys("\uE035");
		System.out.println("REFRESH The Page");
		Thread.sleep(4000L);
		
		
		//4 .SendKeys.Functions
		
		
				driver.findElement(By.name("txtUserName")).sendKeys(Keys.F5);
				System.out.println("REFRESH The Page");
				Thread.sleep(4000L);
				
		driver.quit();
}
}




