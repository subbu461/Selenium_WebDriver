package OtherTopics;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class TC_024_WebDriver_TotalLinks_WebPage {
	public static void main (String arg[]) throws Exception {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium-Training\\Drivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
	
		driver.navigate().to("https://www.facebook.com/");
	
		driver.manage().window().maximize();
		
		//Get List of WebElemnt With List - "a"
		
		List<WebElement> allLinks =driver.findElements(By.tagName("a"));
		
		// Using For Each loop to get total no of links
		
	
		for(WebElement link:allLinks) {
			System.out.println(link.getText()+ " - "+link.getAttribute("href"));
			
		}
		System.out.println(allLinks.size());
		driver.quit();
	}
             
}
