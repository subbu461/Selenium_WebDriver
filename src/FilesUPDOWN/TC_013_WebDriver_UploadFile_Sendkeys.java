package FilesUPDOWN;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;



public class TC_013_WebDriver_UploadFile_Sendkeys {
	
	public static void main ( String arg[])  throws Exception  {
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium-Training\\Drivers\\chromedriver_win32\\chromedriver.exe");
		
	
	WebDriver driver= new  ChromeDriver();
	driver.get("http://demo.guru99.com/test/upload/");
		
//                ***** WEBELEMENT PATH FOR UPLOADING FILE     *****//		
		
		 
		WebElement upElmnt =  driver.findElement(By.id("uploadfile_0"));
		
		String filepath ="C:\\Users\\M V SUBBAREDDY\\Desktop\\VenkataSubbaReddy_Software Test Engineer_3.0 Years.docx";
		
		upElmnt.sendKeys(filepath);    // path of the file menton here .
		
		  System.out.println( "Path of the File is " + filepath);
		  
		driver.findElement(By.id("terms")).click();              // Click on Agree Check Box 
		
		driver.findElement(By.name("send")).click();            //  Click on Upload Submit Button 
		
	  Thread.sleep(4000L);
		
	   System.out.println("FileUpload Successfully");
		
		driver.close () ;                                       //  Close Webpage 
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
