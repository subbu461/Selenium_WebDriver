package ApachePOI_Excel;
import java.io.FileInputStream;


import jxl.*;
 
public class WebDriver_Excel_JXL {
	
	public static void main (String arg[]) throws Exception  {
		
		System.out.println("****** Reading a Single Row From Excel **************");
		
		  
		
		// File of the Excel Path 
		FileInputStream excelFile = new FileInputStream("C:\\Users\\M V SUBBAREDDY\\Desktop\\NewCustomer_Guru99.xls");
		
		// get The Workbook
		
		Workbook workbookName= Workbook.getWorkbook(excelFile);
		
		 System.out.println(workbookName);
		// Get the Sheet Name  of Workbook 
		
		Sheet sheetName= workbookName.getSheet("New Customer");
		
	
		// Print the Sheetname
		System.out.println("SheetName is " + sheetName.getName());
		  
		
		
		
		// Reading Single Row  From Excel File
		int i=1;
		System.out.println("Read Data From The file form row No is " +  i);
	
	
		
		// CustomerName
		String CustomerName=sheetName.getCell(0,i).getContents();
		
		System.out.println(CustomerName);
		
		 
		//Gender
        String Gender=sheetName.getCell(1,i).getContents();
		
		System.out.println(Gender);
		
		
		//DateofBirth
		 String DateofBirth=sheetName.getCell(2,i).getContents();
			
			System.out.println(DateofBirth);
			
		
	// reading all Rows in Excel Sheet		
				
			
		int rows = sheetName.getRows();
			
		System.out.println("The No of rows are " + rows);
			 
		 	
			// Using for Loop : Iterating 
		 
		for (int r=1;r<=rows;r++) {
			
			String CustomerName1=sheetName.getCell(0,r).getContents();
			System.out.println(CustomerName1);
			
			
			
			String Gender1=sheetName.getCell(1,r).getContents();
			System.out.println(Gender1);
			
			
String DateofBirth1=sheetName.getCell(2,r).getContents();
			
			System.out.println(DateofBirth1);
			
			
			
			
			
			
		}
			
			
			
	}
	
	
	

}
