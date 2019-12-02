package RobotAPI;
import java.awt.AWTException;
import java.awt.datatransfer.StringSelection;
import java.awt.*;
import java.awt.event.KeyEvent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class TC_010_WebDriver_Robotclass_methods {

	public static void main (String arg[])  throws AWTException,InterruptedException {
	
		
		// Open Browser
		System.setProperty("webdriver.chrome.driver","D:\\Selenium-Training\\Drivers\\chromedriver_win32\\chromedriver.exe");
		
	 WebDriver driver= new ChromeDriver();  // Start browser 
	
	 
	 driver.get("https://the-internet.herokuapp.com/upload");  // enter URL
	 driver.manage().window().maximize();           // maximize browser
	 
	 
	 // Specify file location with extension 
	 
	 
	  StringSelection  sel =  new StringSelection("C:\\Users\\M V SUBBAREDDY\\Desktop\\Venkat-Software_TestEngineer-Trainee.docx");
	  
	  
	  // Cpoy to Clipboard 
	  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel,null);
	  System.out.println("path file selection is:   "  + sel);
	 
	 // Scroll Down page
	 
	 JavascriptExecutor jse =(JavascriptExecutor)driver;
	
	jse.executeScript("scroll(0,350)");
	
	Thread.sleep(5000);
	
	
	
	 
	
	// This will click on Browse button
	 driver.findElement(By.xpath("//*[@id=\'file-upload\']")).click();
	 
	 
	 
	 // Create object of Robot class 
	 Robot robot = new Robot();
	 Thread.sleep(1000);
	      
	  // Press Enter
	 robot.keyPress(KeyEvent.VK_ENTER);
	 
	// Release Enter
	 robot.keyRelease(KeyEvent.VK_ENTER);
	 
	  // Press CTRL+V
	 robot.keyPress(KeyEvent.VK_CONTROL);
	 robot.keyPress(KeyEvent.VK_V);
	 
	// Release CTRL+V
	 robot.keyRelease(KeyEvent.VK_CONTROL);
	 robot.keyRelease(KeyEvent.VK_V);
	 Thread.sleep(1000);
	        
	       //  Press Enter 
	 robot.keyPress(KeyEvent.VK_ENTER);
	 robot.keyRelease(KeyEvent.VK_ENTER);

	
	}
	
	
}
