package Handling_Cookies;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteSpecificCookie_Example {
	
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium-Training\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://127.0.0.1/orangehrm-2.6/login.php");   // Enter URL 
		
	       Set	 <Cookie> cookies = driver.manage().getCookies();   // capture all cookies from browser
	
		     System.out.println("Size of the Cookies is ::"+ cookies.size());   // Print size of Cookies 
		 
		
		// Add Cookie To the Browser
	        
	      Cookie addCookie = new Cookie("MyCookie", "Venkat@461");
	      
	       driver.manage().addCookie(addCookie); 
	       cookies = driver.manage().getCookies(); 
	       
	 
	      System.out.println("Size of the Cookies After  Adding  ::"+ cookies.size());
for (Cookie cookie:cookies)   //  read and print all Cookies 
			
		{ 
			
			System.out.println("CookieName::"+cookie.getName() + " :::::::::::::::::::::::::::"+ "CookieValue"+"::::::::::::::::::"+ cookie.getValue());
			 
		}
		  
  
// Delete Specific Cookie
  
    driver.manage().deleteCookie(addCookie);
    
  System.out.println("Size of the Cookies After  Deleting  ::"+ cookies.size());
  
   for (Cookie cookie:cookies)   //  read and print all Cookies  
	
{ 
	  
	System.out.println("CookieName::"+cookie.getName() + " :::::::::::::::::::::::::::"+ "CookieValue"+"::::::::::::::::::"+ cookie.getValue());
	 
}
 
		
		 driver.close();     // Close Driver
	
	}

}
	


