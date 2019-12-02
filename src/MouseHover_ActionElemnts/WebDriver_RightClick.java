package MouseHover_ActionElemnts;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import  org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
public class WebDriver_RightClick {
	
	

	public static void main (String arg[])    throws Exception {
	
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium-Training\\Drivers\\chromedriver.exe");
		
		
		 
		  WebDriver driver=new ChromeDriver();
	
	//Launching Sample site
			driver.get("http://artoftesting.com/sampleSiteForSelenium.html");
			
			//Right click in the TextBox
			Actions action = new Actions(driver);
			
			WebElement searchBox = driver.findElement(By.id("fname"));
			action.contextClick(searchBox).perform();
			System.out.println("RightClick Performed::");
			
			//Thread.sleep just for user to notice the event
			Thread.sleep(3000);
			
			//Closing the driver instance 
			driver.quit();

}
}