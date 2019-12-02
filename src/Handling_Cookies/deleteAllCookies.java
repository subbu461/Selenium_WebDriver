package Handling_Cookies;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class deleteAllCookies {
	
	
public static void main (String arg[] ) {
	
	
	System.setProperty("webdriver.chrome.driver","D:\\Selenium-Training\\Drivers\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver(); 
	
	driver.get("https://crmpro.com/index.html");   // Enter URL 
	
       Set	 <Cookie> cookies = driver.manage().getCookies();   // capture all cookies from browser

	     System.out.println("Size of the Cookies is ::"+ cookies.size());   // Print size of Cookies 
	 
	for (Cookie cookie:cookies)   //  read and print all Cookies 
	
	{
		
		System.out.println("CookieName::"+cookie.getName() + " :::::::::::::::::::::::::::"+ "CookieValue"+"::::::::::::::::::"+ cookie.getValue());
		
	} 
	  
	driver.manage().deleteAllCookies();
	
	  
	 
	   
	
	
	
	    
	
	
	
	
	
	
}

}
