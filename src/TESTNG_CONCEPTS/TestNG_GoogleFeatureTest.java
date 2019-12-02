package TESTNG_CONCEPTS;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;


public class TestNG_GoogleFeatureTest {
	
	
	WebDriver driver;
	
	 //1 // 4  //7
	@BeforeMethod    
	
	public void setUp()  {
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium_Student_SW\\Drivers\\chromedriver_win32\\chromedriver.exe");
		
		 driver=new ChromeDriver();        // To Launch Browser 
		 
		 driver.manage().window().maximize();
		 driver.get("http://www.google.com");
		 
		 driver.manage().deleteAllCookies();
		 
		 driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		
	}
	//3  //6   //9
	
	@AfterMethod
	
	public void tearDown() {
		
		
		driver.quit();  
		
		
		
	}
	
	//2  
	@Test(priority=1,groups="Title")
	
	
	public void googleTitleTest()  {
		
		
		String title = driver.getTitle();
		
		
		System.out.println("Title is"  + "      " +    title);
		
		
		
		
	}
	
	//5   
@Test(priority=2,groups="Logo")
	
	
	public void googleLogoTest()  {
		
		
	boolean logo = driver.findElement(By.id("logo-default")).isDisplayed();
	
	
	System.out.println(" Checked Google Logo Is Displayed or Not   ");
		
	//*[@id="logo-default"]
		
	
	//*[@id="gb"]/div[2]/div[3]/div[1]/div/div[2]/a
		
	}
	
	
@Test(priority=3,groups="Link")  //8
	
	public void imageLinkTest()  {
	
    boolean link=	driver.findElement(By.linkText("Images")).isDisplayed();
    
    System.out.println("clicked On IMAGES Link ");

}
	
@Test(priority =4,groups="Test" )	
	
	public void Test1() {
	
	
	System.out.println("PRINT TESTCASE 1 ");
	
}
	
@Test(priority =5,groups="Test")	

public void Test2() {


System.out.println("PRINT TESTCASE 2 ");

}

@Test(priority =6, groups="Test")	

public void Test3() {

System.out.println("PRINT TESTCASE 3 ");

}









}
