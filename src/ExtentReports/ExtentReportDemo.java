package ExtentReports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportDemo {
	
	  
	public static void main (String arg[]) {
	
	// create object of ExtendHtmlReporter  and  it is used to provide path of the folder to generate  report
		 
             ExtentHtmlReporter reporter = new ExtentHtmlReporter("./Reports/ExtentReportDemo.html");
             
      // Create of ExtentReports , this is a main class and it will create a report       
	  
             ExtentReports  genReport = new ExtentReports();
             
             // attach the reporter which is created in step 1
               
             genReport.attachReporter(reporter);
              
	 
	// call TestCase :  Create Testmethod and pass the Name of testcase 
             
             ExtentTest logger =genReport.createTest("ExtentDemoReport"); 
             
       //// log method will add logs in report and provide the log steps which will come in report  
             
             logger.log(Status.INFO,"This is Just Demo ExtendClass ");
             logger.log(Status.PASS, "This a Pass Method");
             logger.log(Status.FAIL, "This a Fail Method");
       // Flush method will write the test in report- This is mandatory step
             genReport.flush();

}
}