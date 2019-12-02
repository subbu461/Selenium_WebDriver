package TESTNG_CONCEPTS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import java.io.FileInputStream;
 import jxl.Sheet; 
 import jxl.Workbook;
 
 import org.testng.Reporter;  
 import org.testng.annotations.AfterClass;
 import org.testng.annotations.BeforeClass;
 import org.testng.annotations.Test;
 

  

public class TestNG_WebDriver_Excel {
	
	public WebDriver driver;
	
	
	
	@BeforeClass
	public void Startup()  {
		
		
	System.setProperty("webdriver.chrome.driver", "D:\\\\Selenium_Student_SW\\\\Drivers\\\\chromedriver_win32\\\\chromedriver.exe")	;
	driver=new ChromeDriver();
	System.out.println("ChromeBrowser Should be Opened");
		
		
	}
	@AfterClass 
	public void tearDown()  {
		
		driver.close();
		
		System.out.println("ChromeBrowser Should be Closed");
		
		
		
	}	

@Test

public void login( )  throws Exception  {
	
	// Reading Values of UserName and Password From EXcel Sheet and Assigning to Variables Here
	
FileInputStream file = new FileInputStream("C:\\Users\\M V SUBBAREDDY\\Desktop\\HRMlogin.xls");   // FilePath Address
	 
	Workbook wrkbk=Workbook.getWorkbook(file);                                               // Workbook Name 
	 
	Sheet sht=wrkbk.getSheet("Sheeet1");                                                            // WorkSheet Name
	
	// Assigning Usernaame and Password to Variables 
	
	String US=sht.getCell(0,1).getContents();                                               // Username
	 
	String PW=sht.getCell(1,1).getContents();                                               // Password
	 
	  
	// Typing Variable from Excel into Webpage Application 
	
	Reporter.log("****TestCaseSteps*******");
	driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
	Reporter.log("1.Application Opened");
	 
	driver.findElement(By.name("txtUserName")).sendKeys("admin");
		Reporter.log("2.Typing UserName");	
	 
	driver.findElement(By.name("txtPassword")).sendKeys("admin");
		Reporter.log("2.Typing Password");
	
	driver.findElement(By.name("Submit")).click();
	
	Reporter.log("3.Login Complete");
		
	Thread.sleep(4000L);	
  driver.findElement(By.linkText("Logout")).click();
	
	Reporter.log("4.Logout Complete");	
		
	
}












}