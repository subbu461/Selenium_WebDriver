package DatePicker_Calendar;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import java.util.concurrent.TimeUnit;
import java.util.List;
import org.openqa.selenium.By;

public class TC_030_WebDriver_SelectDate_CalenderWidget {
	public static void main (String arg[]) throws Exception{
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium-Training\\Drivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		System.out.println("Open Browser");
		
		driver.navigate().to("https://jqueryui.com/datepicker/");
		System.out.println("Open dataPicker WebSite");
		driver.manage().window().maximize();
	  driver.switchTo().frame(0);
	  driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	  //Click on TextBox So that DatePicker will Display();
	   driver.findElement(By.id("datepicker")).click();
	   // click on next so that will b in nextmonth
	   
	driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/a[2]/span")).click();
	   // if a Particular cell Matches value then it will select it 
	    WebElement dateWidget = driver.findElement(By.id("ui-datepicker-div"));
	   List <WebElement> rows = dateWidget.findElements(By.tagName("tr"));
	   List <WebElement> columns  = dateWidget.findElements(By.tagName("td"));
		
	   // Select 10 th Date 
	   
	   for(WebElement cell:columns ) {
	   if(cell.getText().equals("10")) {
		   cell.findElement(By.linkText("10")).click();
		   System.out.println(cell.getText()); 
		   Thread.sleep(5000);
		  
		   break;
		   
		   
	   }
	
	  
	}
	
	   driver.close();
	   System.out.println("WebPage Closed:");
	}
}
