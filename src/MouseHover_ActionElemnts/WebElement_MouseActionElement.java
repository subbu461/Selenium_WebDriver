package MouseHover_ActionElemnts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WebElement_MouseActionElement { 
	
	public static String USN="admin"; 
	public static String PWD="admin";  
		
public static void main (String arg[]) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium-Training\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		
		//Automation for Test cases
		driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
		driver.manage().window().maximize();
		
		// Verify Title in the WebPage
		  
	 	
		 if (driver.getTitle().equals("Orange HRM- New Level Of HR Management"));
		{
			
			System.out.println("Title was Matched ");	
		}
				
			// Login To Application 
		driver.findElement(By.name("txtUserName")).sendKeys(USN);	
	driver.findElement(By.name("txtPassword")).sendKeys(PWD);
	driver.findElement(By.name("Submit")).click();
	Thread.sleep(5000);
	  System.out.println("Login Completed");
	  
	    
	  //MouseOver ON PIM
	  WebElement element= driver.findElement(By.linkText("PIM"));
	  Actions action =new Actions(driver);
	  action.moveToElement(element).perform();
	  Thread.sleep(5000);
	  System.out.println("MouseOver to PIM  had been done");
	  
	
	  
	  //Clicking on addEmployee Submenu link
	  
	  driver.findElement(By.linkText("Add Employee")).click();
	  Thread .sleep(3000);
	  System.out.println("Click on Add Employee Sub menu ");
 

	  
	    
	  driver.findElement(By.linkText("Logout")).click();
	  System.out.println("Logout Completed");
	  
	 driver.close();
	  System.out.println("close the Webpage");
	
	  driver.quit();
	  System.out.println("Browser has been Closed");	
	

}
}
