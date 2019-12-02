package TESTNG_CONCEPTS;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
public class TestNGBasics {
	
	 
	/*  SEQUENCE OF EXCEUTION ::
	
  
	 * 
	 */
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	///*** Pre Conditions ::: Starts with @Before
	
@BeforeSuite 
	
	public void setUpChrome()  {
		
	System.out.println("@beforeSuite :::SetUp System property for Chrome ::")	;
		
		
		
		
	}
	
	
	
	@BeforeTest
	
	public void launchBrowser()  {
		
	System.out.println("@BeforeTest:::Launch Browser ::")	;
		
		
		
		
	}
	
	
	@BeforeClass 
	
	public void enterURL()  {
		
	System.out.println("@BeforeClass:::Enter URL ");
		
		
		
		
	}
	
@BeforeMethod
	
public void login()  {
	
	System.out.println("@Beforemethod:::Login into Applications ");
		
		
	}
	

///*** Test Conditions ::: Starts with @Test

	@Test
	
	public void googleTitleTest()  {
		
		System.out.println("@Test:::google Title test");
			
			
		}
	 
	
	@Test
	
	public void searchTest()
	{
		
		System.out.println ("@Test:::Enter data In Search ");
		
		
		
	}
	
	
	
@Test
	
	public void logoTest()
	{
		
		System.out.println ("@Test:::test the Application logo");
		
		
		
	}
	
	///*** Post Conditions ::: Starts with @After
@AfterMethod 
	
	public void logout()  {
		
	System.out.println(" @Aftermethod:::logout from Application ");
		
		
		
		
	}

@AfterTest 

public void deleteAllCookies()  {
	
System.out.println(" @AfterTest:::DeleteAllCookies In the Browser");
	
	
	
	
}

 

@AfterClass

public void close()  {
	
System.out.println("@AfterClass:::Close Browser");
	
	
	
	
}


@AfterSuite 



public void generateReports()  {
	
	
	System.out.println("@AfterSuite :::generate reports ");
	
	
}














	

}
