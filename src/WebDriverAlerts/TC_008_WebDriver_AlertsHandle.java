package WebDriverAlerts;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Alert;
 

public class TC_008_WebDriver_AlertsHandle {
	
	public static void main ( String arg[]) throws Exception  {
 		
		  
		 
   		// WebDriver Driver location Path and chrome instance
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium-Training\\Drivers\\chromedriver_win32\\chromedriver.exe");
		
		
		
		//  driver instance
		
		WebDriver driver = new ChromeDriver();
		
		
		
		
		
		driver.get("http://softwaretestingplace.blogspot.com/2017/03/javascript-alert-test-page.html");
		driver.findElement(By.xpath("//*[@id='content']/button")).click();
		
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		String print = alert.getText();
		System.out.println("alert message getting as a text               "  + print);
		
		
		alert.accept();
		System.out.println("alert accepted" );
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='content']/button")).click();
		Thread.sleep(3000);
		alert.dismiss();
		System.out.println("alert dismmissed" );
		driver.close();
		driver.quit();
		
	}	
		
		
}
