package DropDownConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TC_011_webdriver_singledrpdwn_selectmethods {
	
	
	
	
	
public static void main(String arg[]) throws Exception {
		
	System.setProperty("webdriver.chrome.driver","D:\\Selenium-Training\\Drivers\\chromedriver_win32\\chromedriver.exe");
	
		
		WebDriver driver=new ChromeDriver(); 
	
	System.out.println("Google browser Opened:");
	
	 
	 
	// Selecting Single Value Form DropDownList
	driver.get("D:\\\\Selenium_Student_SW\\\\HtmlFiles\\\\dropdownNavigate.html");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	System.out.println("URL Entered:");
	
   
	Select drpdwn = new Select ( driver.findElement(By.name("OptWeb")));
	
     drpdwn.selectByVisibleText("Google");      //  selctByvisibleText 
     Thread.sleep(2000L);
     System.out.println("selectByVisibleText");
     
     
     
	
	driver.quit();
	
	
}
	

}
