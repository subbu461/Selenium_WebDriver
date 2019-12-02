package ApachePOI_Excel;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;


public class WebDriver_No_Of_Rows_Columns {
	
	
	public static void main ( String arg[]) throws Exception  {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium-Training\\Drivers\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver chromedriver= new ChromeDriver();
		 
		  
		chromedriver.navigate().to("http://demo.guru99.com/test/web-table-element.php");
		chromedriver.manage().window().maximize();
		Thread.sleep(5000);
		System.out.println("Application Opened in chrome");
		 
	// Number of rows and Columns in Webpage OR WebTable	
		 
		
		List<WebElement> columncount=chromedriver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
		
		System.out.println("Total Rows in WebTable is : " + columncount.size());
		
		
 List<WebElement> rowcount=  chromedriver.findElements(By.xpath("//*//*[@id=\"leftcontainer\"]/table/tbody/tr/td[1]"));
		
		
		System.out.println("Total Columns  in WebTable is : " + rowcount.size());
		chromedriver.close();
	}

	
}
  