package Check_and_RadioBtns;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver_IsDisplayed {
	
	
	public static void main (String [] arg)  {
		
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium-Training\\Drivers\\chromedriver_win32\\chromedriver.exe");
				
		
		 WebDriver driver= new ChromeDriver();
		 
		 driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");	
		driver.manage().window().maximize();
		
	// 1. Is Displayed() Method::: Used to check element present in the WebPage or Not??/	
		
	
		driver.findElement(By.name("txtUserName")).sendKeys("admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin");
		
	boolean b =	driver.findElement(By.name("Submit")).isDisplayed();
		
		System.out.println( "The Boolean value is " + b);
		
		
		driver.quit();
		
	}
	 
	
	

}
