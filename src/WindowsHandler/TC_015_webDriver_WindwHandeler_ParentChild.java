package WindowsHandler;


import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class TC_015_webDriver_WindwHandeler_ParentChild {
	
	
	public static void main (String arg[])  throws Exception {
	
	 
		System.setProperty("webdriver.chrome.driver","D:\\Selenium-Training\\Drivers\\chromedriver_win32\\chromedriver.exe");
			
	
	  	
WebDriver  driver = new ChromeDriver();


driver.manage().window().maximize(); 

 
driver.get("http://toolsqa.com/automation-practice-switch-windows/");




// parentWindowHandle 

String parentWindowhandle= driver.getWindowHandle();

System.out.println("parentwindowhandle is " +"" +  parentWindowhandle);

WebElement clickElement = driver.findElement(By.id("button1"));


for(int i = 0; i < 2; i++)
{
clickElement.click(); 



Thread.sleep(3000);

}


Set<String> allChildWindowHandles = driver.getWindowHandles();

String lasthandlewindow="";
for (String handle:allChildWindowHandles)
{ 

System.out.println("window child handle name is "  +  handle);
Thread.sleep(5000L);
 
System.out.println("Navigating to google.com");
driver.switchTo().window(handle); //Switch to the desired window first and then execute commands using driver
driver.get("http://google.com");

lasthandlewindow=handle;

}

// Switch to parent window  and close 


driver.switchTo().window(parentWindowhandle);
driver.close();



driver.switchTo().window(lasthandlewindow);

driver.get("www.facebook.com");
driver.quit();
System.out.println("close web page");


}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
