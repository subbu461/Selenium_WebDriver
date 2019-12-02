package ApachePOI_Excel;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;


import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;

public class WebDriver_Excel_ApachePOI_WriteData {
	 
	public static void main (String arg[])  throws IOException  {
		 
		FileInputStream file= new FileInputStream("‪C:\\Users\\M V SUBBAREDDY\\Desktop\\apachewriteData.xlsx");
		
		XSSFWorkbook workbook= new XSSFWorkbook(file);
		
	  	XSSFSheet       sheet =  workbook.getSheet("Sheet1"); 
		
		// Create a row   
		
		Row  row = sheet.createRow(2); 
		 
		// Create Cell
		 
		Cell cell= row.createCell(5);
		
		
		// write data into cell as per  data
		
		cell.setCellType(cell.CELL_TYPE_STRING);
		cell.setCellValue("Selenium With JAVA");
		
		// write data into a excel -File
		
		FileOutputStream fileout= new FileOutputStream("‪‪C:\\Users\\M V SUBBAREDDY\\Desktop\\apachewriteData.xlsx");
		
		workbook.write(fileout);
		
		fileout.close();
		System.out.println("Data Written Successfully in Excel");
		
	}
	
	


}
