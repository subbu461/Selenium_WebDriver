package MouseHover_ActionElemnts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DrapAndDropExample {

	
	public static void main ( String arg [])  {
	
	System.setProperty("webdriver.chrome.driver","D:\\Selenium-Training\\Drivers\\chromedriver.exe")	;
	
	WebDriver driver = new ChromeDriver();
	
	
	driver.get("https://jqueryui.com/droppable/");
		
	driver.manage().window().maximize();
	
	driver.manage().deleteAllCookies();
	
	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	
	//  Entering  To Frames;
	
	driver.switchTo().frame(0);
	
	System.out.println("Entering Into Frames::");
	
	// DragAndDrop :: Action Class 
	
	Actions action = new Actions (driver); 
	
	
	WebElement dragElement=driver.findElement(By.id("draggable"));
	
	WebElement  dropElement=driver.findElement(By.id("droppable"));
	
	
	  action.clickAndHold(dragElement).moveToElement(dropElement).release().build().perform();
	
	  System.out.println("Drag and drop has been Done Jquery UI Elements");
		
	   
	   // Existing from Frames
		
		driver.switchTo().defaultContent();
		
		System.out.println("Existing Into Frames::");
		
		
	}
	
}
