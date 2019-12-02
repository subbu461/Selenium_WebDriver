package Check_and_RadioBtns;
  
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver_Element_IsEnabled {
	
	
	public static void main ( String arg[])  {
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium-Training\\Drivers\\chromedriver_win32\\chromedriver.exe");
		
		 WebDriver driver= new ChromeDriver();
		
		 
		driver.get("https://www.crmpro.com/register/" );    // Enter URL 
		
		driver.manage().window().maximize();
		
		
		  
		// 2.Is_Enabled  Method : Used to check or verify element is enabled or not in the webpage.
		
		
		
	boolean b =driver.findElement(By.xpath("//*[@id=\"submitButton\"]")).isEnabled();
		
		
	System.out.println("Booleanvalue is ::" + b);
		
	// click on Agree terms 
	
	driver.findElement(By.name("agreeTerms")).click();
	
	boolean b1 =driver.findElement(By.xpath("//*[@id='multipleForm']/div[12]/div")).isEnabled();
	
	System.out.println("Booleanvalue is ::" + b1);
		
	
	
	
	
	
	
	
	
	
	driver.quit();
	}
	

}
