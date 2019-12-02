package ToolTip_Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTip_ByStartegy {
	
	
	public static void main (String arg[]) {
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium-Training\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demoqa.com/tooltip/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		System.out.println("Tool WebPage is Displayed ");
		
		WebElement ageBox= driver.findElement(By.id("age"));
		ageBox.getAttribute("title");
	
			
			String toolTip =ageBox.getAttribute("title");
			
			System.out.println("Retrived toolTip as " + "                 "+ toolTip);
		 	
		
		if(toolTip.equalsIgnoreCase("We ask for your age only for statistical purposes."))
		{
			
			System.out.println("PASS:Tooltip Matched Expected Value");
		}
		
		else {
			
			System.out.println("FAIL:Tooltip Failed to Match Expected Value");
		}
		
		
		
		 
	}

}
