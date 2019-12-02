package TESTNG_CONCEPTS;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.*;


public class TestNG_Methods_Priorities {
	
	public String URL="http://demo.guru99.com/test/newtours/";
	public String driverpath="D:\\\\\\\\Selenium_Student_SW\\\\\\\\Drivers\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe";
	
	public WebDriver driver;
public String expected =null;
 public String actual=null; 
 
@BeforeTest            //  BEFORE TEST

public void launchBrowser() {
	
	System.out.println("Launching Browser");
	
	System.setProperty("webdriver.chrome.driver", driverpath);
	
	driver= new ChromeDriver();
	driver.get(URL);
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
}

@BeforeMethod                       // BEFOERE METHOD


public void verifyHomePageTitle()  {
	
	
	String expectedTitle = "Welcome: Mercury Tours";
    String actualTitle = driver.getTitle();
	Assert.assertEquals(actualTitle, expectedTitle);
	
	System.out.println("verified HomepageTitle is  ::" +actualTitle);
	
	
	
	
}
  

@Test (priority=1)                       // TEST  1


public void register() {
	
	
	driver.findElement(By.linkText("REGISTER")).click();
	
	 expected = "Register: Mercury Tours";
     actual = driver.getTitle();
     Assert.assertEquals(actual, expected);
     System.out.println( actual);
	
	System.out.println("Click on REGISTER and It should be Opened ");
}


@Test    (priority=2)                      // TEST 2


public void support() {
	
	
	driver.findElement(By.linkText("SUPPORT")).click() ;
    expected = "Under Construction: Mercury Tours";
    actual = driver.getTitle();
    Assert.assertEquals(actual, expected);
    System.out.println( actual);
	System.out.println("Click on SUPPORT  and It should be Opened ");
}



@AfterMethod 
public void  goBackToHomePage()  {
	
	driver.findElement(By.linkText("Home")).click();
	
	
	System.out.println("Click HOME Link and Its retrives Back");
	
	
} 






@AfterTest               // AFTER   TEST
 
public void closeBrowser() {
	System.out.println("Closed Browser");
	
	driver.close();
	
	
}



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
