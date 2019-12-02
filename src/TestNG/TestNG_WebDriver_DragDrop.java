package TestNG;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.*; 


public class TestNG_WebDriver_DragDrop {   
	WebDriver driver;
	  
	@Test  
	public void testDragDrop() throws Exception  {
		driver.navigate().to("http://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		
		Thread.sleep(10000);
	 	
		// check actual and expected title
		assertEquals("Dropapable| jQuery UI",driver.getTitle());
		
	
		//  i frames concpets applied here
		
		driver.switchTo().frame(0);
		
		// Action class: because mouse hover 
		Actions act =new  Actions(driver);
		
		WebElement dragFrom=driver.findElement(By.xpath("//*[@id=\'draggable\']"));
		WebElement dropTo=driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		
		// drag this and drop into
		act.dragAndDrop(dragFrom,dropTo).build().perform();
			
				
		//  drop here		
				
				
		Thread.sleep(4000);
		
	}
	  
	


	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium_Student_SW\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		 
		
	}
	@AfterMethod
public void tearDown() {
		driver.quit();
		
	}
}
