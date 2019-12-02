package Selenium_Waits;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;




public class TC_012_WebDriver_WaitMethods {
	public static void main(String arg[]) throws Exception  {
		
		String USN = "admin";
		String PWD = "admin";
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium-Training\\Drivers\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver driver= new ChromeDriver();
		
		System.out.println("Google Chrome Opened:");
		
		driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
		//Thread Wait Method 
		Thread.sleep(4000);
		System.out.println("URL Opened:");
		
		
		// Entered UserName and Password for login 
		
		driver.findElement(By.name("txtUserName")).sendKeys(USN);
		
		driver.findElement(By.name("txtPassword")).sendKeys(PWD);
		
		// Explicit Wait for Clickable 
		
		WebDriverWait wait= new WebDriverWait(driver,15);
		wait.until(ExpectedConditions.elementToBeClickable(By.name("Submit")));
		driver.findElement(By.name("Submit")).click();
		
		// Implicit Wait 
		
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		System.out.println("Login Has been Done");
		
		//Logout Action 
		
		driver.findElement(By.linkText("Logout")).click();
		
		System.out.println("Logout Has been Done");
		driver.close();
		
		
	}

}
