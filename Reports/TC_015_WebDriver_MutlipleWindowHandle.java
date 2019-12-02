package WEBDRIVER;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;



import java.util.Set;
import java.util.Iterator;

public class TC_015_WebDriver_MutlipleWindowHandle {
	
	
	public static void main ( String arg[])   {
		
		
		// Instantiating the Browser  
		System.setProperty("webdriver.chrome.driver","D:\\Selenium-Training\\Drivers\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver driver= new ChromeDriver();
		
		String URL="http://www.naukri.com/";
		
// Maximize window 
		
		driver.manage().window().maximize();
		
// Entering URL Into Browser
		
		driver.get(URL); 
		  
		//It will return parent windows named ad String 
		
	 	String mainwindow= driver.getWindowHandle();
	 	
	 	System.out.println(mainwindow);
		// 
	//	It will return no of child windows opened by webdriver and set as Strings 
		
		Set<String> set = driver.getWindowHandles();
		
		
		// Using Iterator to iterate with in windows
		 
		Iterator<String> itr= set.iterator();
		 while(itr.hasNext()){
		 String childWindow=itr.next();
		
		// Compare whether the main windows is not equal to child window. If not equal, we will close.
		 if(!mainwindow.equals(childWindow)){
		 driver.switchTo().window(childWindow);
		 System.out.println(driver.switchTo().window(childWindow).getTitle());
		 driver.close();
		 }
		 }
		 // This is to switch to the main window
		 driver.switchTo().window(mainwindow);
		
	
		 // Close Window	 
	            driver.close();
	 
	       // Close Window	
	           driver.quit();
	
	}
	
	
	

}
