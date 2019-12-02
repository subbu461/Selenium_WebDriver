package JavaScriptExecutors_WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_014_WebDriver_Element_Highlight {
	
	
	
public static void main (String arg[]) throws Exception {
		 
		 
		
	System.setProperty("webdriver.chrome.driver","D:\\Selenium-Training\\Drivers\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies(); 
		driver.manage().window().maximize();
		
		// Open RedBus Application 
		driver.navigate().to("https://crmpro.com/index.html");
		System.out.println("FREECRM APPLICATION HAS BEEN OPENED");
		Thread.sleep(4000L);
		 
	// Login credentials
	 
	
	driver.findElement(By.name("username")).sendKeys("Venky461");    // Username
	
	driver.findElement(By.name("password")).sendKeys("Venky461");     // password 
	
	WebElement loginBtn = driver.findElement(By.xpath("//input[contains(@type,'submit')]"));
	        //loginBtn.click(); 
	
     Thread.sleep(4000);
	    
     
     // Static Method      
     
     
    // JavascriptExecutor js= (JavascriptExecutor) driver;
     
    // js.executeScript(" arguments[0].setAttribute('style',' background:black ; border :2px solid yellow ;');", loginBtn);
   
     
     // Dynamic Method
     highLightMethod(driver,loginBtn);
     driver.close();
     
     
     
     
     
      
}    
    public static void highLightMethod(WebDriver driver, WebElement loginBtn )   {
    	
    	
    	 
    	
    	
    	 JavascriptExecutor js= (JavascriptExecutor) driver;
         
         js.executeScript(" arguments[0].setAttribute('style',' background:green ; border :2px solid yellow ;');", loginBtn);
    	
    	
    
    }
     
     
     
     
     
     
     
     
  
	

}
