package Handling_Cookies;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddCookie_Example {
	
	
	public static void main (String arg[])  {
		
		
	System.setProperty("webdriver.chrome.driver","D:\\Selenium-Training\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://crmpro.com/index.html");   // Enter URL 
		
	       
		 Set	 <Cookie> cookies = driver.manage().getCookies();   // capture all cookies from browser
		 
		     System.out.println("Size of the Cookies Before Adding  ::"+ cookies.size());   // Print size of Cookies 
		
		
		
		  	for (Cookie cookie:cookies)   //  read and print all Cookies 
				
			{ 
				
				System.out.println("CookieName::"+cookie.getName() + " :::::::::::::::::::::::::::"+ "CookieValue"+"::::::::::::::::::"+ cookie.getValue());
				 
			}
		  	
		 // Add Cookie To the Browser
		      
	 	      Cookie addCookie = new Cookie("MyCookie", "Venkat@461");
		      
		       driver.manage().addCookie(addCookie);
		       cookies = driver.manage().getCookies(); 
		       
		 
		      System.out.println("Size of the Cookies After  Adding  ::"+ cookies.size());
	for (Cookie cookie:cookies)   //  read and print all Cookies 
				
			{ 
				
				System.out.println("CookieName::"+cookie.getName() + " :::::::::::::::::::::::::::"+ "CookieValue"+"::::::::::::::::::"+ cookie.getValue());
				 
			}
		
		
		      driver.quit();                             // Close  Browser
	}
}
