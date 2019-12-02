package PageObjectModel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RegistrationPageTest {
	
	
  
	@Test
	
	public void verifyRegistrationPage() {  
		
		    
  System.setProperty("webdriver.chrome.driver", "D:\\Selenium-Training\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	 
	//RegistrationPage1  regPage= new RegistrationPage1(driver );
	RegistrationPage2  regPage= new RegistrationPage2(driver);
	//  
	driver.manage().window().maximize();  
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	driver.get("http://www.newtours.demoaut.com/");
	 
	    
       regPage.clkRegLink();      
       regPage.setFirstName("VENKATASUBBAREDDY");
       regPage.setLastName("MALLIREDDY");
       regPage.setPhone("8106424830");
       regPage.setEmail("m.subbu461@gmail.com");
       regPage.setAddress1("NALAPPAREDDYPALLI");
       regPage.setAddress2("RAJAMPETA");
       regPage.setcity("KADAPA");
       regPage.setState("AP");
       regPage.setpostal("560037");
       regPage.setCountry("INDIA"); 
        
       regPage.username("Venky461");
       regPage.password("Venky461");
       regPage.cnfrmpassword("Venky461");
        
       regPage.clckSubmit();  
        
       //VALIDATION 
        
       if(driver.getPageSource().contains("Thank you for registering"));
       {
     	   
    	  System.out.println( "Registartion TestPassed") ;
       
 
        
      
       }

}
}