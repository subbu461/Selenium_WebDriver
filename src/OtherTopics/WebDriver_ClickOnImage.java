package OtherTopics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver_ClickOnImage {
	public static void main ( String arg[]) {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium-Training\\Drivers\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://portal.blueprism.com/user/login?destination=/learning");
	 
	// Click on Image In WebPage  
		
		WebElement image =driver.findElement(By.linkText("Home"));
		image.click();
				
		System.out.println(image.getText());
		}
	

}


