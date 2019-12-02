package JavaScriptExecutors_WebDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

public class HandleCalender_DatePicker_JS {
	
	
	public static void selectByDate (WebDriver driver, WebElement element, String date ) 
	
	{
		JavascriptExecutor js= ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].setAttribute('value','"+date+"');",element);
		System.out.println("Datepicker has been Selected::");
		
	}   
	
	public static void main (String arg[])   throws Exception  {
		
		
	System.setProperty("webdriver.chrome.driver","D:\\Selenium-Training\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();  
		 
		// Dynamic Wait 
		     
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		 
		// Launch URL
		
		driver.get("https://www.skyscanner.co.in/");
		Thread.sleep(4000L);
		
		WebElement dateValue=driver.findElement(By.id("depart-fsc-datepicker-button"));
	   String datePrint=	dateValue.getText();
	         System.out.println(datePrint);
		
		String date="28/05/2019";
		
		selectByDate(driver,dateValue,date);
	  System.out.println(date);


	}
}

