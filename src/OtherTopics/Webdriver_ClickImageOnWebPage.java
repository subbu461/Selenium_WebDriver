package OtherTopics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;



public class Webdriver_ClickImageOnWebPage {
	
	public static  void main( String arg[])  {
		
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium-Training\\Drivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.navigate().to("www.facebook.com"); 
		
		    
		// Click on The FACEBOOK Image
		
		//click on the "Facebook" logo on the upper left portion		
		driver.findElement(By.cssSelector("a[title=\"Go to Facebook home\"]")).click();					

		
		
		//verify that we are now back on INSTAGRAM login page		
		
		
		if (driver.getTitle().equals("Facebook - log in or sign up")) {							
        System.out.println("We are back at instagram's signin page");					
    } else {			
        System.out.println("We are NOT in Instagram's signin page");					
    }		
			driver.close();	
		
		
		
		
		
		
	}
	
	
	

	

}
