package DatePicker_Calendar;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC30_WebDriver_Date_Timepicker {

	
	public static void main(String arg[])  {
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium-Training\\Drivers\\chromedriver_win32\\chromedriver.exe");
		

        WebDriver driver = new ChromeDriver();
		

		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.navigate().to("http://demo.guru99.com/test/");
		System.out.println("Application Has Been Opened");
		driver.manage().window().maximize();
		
		
		// find Date-Time Picker Control 
		 
		WebElement dateField = driver.findElement(By.xpath("//form//input[@name ='bdaytime']"));
	
		
		dateField.sendKeys("27091995");
		System.out.println("date has been sended");
		
		// TAB Key To focus time Field 
		
		dateField.sendKeys(Keys.TAB);
		System.out.println("TAB Has been fixed");
		
		// Fill time as 4:00 PM
		
		
		dateField.sendKeys("0400PM");
		System.out.println("Time has Been Sended");
		
		
		
		
		
		//driver.close();
		
		System.out.println("Application Has Been Closed");
		
		
	}
	

	
	
}
