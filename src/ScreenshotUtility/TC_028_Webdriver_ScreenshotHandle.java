package ScreenshotUtility;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


import  java.io.File;
import org.apache.commons.io.FileUtils;
import java.io.IOException;

public class TC_028_Webdriver_ScreenshotHandle { 
	 
	static WebDriver driver;
	  
	 
	public static void main (String arg[]) throws Exception{
		 
		System.setProperty("webdriver.chrome.driver","D:\\Selenium-Training\\Drivers\\chromedriver.exe");
		
		
		  driver = new ChromeDriver();
		driver.manage().window().maximize();                        //  maximize window 
		driver.get("https://crmpro.com/index.html");
		Thread.sleep(4000);
		System.out.println("Title Of the Page is Before Login ::" + driver.getTitle());
		Thread.sleep(7000);
		takeScreenshot("CRMPRO_LoginPage");
		System.out.println("Title Of the Page is Before Login ::" + driver.getTitle());
		
		driver.findElement(By.name("username")).sendKeys("Venky461");
		System.out.println("USERNAME Entered::");
		driver.findElement(By.name("password")).sendKeys("Venky461");
		System.out.println("PASSWORD Entered::");
		driver.findElement(By.xpath("//*[@id='loginForm']/div/div/input")).click();
		System.out.println("CLICK on LOGIN Button ::");
		Thread.sleep(4000); 
     
		System.out.println("Title Of the Page is After Login ::" + driver.getTitle());	
		takeScreenshot("CRMPRO_HomePage");
	 	
		
		Thread.sleep(4000);
		 
		 
		//driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
		
		driver.get("//www.crmpro.com/index.cfm?logout=1");
	    
		//driver.findElement(By.cssSelector("")).click();
		System.out.println("LogotSuccessfully");
       driver.quit();               // close Application
       System.out.println("CLOSE Application ::");	
		
	} 
	
public  static void takeScreenshot(String fileName)  throws IOException {
	 
	// 1. Take Screenshot and then store it in a fileformat::
	
	File file1 =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	System.out.println("1. Take Screenshot and then store it in a fileformat::");
	 
	// 2.Now copy the file to desiredlocation Using filecopy Method::
	
	FileUtils.copyFile(  file1, new File("/SELENIUM WEBDRIVER/Screenshots" +fileName+".png"));
	
	System.out.println("2.Now copy the file to desiredlocation Using filecopy Method::");
}
		
}
