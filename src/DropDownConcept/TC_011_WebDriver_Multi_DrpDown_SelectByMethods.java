package DropDownConcept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TC_011_WebDriver_Multi_DrpDown_SelectByMethods {
 
	
	public static void main(String arg[]) throws Exception {
	
	 
		System.setProperty("webdriver.chrome.driver","D:\\Selenium-Training\\Drivers\\chromedriver_win32\\chromedriver.exe");
		
	
	WebDriver driver=new ChromeDriver(); 
	
	driver.get("https://www.softwaretestingmaterial.com/sample-webpage-to-automate/");
	driver.manage().window().maximize();                // maximize window 
	 driver.navigate().refresh();
	System.out.println("refresh Browser");
 Thread.sleep(4000L);
	//Thread.sleep(4000L);
	 
  
		 
		// DropDown table 
		
   WebElement element= driver.findElement(By.name("dropdown"));       // Webelement Identification 
   
   System.out.println(" click On Dropdown ");
	
   Select dropdown = new Select (element);                        // select class 
   
   dropdown.selectByVisibleText("Manual Testing");                      // SelectselectByVisibleText
   Thread.sleep(4000L);
   System.out.println("selectByVisibletext::" +" Manual Testing " );
  
    
    driver.quit();
	
	}
}
