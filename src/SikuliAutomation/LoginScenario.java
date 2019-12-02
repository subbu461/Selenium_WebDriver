package SikuliAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class LoginScenario {
	
	public static void main (String arg [] ) throws Exception 
	
	{
	
		Screen screen= new Screen();
	   
	
	       Pattern uname= new Pattern("C:\\Users\\M V SUBBAREDDY\\Desktop\\Sikuli Automation\\LoginExercise\\Uname.PNG");
           Pattern Pword = new Pattern("C:\\Users\\M V SUBBAREDDY\\Desktop\\Sikuli Automation\\LoginExercise\\pword.PNG");
	
	Pattern LoginBtn= new Pattern ("C:\\Users\\M V SUBBAREDDY\\Desktop\\Sikuli Automation\\LoginExercise\\LoginBtn.PNG");
	
	  
	System.setProperty("webdriver.chrome.driver","D:\\Selenium-Training\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("https://www.crmpro.com/index.html?e=1");

	screen.type(uname, "Venky461");
	System.out.println("Entered USerName");
    
	screen.type(Pword, "Venky461");
	System.out.println("Password");
	
	 
	    
	screen.click(LoginBtn);
	System.out.println("clicked on LoginButton");
	
	System.out.println("Loggedin Successfully");
	 
	}
} 
