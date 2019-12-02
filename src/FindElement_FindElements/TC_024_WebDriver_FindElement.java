package FindElement_FindElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class TC_024_WebDriver_FindElement {
	
	public static void main ( String args[])  throws Exception  {
		
		

		System.setProperty("webdriver.chrome.driver","D:\\Selenium-Training\\Drivers\\chromedriver_win32\\chromedriver.exe");
		
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("http://demo.guru99.com/test/ajax.html");
		Thread.sleep(4000);
		
		// FindElement  of RADIO BUTTON (NO)
		
		
		WebElement NoRadBtn = driver.findElement(By.id("no"));
		NoRadBtn.click();
		
		
		// FindElement  of CLICK BUTTON
		
		WebElement ChckBtn = driver.findElement(By.id("buttoncheck"));
		ChckBtn.click();
		
		System.out.println("Radio button is checked and it's value is No");
		
	}
	
	
	
	

}
