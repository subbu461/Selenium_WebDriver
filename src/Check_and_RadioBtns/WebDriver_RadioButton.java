package Check_and_RadioBtns;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;



public class WebDriver_RadioButton {

	public static void main ( String arg [] ) throws Exception  {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium-Training\\Drivers\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://demo.guru99.com/test/radio.html");
		
		// Working With RadioButton 
		
		WebElement radOptn1= driver.findElement(By.id("vfb-7-1"));
		
				
		
		   radOptn1.click();
		  System.out.println("Option1 Is Clickable");
		Thread.sleep(5000); 
		System.out.println( radOptn1.getText());
		
	
		WebElement radOptn2= driver.findElement(By.id("vfb-7-2"));
		
		
		radOptn2.click();
		
		Thread.sleep(5000);
		System.out.println("Option2 Is Clickable");
		System.out.println(radOptn1.getText());
		
		
		WebElement radOptn3= driver.findElement(By.id("vfb-7-3"));
		
		radOptn3.click();
		System.out.println("Option3 Is Clickable");
		Thread.sleep(5000);
		System.out.println(radOptn1.getText());
		
		// Close Application 
		
		driver.quit();
		
		
		
	}
}
