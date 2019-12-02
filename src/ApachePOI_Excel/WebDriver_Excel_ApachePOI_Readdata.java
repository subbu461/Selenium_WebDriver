package ApachePOI_Excel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import  java.io.FileNotFoundException;


import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFCell;
 
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;


public class WebDriver_Excel_ApachePOI_Readdata {
	
	
	public static void main (String arg[]) throws IOException {
		
	 	// Excel File Location in our Computer
		
		FileInputStream xlsxFile= new FileInputStream("C:\\Users\\M V SUBBAREDDY\\Desktop\\ReadDataPOI.xlsx");   // Excel path file
		
		XSSFWorkbook workbook=new XSSFWorkbook(xlsxFile);
		XSSFSheet sheet =  workbook.getSheetAt(0);
		
		
		// reading data in row 0 and column 0 
		
		Row row=sheet.getRow(1);
		Cell cell= row.getCell(1);
		
		System.out.println(" THE CELL NAME IS  " + cell);
		
		// Another method of reading single column data
		
		System.out.println(sheet.getRow(2).getCell(1));
		
		// another Method 
		
		String cellValue=cell.getStringCellValue();
		
		System.out.println(cellValue);
		
	}
	

}
