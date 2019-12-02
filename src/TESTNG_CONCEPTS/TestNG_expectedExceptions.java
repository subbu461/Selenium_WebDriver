package TESTNG_CONCEPTS;

import org.testng.annotations.Test;

public class TestNG_expectedExceptions {
	
	
	//@Test(expectedExceptions=NumberFormatException.class)
	@Test
	public void expectedException()  {
		
		  
		
		String str="100X";
		Integer.parseInt(str);
		
		System.out.println("Converted string Into Integer");
		
		
		
	}
	
	

}
