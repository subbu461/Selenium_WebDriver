package OtherTopics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import  static org.testng.Assert.assertTrue; 

public class TC_020_WebDriver_ReadDataFromTextBox {
  
	public static void main(String arg[]) throws Exception {
		//OPEN CHROME BROWSER
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium-Training\\Drivers\\chromedriver_win32\\chromedriver.exe");
		
		System.out.println("Browser opened");
	
	  
	WebDriver driver=new ChromeDriver();
		//ENTER ULR ADDRESS
		driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		System.out.println("Application Webpage has been opened");
		
		// Enter The UserName and Password 
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@type='Submit']")).click();
		Thread.sleep(5000);
		System.out.println("Login Has been Done");
	  	
		 
		// Verifying Text 
	
			
			assertTrue(driver.findElement(By.xpath("//ul[@id=\"option-menu\"]/li[1]")).getText().matches("Welcome admin"));
		System.out.println("Verified Text is ::" + "welcome admin");
			
			
		 // Entering into Frames ::
		
		driver.switchTo().frame("rightMenu");
		
		System.out.println("Entering into frames ");
		
		// ** Clicking on Add Button ** //
		
		driver.findElement(By.xpath("//*[@id=\'standardView\']/div[3]/div[1]/input[1]")).click();
		Thread.sleep(2000L);
		System.out.println("click on ADD Button ");
		
		
		// To read data from textBox (Employee ID ) 
		
		String empID=driver.findElement(By.xpath("//*[@id='txtEmployeeId']")).getAttribute("value");
		
		System.out.println( "The Employee Nmber in the textbox is " + empID);
		
		
		// Enter The Last and First names using send keys and click o Submit
		
		driver.findElement(By.name("txtEmpLastName")).sendKeys("MALLIREDDY");
		driver.findElement(By.name("txtEmpFirstName")).sendKeys("VENKATASUBBAREDDY");
		driver.findElement(By.id("btnEdit")).click();
		Thread.sleep(2000L);
		System.out.println( "New Employee Added in the List");
		
		// Exit from frame::
		
		driver.switchTo().defaultContent();
		System.out.println("Entering from frames ");
		
		// Logout fromthe web Application 
		
		driver.findElement(By.xpath("//*[@id='option-menu']/li[3]/a")).click();
		System.out.println("Click on to LOGOUT  ");
		
		// quit from Application 
		
		
		driver.close();
		driver.quit();
		
		
		
	}	
		
		
	

}
		
	
	
	
	
	
	
	

