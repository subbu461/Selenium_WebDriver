package OtherTopics;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;


public class WebDriver_PracticeTestcase01 {
	
	
	public static String UN= "admin";
	public static String PW= "admin";
	public static void main (String arg[])throws Exception {
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium-Training\\Drivers\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver driver1= new ChromeDriver();
		
		System.out.println("Browser opened");
		
		driver1.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
		driver1.manage().window().maximize();
	
	  System.out.println("URL Entered for open the webbased application");
	  Thread.sleep(3000);
	  if(driver1.getTitle().equals("OrangeHRM - New Level of HR Management"))
	  {
		  System.out.println("Title Matched");
	  }
	  else{
		  System.out.println("Title was not matched :and Expected Title is"+ driver1.getTitle());
	  }
	  
	  
	  // enter username and password 
	  
	  driver1.findElement(By.name("txtUserName")).sendKeys(UN);
	  driver1.findElement(By.name("txtPassword")).sendKeys(PW); 
	  
	  System.out.println("Entered Username and Password");
	  driver1.findElement(By.name("Submit")).click();
	
	  // click on login 
	 
	  System.out.println("Click on Login");
	  
	  //added wait statement
	  Thread.sleep(5000);
	  
	  // verify title in Homepage
	   
	  if(driver1.getTitle().equals("OrangeHRM"))
	  {
		  System.out.println("Title Matched");
	  }
	  else{
		  System.out.println("Title was not matched :and Expected Title is"+ driver1.getTitle());
	  }
	  
	  // navigate PMI mainmenu
	  driver1.findElement(By.linkText("PIM")).click();
	  System.out.println("Click PIM mainmenu ");
	  Thread.sleep(3000);
	  
	// navigate AddEmployee Submenu 
	  driver1.findElement(By.linkText("Add Employee")).click();
	  Thread .sleep(3000);
	  System.out.println("Click on Add Employee Sub menu ");
	}
}
	
	
	
	


