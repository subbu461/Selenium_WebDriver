package MouseHover_ActionElemnts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverElement_Offset_ {
public static void main (String arg[]) throws Exception{
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium-Training\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		// Enter URL      
		
		String URL="https://demoqa.com/menu/";
	 
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		
		 
		// MouseHover using OffSet Method (Element,X offset, Y offSet)
		
			Actions actions = new Actions(driver);
		
		WebElement  element = driver.findElement(By.linkText("Slider"));
		
		System.out.println("Clicked on SLIDER icon");
		element.click(); 
		
		WebElement  pointer= driver.findElement(By.id("slider"));
		actions.moveToElement(pointer, 50, 80).perform();
		pointer.click(); 
		
		System.out.println("MouseHover  Using Offset Performed::");
		
		driver.close();
		
}
}