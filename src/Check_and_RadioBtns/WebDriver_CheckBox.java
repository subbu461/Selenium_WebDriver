package Check_and_RadioBtns;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
   
  
public class WebDriver_CheckBox {
	
	public static void main ( String arg[]) {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium-Training\\Drivers\\chromedriver.exe");
		 
	
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("http://demo.guru99.com/test/radio.html");
	
	// Working With CheckBox 
	// CheckBox 1
	WebElement  checkBox1= driver.findElement(By.id("vfb-6-0")); 
	checkBox1.click();
	
	if(checkBox1.isSelected()) {
		
		System.out.println("Checkbox1 is Toggled ON ");
	}
	else
	{
		System.out.println("Checkbox1 is Toggled OFF ");
	}
	
	// CheckBox 2
	WebElement  checkBox2= driver.findElement(By.id("vfb-6-1"));
	checkBox2.click();
if(checkBox2.isSelected()) { 
		
		System.out.println("Checkbox2 is Toggled ON ");
	}
	else
	{ 
		System.out.println("Checkbox2 is Toggled OFF ");
	}

// CheckBox 3
	WebElement  checkBox3= driver.findElement(By.id("vfb-6-2"));
	checkBox3.click();
	
if(checkBox3.isSelected()) {
		
		System.out.println("Checkbox3 is Toggled ON ");
	}
	else
	{ 
		System.out.println("Checkbox3 is Toggled OFF ");
	}
	
	
	
	
	
	
	
	
	//
 driver.quit();

}
}
