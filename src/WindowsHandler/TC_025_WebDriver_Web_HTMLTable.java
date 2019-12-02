package WindowsHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class TC_025_WebDriver_Web_HTMLTable {
	
	public static void main(String arg[]) throws Exception  {
		
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium-Training\\Drivers\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
	 System.out.println("Browser is Opened");
		
	driver.get("D:\\Selenium_Student_SW\\HtmlFiles\\WebTable.html");	
	driver.manage().window().maximize();
	
	// Retrieving Count of the table:
	int row =driver.findElements(By.xpath("//table[@id='idCourse']/tbody/tr")).size();
	int column =driver.findElements(By.xpath("//table[@id='idCourse']/tbody/tr[7]/td")).size();
    int rowcolumn = driver.findElements(By.xpath("//table[@id='idCourse']/tbody/tr/td")).size();
    
     System.out.println("No of Rows: " +row);

     System.out.println("No Of Column :" +column);

     System.out.println("No of Rows and Columns :"+rowcolumn);
	
// Retrieving  data From particular Cell:
     String cell=driver.findElement(By.xpath("//table[@id='idCourse']/tbody/tr[7]/td[3]")).getText();
     System.out.println(cell);
	
	
//Retrieving data from all rows  cells (Used By for loop)
    
     for (int i=1;i<=row;i++) {
    	 
    String rowdata=driver.findElement(By.xpath("//table[@id='idCourse']/tbody/tr["+i+"]")).getText(); 
    	System.out.println(rowdata); 
    	
     }
    // Retrieving all data rows and columns 	
     for (int i=1;i<=row;i++) {
    	 
    		 
    	 
    	    String rowdata1=driver.findElement(By.xpath("//table[@id='idCourse']/tbody/tr/td["+i+"]")).getText(); 	 
    	    System.out.println(rowdata1); 	
    	    	 
	}
    	 
    	
	}
	}


