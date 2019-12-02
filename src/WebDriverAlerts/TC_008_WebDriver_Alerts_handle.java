package WebDriverAlerts;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Alert;

public class TC_008_WebDriver_Alerts_handle {
	
	 
	public static void main (String aeg[])  throws Exception {
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium-Training\\Drivers\\chromedriver_win32\\chromedriver.exe");
		
	 WebDriver driver= new ChromeDriver();
	 
	 driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
	 
	System.out.println(driver.getTitle());
	
	//  Enter Password and submit 
	
	driver.findElement(By.name("txtUserName")).sendKeys("admin");
	driver.findElement(By.name("Submit")).click();
	
	// Handling with Alerts  
	
	Alert alert= driver.switchTo().alert();
	
	// Get POP UP Message in Alert
	
	System.out.println(alert.getText());
	
	// click OK On POP UP Message using Alerts
	
	//  Enter Password and submit 
	
	alert.dismiss();
	
	
	driver.findElement(By.name("txtPassword")).sendKeys("admin");
	driver.findElement(By.name("Submit")).click();
	Thread.sleep(3000);
	
	System.out.println("Login Completed");
	
	// click Logout
	
	driver.findElement(By.linkText("Logout")).click();
	
	System.out.println("Logout Completed");
	
	// close Web Page  and Browser 
	
	driver.close();
	driver.quit();
	
	System.out.println("Close Webapage and Browser");
		
		
	}

}
