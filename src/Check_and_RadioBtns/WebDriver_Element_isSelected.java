package Check_and_RadioBtns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver_Element_isSelected {
	
	 
	

	public static void main ( String arg[])  {
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium-Training\\Drivers\\chromedriver_win32\\chromedriver.exe");
		
		 WebDriver driver= new ChromeDriver();
		
		
		driver.get("https://www.crmpro.com/register/" );    // Enter URL 
		
		driver.manage().window().maximize();
		
	
	//is Selected Method Method : Used to check the checkboxes,radio buttons, dropdown values are selected or not 
	
	
		// click on Agree terms 
		
		driver.findElement(By.name("agreeTerms")).click();
		
		boolean b1 =driver.findElement(By.xpath("//*[@id='multipleForm']/div[12]/div")).isEnabled();
		
		System.out.println("Booleanvalue is ::" + b1);
	
	
	// is selected 
		boolean b =driver.findElement(By.xpath("//*[@id=\"submitButton\"]")).isSelected();
		
		
		System.out.println("Booleanvalue is ::" + b);
		
		// close webpage
		
		driver.quit();
	}

}
