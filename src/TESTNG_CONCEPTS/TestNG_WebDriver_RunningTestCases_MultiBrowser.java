package TESTNG_CONCEPTS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;

public class TestNG_WebDriver_RunningTestCases_MultiBrowser {
	WebDriver driver;
	 String browser="Chrome";
	
    @Parameters({"browser"})
	@BeforeMethod
	
	public void setUp()  {
		
		
		if( browser.equals("Chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium_Student_SW\\Drivers\\chromedriver_win32\\chromedriver.exe");
	 driver = new ChromeDriver();
			
		}
		
		
		
		else if  (browser.equals("IE")) {
			
			System.setProperty("webdriver.ie.driver", "D:\\Selenium_Student_SW\\Drivers\\IEDriverServer_x64_3.12.0\\IEDriverServer.exe");
			 driver = new InternetExplorerDriver();
			
		}
		else if (browser.equals("Firefox")) {
			
			System.setProperty("webdriver.gecko.driver", "D:\\Selenium_Student_SW\\Drivers\\geckodriver-v0.20.1-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
			
		}

		
		
	}
	
	@Test
	
	public void openApplication() throws Exception {
		
		
		
		driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		System.out.println("Open HRMS Application in " +  "" +  "browser ");
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	

	
	@AfterMethod
	
	
	public void tearDown() {
		
		driver.quit();
		
		
		
	}
	
	
	
	
}
