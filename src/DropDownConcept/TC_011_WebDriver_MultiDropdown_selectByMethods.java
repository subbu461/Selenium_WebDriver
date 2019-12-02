package DropDownConcept;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class TC_011_WebDriver_MultiDropdown_selectByMethods {
	
	public static void main(String arg[]) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium-Training\\Drivers\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver(); 
	
	System.out.println("Google browser Opened:");
	 
	 
	  
  // Selecting Multiple Values from DropDown '
		
		driver.get("D:\\Selenium_Student_SW\\HtmlFiles\\multiselectdropdown.html");
		
		Select mulDrpDwn= new Select(driver.findElement(By.id("tools")));
		System.out.println("SIngle Dropdown value is Taken: ");
		
		// SelectByvisibleMethod 
		mulDrpDwn.selectByVisibleText("Selenium IDE");
		Thread.sleep(3000L);
		mulDrpDwn.deselectByVisibleText("Selenium IDE");
		System.out.println("Selenium IDE is Selected:");
		Thread.sleep(6000L);
		// SelectBy Index
		mulDrpDwn.selectByIndex(3);
		Thread.sleep(3000L);
		mulDrpDwn.deselectByIndex(3);
	System.out.println("Selenium WebDriver is Selected:");
	Thread.sleep(6000L);
		 
	
		// SelectBy Value
				mulDrpDwn.selectByValue("components");
				Thread.sleep(3000L);
				mulDrpDwn.deselectByValue("components");
				
			System.out.println("SElenium RC  is Selected:");
			Thread.sleep(6000L);
		
		
		
		driver.quit();
		
		
		
	}

}
