package FindElement_FindElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
public class TC_024_WebDriver_FindElements {
	
	
	
public static void main ( String args[])  throws Exception  {
		
		

	System.setProperty("webdriver.chrome.driver","D:\\Selenium-Training\\Drivers\\chromedriver_win32\\chromedriver.exe");
	
		 
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("http://demo.guru99.com/test/ajax.html");
		Thread.sleep(4000);

		
	// FindElements Examples :Listing all Elements one after another	
		
		
	List <WebElement > elements= driver.findElements(By.name("name"));
	
		System.out.println("No of Elements " +  elements.size());
		
		
		for (int i =0; i<elements.size();i++) {
			
			
			System.out.println("RadioButtontext:" + elements.get(i).getAttribute("value"));
		}
		
				
		System.out.println("Task Has Been Done");	
		driver.close();
		
}
}