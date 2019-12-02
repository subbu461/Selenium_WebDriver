package DropDownConcept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import java.util.List;

public class TC_011_WebDriver_SelectAllOptions_DropDown {
	 
	
	public static void main (String [] arg)  throws Exception  {
		
		
		
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium-Training\\Drivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.softwaretestingmaterial.com/sample-webpage-to-automate/");
		
		// Method 1  
		WebElement allOptions = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/main/article/div/form/p[6]/select"));
		
	 	
	Select sel = new Select(allOptions);
	System.out.println(sel.getOptions().getClass());
		
		// Method 2
		
		WebElement dropdown =driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/main/article/div/form/p[6]/select"));
		
		Select select = new Select(dropdown);
		
		List<WebElement> options = select .getOptions();
		
		for (WebElement item:options)  {
			
			System.out.println ("dropdownvalues are " + item.getText());
			
			 
			
		}
		
		
		
	}
	

	
		
	

}
