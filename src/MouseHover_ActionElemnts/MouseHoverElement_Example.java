package MouseHover_ActionElemnts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverElement_Example {
	
	
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
		 
	 	
		// MouseHover Action  : Music
		
		Actions actions = new Actions (driver);
		
		WebElement mainMenu = 	driver.findElement(By.id("ui-id-9"));
		
		actions.moveToElement(mainMenu).build().perform();
		Thread.sleep(4000L);
		
		System.out.println("Music ICon Has been Clicked");
		
	
		// SubMenu - I : Rock 
		
		
     WebElement 	subMenu1= driver.findElement(By.id("ui-id-10"));
     
	actions.moveToElement(subMenu1).build().perform();
	Thread.sleep(5000L);
	
	System.out.println("Rock  Icon Has been Clicked");
	
	
	// SubMenu - II: Classic
	
	
    WebElement 	subMenu2= driver.findElement(By.id("ui-id-12"));
    
	actions.moveToElement(subMenu2).build().perform();
	
	System.out.println("Classic   Icon Has been Clicked");
	
	
	// Close 
	
	driver.close();
	driver.quit();
	
	}
}
