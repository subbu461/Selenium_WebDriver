package WindowsHandler;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Set;

import org.openqa.selenium.By;
public class TC_015_WebDriver_Windowhandeler_LooP {
	
	
	public static void main (String arg[]) throws Exception{
		 
		System.setProperty("webdriver.chrome.driver","D:\\Selenium-Training\\Drivers\\chromedriver_win32\\chromedriver.exe");
		
		
 	  	
 WebDriver  driver = new ChromeDriver();
	
 
 driver.manage().window().maximize(); 
	
	 
 driver.get("http://toolsqa.com/automation-practice-switch-windows/");
	
 //WebElement clickElement = driver.findElement(By.id("button1"));
 
// WebElement clickElement1 = driver.findElement(By.xpath("//*[@id='content']/div[1]/div[2]/div/div/div/div/p[4]/button"));
 
 WebElement clickElement2 = driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div[2]/div/div/div/div/p[5]/button"));
 
 for(int i = 0; i < 2; i++)
 {
	// clickElement.click(); 
 //clickElement1.click();
 clickElement2.click();
 //System.out.println(clickElement.getText());
 //System.out.println(clickElement1.getText());
 System.out.println(clickElement2.getText());
 Thread.sleep(3000);
	
	
 }
    driver.close();
	driver.quit();
	System.out.println("close web page");
	
	
	}

}
