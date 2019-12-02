package TESTNG_CONCEPTS;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.interactions.Actions;

import org.testng.annotations.*;

public class TestNG_WebDriver_DragandDropMethod {
	public WebDriver driver ;
	@BeforeMethod
	public void setdUp() {
		
System.setProperty("webdriver.chrome.driver","D:\\Selenium_Student_SW\\Drivers\\chromedriver_win32\\chromedriver.exe"); 	
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
	}  
	
	@AfterMethod
	public void  tearDown() {
		
		driver.close();
		
		driver.quit();
		
		
	
		
	}
	@Test
	public void dropAndDropMethod() throws Exception {
		
		
		
		
		// Element need to be drag 
		
		WebElement drag = driver.findElement(By.xpath("//*[@id=\'credit2\']/a"));
		
		
		// Element need to be drop 
		
		WebElement drop = driver.findElement(By.xpath("//*[@id=\'bank\']/li"));
		
		
		// To Perform mouseover using Action class
		
		Actions act = new Actions(driver);
		
		act.dragAndDrop(drag, drop).build().perform();
		
		System.out.println("Element BANK Drag and Drop into DEBIT SIDE Account ");
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
