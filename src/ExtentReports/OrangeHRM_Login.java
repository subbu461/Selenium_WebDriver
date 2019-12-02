package ExtentReports;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class OrangeHRM_Login {
	
	
	public static void main (String arg[]) throws Exception  {
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium-Training\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		 
		
		driver.manage().deleteAllCookies();
		
		driver.manage().window().maximize();
		
		driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
		
		// Login HRM    
		   
		
		String USR="admin";
		String PWD="admin";  
		
		//Testcase ExtentReport
		ExtentHtmlReporter reports= new ExtentHtmlReporter("./Reports/page1.html");
		
		ExtentReports    genReports= new  ExtentReports ();
		
		genReports.attachReporter(reports);
		
		ExtentTest logger =genReports.createTest("LOGIN HRM", "Logged into the  OrangeHRM Application ");
		
		
		
		driver.findElement(By.name("txtUserName")).sendKeys(USR);
		logger.log(Status.INFO,"Entered USerName");
		
		driver.findElement(By.name("txtPassword")).sendKeys(PWD);
		logger.log(Status.INFO,"Entered PAssword");
		
		driver.findElement(By.xpath("//input[@name='Submit']")).clear();
		logger.log(Status.PASS," Logged Into Application");
		
		System.out.println("Logged into OrangeHRM Successfully:");
		
		genReports.flush();
		
	}


}
