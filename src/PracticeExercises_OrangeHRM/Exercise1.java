package PracticeExercises_OrangeHRM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise1 {
	
	
	public static void main (String arg [] )  throws Exception 
	
	{
	
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium-Training\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		String URL ="http://127.0.0.1/orangehrm-2.6/login.php";
		String userName= "admin";
		String passWord= "admin";
		String actTitle=driver.getTitle();
		String expTitle ="Orange";
		
		driver.get(URL);
		driver.manage().window().maximize();
		
		System.out.println ("*********************************");
		System.out.println("Loaded Page Successfully::");
		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		System.out.println("added Time::");
		 
		
		driver.findElement(By.name("txtUserName")).sendKeys(userName);
		System.out.println("Entered UserName::");
		
		driver.findElement(By.name("txtPassword")).sendKeys(passWord);
		System.out.println("Entered Password::");
		
		driver.findElement(By.name("Submit")).click();
		System.out.println("Clicked on Button::");
		
		if(  actTitle.equals(expTitle) )
		 
		{
			System.out.println("Title Has Been Matched ::");
		}
		else 
		{
			System.out.println("Title Has'nt  Been Matched ::"+"    "  +   "Actual Title is " + driver.getTitle());
		}
		
	// Welcome	 
		
		String text=driver.getPageSource();
		
		if (text.contains("Welcome"))
		
		{
			System.out.println("Text is Present::");	
		}
		else 
		{
			System.out.println("Text is Not Present  ::"  );
			
		}  
		
		
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("Click on Logout::");
		 
		driver.close();
		
		System.out.println("close Application ::");
		
		
		
	}
	
}
