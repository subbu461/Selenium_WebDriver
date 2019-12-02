package ChromeBrowser;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.By;
  
 
public class WebDriver_Login_Logout {
	 
public static void main(String arg[]) throws Exception  {
	 
  

	System.setProperty("webdriver.chrome.driver","D:\\Selenium-Training\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	Thread.sleep(2000 );
		 
	driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
	System.out.println("Browser Opened::");
	
	driver.findElement(By.name("txtUserName")).sendKeys("admin");
	System.out.println("Entered USERNAME::");
	
	driver.findElement(By.name("txtPassword")).sendKeys("admin");
	System.out.println("Entered PASSWORD::");
	
    driver.findElement(By.name("Submit")).click();
   System.out.println("Click On SUBMIT::");
    Thread.sleep(3000); 
    
    driver.findElement(By.linkText("Logout"));
    System.out.println("Click on LOGOUT::");
    driver.close(); 


}
}
