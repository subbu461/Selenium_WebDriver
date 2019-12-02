package ToolTip_Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tooltip_actionClass {
	
	 
	
	public static void main (String arg[]) {
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium-Training\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/tooltip-and-double-click/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		 
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		System.out.println("Tool WebPage is Displayed ");
		
		// Actions Class 
		
		WebElement   eleToolTip = driver.findElement(By.id("tooltipDemo"));
		Actions action=new  Actions( driver);
		
		action.moveToElement(eleToolTip).perform();
		
		// tooptix Text 
		
		WebElement textTooltip = driver.findElement(By.cssSelector(".tooltiptext"));
		
		// get Into String 
		
		
		String  textofToolTip= textTooltip.getText();
		 
		System.out.println("TooltipText ..................>>>>>>>>>>>>>"+textofToolTip);
		
		
		if(textofToolTip.equalsIgnoreCase("We ask for your age only for statistical purposes."))
		{
			System.out.println("PASS: ToolTip case Passed");
		}
		else {
			
			System.out.println("FAIL: ToolTip case Failed");  
		}
		  
		 
		// Close Browser  
		
		driver.close(); 
		
	}

}
