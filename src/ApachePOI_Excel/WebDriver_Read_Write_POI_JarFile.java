package ApachePOI_Excel;




import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

 
public class WebDriver_Read_Write_POI_JarFile   { 
	
// Reading data From EXcel Sheet
	
	public static void main (String arg[])  throws Exception {
		
		
		
		 
		
		
		
		
		
		
		
		FileInputStream    filepath = new FileInputStream ("‪C:\\Users\\M V SUBBAREDDY\\Desktop\\WriteData.xlsx");
		
		XSSFWorkbook  workbook = new XSSFWorkbook(filepath);
		
		XSSFSheet   sheet = workbook.getSheet("test");
		
		System.out.println(sheet.getSheetName());                             // Print Sheet Name
		System.out.println(sheet.getLastRowNum());                            // Print Last Row Number in sheet
		System.out.println("Before Update Cell Data"+ sheet.getRow(2).getCell(1));
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	   
	

}
























































































