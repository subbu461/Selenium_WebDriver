package JavaScriptExecutors_WebDriver;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GenarateAlerts_JS {
	public static void main (String agr[]) throws IOException, InterruptedException  {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium-Training\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new  ChromeDriver(); 
		  
		  
		driver.get("https://crmpro.com/index.html");
		 
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  
	    
		
		//Login Application 
		
		driver.findElement(By.name("username")).sendKeys("Venky461");
		
		driver.findElement(By.name("password")).sendKeys("Venky461");
		
		WebElement loginBtn = driver.findElement(By.xpath("//input [contains (@type,'submit')] "));
		 
	   
	// JavaScript Executor :: TO styling bordering of a element 
		
	      JavascriptExecutor js = ((JavascriptExecutor )driver);
	      
	      js.executeScript("arguments[0].style.border='3px solid red '", loginBtn);
	      
	      System.out.println("HightElement  with red color ");
	      
	      // Taking ScreenShot : of Error or border Element: 
	      // and  Store in file format 
	       
	      
	      File  src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	      FileUtils.copyFile(src, new File("C:\\Users\\M V SUBBAREDDY\\eclipse-workspace\\SELENIUM WEBDRIVER\\Screenshots.png"));
	      
	      Thread.sleep(5000L);
	       
	      
	      //  Generate Alerts in Webpage Elements
	      
	      String message = "There is a issue with the LoginButton in the webpage";
	      
	      JavascriptExecutor  genAlerts  = ((JavascriptExecutor) driver );
	      
	      genAlerts.executeScript("alert('" +  message+"')");
	      
	      
	      
	      
	      // Close Browser
	      
	      
	   driver.close();	
	
	  
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


