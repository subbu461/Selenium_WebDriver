package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class RegistrationPage2   {
	 

	WebDriver driver;
	  
	// O bject Identification 
	
	@FindBy(how = How.LINK_TEXT , using= "REGISTER")
	
	//@FindBy (linkText="REGISTER")
	WebElement clckRegBtn ;
	
	
	
	//@FindBy (how=How.NAME , using ="firstName")
      WebElement FirstName;
	
	
	@FindBy(name="lastName")
	WebElement LastName;
	
	
	@FindBy(name="phone")
WebElement phone ;
	
	@FindBy(name="userName")
	WebElement email;
	
	
	
	@FindBy(name="address1")
	WebElement address1;
	
	
	@FindBy(name="address2")
	WebElement address2;
	 
	@FindBy(name="city")
	WebElement City;
	
	@FindBy(name="state")
	WebElement State;
	
	
	@FindBy(name ="postalCode")
	WebElement postalCode;
	
	@FindBy(name="country")
	WebElement country;
	
	
	@FindBy(name="email")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(name="confirmPassword")
	WebElement cnfrmPassword  ;
	
	
	@FindBy(name ="register")
	WebElement submitBtn;
	
	
	RegistrationPage2 (WebDriver d )
{
	
	
	driver = d ;
	
}
public void clkRegLink()

{
	   
	clckRegBtn .click();
}


public void setFirstName(String fname)

{
	
	FirstName.sendKeys(fname);
}


public void setLastName(String lname)

{
	
LastName.sendKeys(lname);
}

public void setPhone (String  Phone)

{

phone.sendKeys(Phone);
}  


public void setEmail(String  Email)

{

email.sendKeys(Email);
}

public void setAddress1(String  Address1)

{  

address1.sendKeys(Address1);
}


public void setAddress2(String  Address2)

{

address2.sendKeys(Address2);
}


public void setcity(String  city)

{ 

City.sendKeys(city);
}


public void setState(String  state)

{

	State.sendKeys(state);
}


public void setpostal(String  postalcode)

{

	postalCode.sendKeys(postalcode);
}



public void setCountry(String  Country)

{

	country.sendKeys(Country);
}

public void  username(String uname)
{
	username.sendKeys(uname);

}

public void  password(String pword)
{
password.sendKeys(pword);

}
public void  cnfrmpassword(String cnfrmpword)
{
	cnfrmPassword.sendKeys(cnfrmpword);

}
public void clckSubmit()
{
	submitBtn.click();

}
	
	
	
	
}
