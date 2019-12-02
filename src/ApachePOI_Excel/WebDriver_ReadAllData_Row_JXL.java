package ApachePOI_Excel;
import jxl.*;
import java.io.FileInputStream;

public class WebDriver_ReadAllData_Row_JXL {
public static void main(String arg[]) throws Exception {
	
	FileInputStream file= new FileInputStream("D:\\Selenium_Student_SW\\ReadExcel.xls");
	Workbook wb= Workbook.getWorkbook(file);
	 Sheet   s1= wb.getSheet("Sheet1");
	 System.out.println("Sheetname         " + s1.getName());
	 
	 // Reading all the rows in Sheet
	 
	 int rows=s1.getRows();
	 System.out.println("No Of rows   "+rows);
	 
	 for (int i=1;i<rows;i++) {
		 
		 String EmpID=s1.getCell(0,i).getContents();
		 String EmpName=s1.getCell(1,i).getContents();
		 String EmpEmail=s1.getCell(2,i).getContents();
		 String EmpNo=s1.getCell(03,i).getContents();
		 
		 System.out.println("Emp ID   "+EmpID);
		 System.out.println("Emp Name   "+EmpName);
		 System.out.println("Emp ID   "+EmpEmail);
		 System.out.println("Emp ID   "+EmpNo);
	 }
	
}
}
