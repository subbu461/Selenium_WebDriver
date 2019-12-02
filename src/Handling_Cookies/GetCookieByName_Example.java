package Handling_Cookies;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCookieByName_Example {
		
public static void main(String[] args) {
		 
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium-Training\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://crmpro.com/index.html");   // Enter URL 
 		
	       Set	 <Cookie> cookies = driver.manage().getCookies();   // capture all cookies from browser
	 
		     System.out.println("Size of the Cookies is ::"+ cookies.size());   // Print size of Cookies 
		  
		 System.out.println(  driver.manage().getCookieNamed("_gid"));   // Print Specific Cookie According to Name
		 
		 driver.close();

}
}