package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage1
{
WebDriver driver;

	

//*** Identification of Objects 
 
         //***  Contact
       By  regBtn = By.linkText("REGISTER");
   	   
   	   By  FirstName= By.name("firstName");
   	   By LastName= By.name("lastName");
   	   By phone = By.name("phone");
	   By email = By.name("userName");
	   
	 //***  Mailing 
	   
	   
	   By address1=By.name("address1");
	   By address2=By.name("address2");
	   By City = By.name("city");
	   By State =By.name("state");
	   By postalCode= By .name("postalCode");
	   By country = By.name("country");
	   
	   
	 //*** UserName Information 
	   
	   By username= By.name("email");
	   By  password = By.name("password");
	   By cnfrmPassword = By.name("confirmPassword");
	   
	   // Submit  
	   By submit =By.name("register");
	   
	   
	   RegistrationPage1(WebDriver d )
	
	   { 
		   
	driver =d ;   
		   
	   }
	
	   public void clkRegLink()
	
	   {
		   
		   driver.findElement(regBtn).click();
	   }
	
	
	public void setFirstName(String fname)
	
	{
		
		driver.findElement(FirstName).sendKeys(fname);
	}
	
	
public void setLastName(String lname)
	
	{
		
		driver.findElement(LastName).sendKeys(lname);
	}
	
public void setPhone (String  Phone)
   
{
	
	driver.findElement(phone).sendKeys(Phone);
}  

	
public void setEmail(String  Email)

{
	
	driver.findElement(email).sendKeys(Email);
}

public void setAddress1(String  Address1)

{  
	
	driver.findElement(address1).sendKeys(Address1);
}


public void setAddress2(String  Address2)

{
	
	driver.findElement(address2).sendKeys(Address2);
}


public void setcity(String  city)

{ 
	
	driver.findElement(City).sendKeys(city);
}


public void setState(String  state)

{
	 
	driver.findElement(State).sendKeys(state);
}


public void setpostal(String  postalcode)

{
	
	driver.findElement(postalCode).sendKeys(postalcode);
}



public void setCountry(String  Country)

{
	
	driver.findElement(country).sendKeys(Country);
}

public void  username(String uname)
{
	driver.findElement(username).sendKeys(uname);
	
}

public void  password(String pword)
{
	driver.findElement(password).sendKeys(pword);
	
}
public void  cnfrmpassword(String cnfrmpword)
{
	driver.findElement(cnfrmPassword).sendKeys(cnfrmpword);
	
}
public void clckSubmit()
{
	driver.findElement(submit).click();
	
}


}
