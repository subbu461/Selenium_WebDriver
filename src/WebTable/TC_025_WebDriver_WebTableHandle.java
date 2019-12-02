package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_025_WebDriver_WebTableHandle {
	
	public static void main (String arg[] )  throws Exception {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium-Training\\Drivers\\chromedriver_win32\\chromedriver.exe");
		
	
	WebDriver driver=new ChromeDriver();  
	  
 System.out.println("Browser is Opened");
	
driver.get("https://www.w3schools.com/html/html_tables.asp");

// objects data  
 
//*[@id="customers"]/tbody/tr[2]/td[1]


//*[@id="customers"]/tbody/tr[2]/td[1]

  String beforePath= "//*[@id='customers']/tbody/tr[";
 String afterPath ="]/td[1]"   ;       
 // *** FOR LOOP APPROACH ***//

for (int i=2 ; i<=7; i++) {
	
	String actualPath= beforePath +  afterPath;
	
	WebElement element =driver.findElement(By.xpath(actualPath));
	System.out.println(   element.getText());
	
	// USING IF Condition 
	
	if (element.getText().equals("Perl")) {
		
		System.out.println("Language  name is " + element.getText() +  "found Here ");
		System.out.println( element.getText() +  "found at the Position of  " + i );
	}
	
	
}
		
	}	

}
