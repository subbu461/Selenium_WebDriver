package ExtentReports;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtendReportPassFail {
	
	public static void main (String arg[])  throws IOException {
		
		// create object of ExtendHtmlReporter  and  it is used to provide path of the folder to generate  report
		 	 
	               ExtentHtmlReporter reporter = new ExtentHtmlReporter("./Reports/ExtentReport1.html");
	             
	      // Create of ExtentReports , this is a main class and it will create a report       
		  
	             ExtentReports  genReport = new ExtentReports();
	             
	             // attach the reporter which is created in step 1
	             
	             genReport.attachReporter(reporter);
		
		// call TestCase :  Create Testmethod and pass the Name of testcase 
	             
	             ExtentTest logger =genReport.createTest("ExtentDemoReport"); 
	             
	       //// log method will add logs in report and provide the log steps which will come in report  
	             
	             logger.log(Status.INFO,"This is Just Demo ExtendClass ");
	       
	       // Flush method will write the test in report- This is mandatory step
	             genReport.flush();
	             
	             
	             // TestCase :: 2
	             
	             ExtentTest logger2 =genReport.createTest("ExtentReportPass"); 
	             
	             logger2.log(Status.INFO,"This is Just Demo  of ExtendClassPass Method  ");
	             
	             logger2.pass("TESTCASE2", MediaEntityBuilder.createScreenCaptureFromBase64String("./Reports/logo.jpg").build());
	            		
	            
	             genReport.flush();
	             
// TestCase :: 3
	             
	             ExtentTest logger3 =genReport.createTest("ExtentReportPass"); 
	             
	             logger3.log(Status.INFO,"This is Just Demo  of ExtendClassFail Method  ");
	             
	             logger3.fail("TESTCASE2", MediaEntityBuilder.createScreenCaptureFromBase64String("./Reports/logo.jpg").build());
	            		
	            
	             genReport.flush();
	             
	             
	}
	
	

}
