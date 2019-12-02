package GetTitle_And_Verify;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

public class TC_005_Webdriver_VerifyText {
	
	
public static void main ( String arg[])  throws Exception  {
	
	
	//OPEN CHROME BROWSER
	
		System.setProperty("webdriver.chrome.driver","D:\\Selenium-Training\\Drivers\\chromedriver_win32\\chromedriver.exe");
			
		 
		  WebDriver driver=new ChromeDriver();
			//ENTER ULR ADDRESS
			driver.navigate().to("http://www.goibibo.com/");
			driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			Thread.sleep(3000);
			System.out.println("Application Webpage has been opened");
	
			// Verify Text: "international Flights" text is exist in the page or not 
			
			String expText ="International Flights";
			
			
			//Method 1 :: first way to verify using locator and getText() method 
			
			String actText=driver.findElement(By.xpath("//*[@id='footer']/div[2]/div[1]/ul[1]/li[4]/a")).getText();
			
			if(actText.contains(expText)) {
				
				System.out.println("Expected Text "+ expText          +"is Present in the WebPage");
			}
			
			else 
			{
				System.out.println("Expected Text "+ expText  +"is  not Present in the WebPage");
			}
			
			
			//Method 2 :: first way to verify using pageSourceMethod
			
			String pageSource=driver.getPageSource();
			
			
			if(pageSource.contains(expText)) {
				
				System.out.println("Expected Text "+ expText          +"is Present in the WebPage");
			}
			else 
			{
				System.out.println("Expected Text "+ expText  +"is  not Present in the WebPage");	
				
				
			}
				
				
				
				
				
				
				
				
				
				
				
				
			
}
	
	
	
	

}
