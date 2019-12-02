package DatePicker_Calendar;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_030_WebDriver_DatePicker_Demo {

	public static void main (String arg[]) throws Exception {
		 
		 
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium-Training\\Drivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies(); 
		driver.manage().window().maximize();
		
		// Open RedBus Application 
		driver.navigate().to("https://www.redbus.in/");
		System.out.println("REDBUS APPLICATION HAS BEEN OPENED");
		Thread.sleep(4000L);
		 
		// Select  FROM  Date   
	driver.findElement(By.xpath("//*[@id=\"search\"]/div/div[3]/div/label")).click();
	System.out.println("Click On ONWARD DATE");
	Thread.sleep(4000L);
	
	// Static way of handle WebTable
	// Selected DATE in the Calender WebTable
	
driver.findElement(By.xpath("//*[@id=\'rb-calendar_onward_cal\']/table/tbody/tr[6]/td[4]")).click();
	
	
System.out.println("Select the  DATE");
Thread.sleep(4000L);  
	
	
// Dynamic Way of handling WebTable



List<WebElement> dates = driver.findElements(By.xpath("//*[@id='rb-calendar_return_cal']"));

  int totaldates=dates.size();
System.out.println(totaldates);

for (int i=1;i<=totaldates; i++)  {
	
	String datePrint= dates.get(i).getText();
	
	System.out.println("Date is Printed By" + datePrint);
	
	
	if (dates.equals("25")) {
		
		dates.get(i).click();
		break;
		
		

	}
}
driver.close();
driver.quit();
		
	}	
	
	
}
