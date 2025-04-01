package genericUtility;



import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListenersImplementation implements ITestListener {
	
	JavaUtility jUtil=new JavaUtility();
	String dateTimeSTamp=jUtil.getCaldenderDetails("dd-MM-YYYY hh-mm-ss");
	
    ExtentReports report;
	ExtentTest test;
	ThreadLocal <ExtentTest>extentTest=new ThreadLocal<>();
	
	@Override
	public void onTestStart(ITestResult result) {
		String methodName=result.getMethod().getMethodName();
		System.out.println(methodName+"On Test Start executed");
		Reporter.log(methodName+"On Test Start executed");
		
		//Adding test method to the extent report
		test=report.createTest(methodName);
		extentTest.set(test);//ITS WORKS ON UNIQUE THREAD FOR PARALLEL EXECUTION
	
		}

	@Override
	public void onTestSuccess(ITestResult result) {
		String methodName=result.getMethod().getMethodName();
		System.out.println(methodName+"On Test Success executed");
		Reporter.log(methodName+"On Test Success executed");
		
		//Logging test Info
				test.log(Status.PASS,methodName+"On Test sucessfully executed");
				extentTest.get().log(Status.PASS,methodName+"test successfully executed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String methodName=result.getMethod().getMethodName();
		System.out.println(methodName+"On Test Failure executed");
		Reporter.log(methodName+"On Test Failure executed");
		
		//Logging test info
		//		test.log(Status FAIL,methodname+"test failed");
				extentTest.get().log(Status.FAIL,methodName+"test failed");
				
				//Logging error message
				test.log(Status.INFO,result.getThrowable());
				
		
		//Taking screenshot when script fails
		SeleniumUtility1 sUtil=new SeleniumUtility1();
		try {
			String path=sUtil.takeScreenshot(BaseClass.getDriver(), dateTimeSTamp);
	//		Attaching screenshort to report
	//		test.addScreenCaptureFromPath(path);
		}
		catch(IOException e )
		{
		e.printStackTrace();	
		}
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String methodName=result.getMethod().getMethodName();
		System.out.println(methodName+"On Test Skipped executed");
		Reporter.log(methodName+"On Test Skipped executed");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		
		System.out.println("On start executed");
		//Configuration of ExtentReports 
		ExtentSparkReporter reporter = new ExtentSparkReporter("//Extentreporter\\report"+dateTimeSTamp+"html");
		
		reporter.config().setDocumentTitle("VTiger Report");
		reporter.config().setTheme(Theme.STANDARD);
		
		//Create an empty report with the configuration
		report=new ExtentReports();
		report.attachReporter(reporter);
		report.setSystemInfo("Base URL","hhttp://localhost:8888");
		report.setSystemInfo("Base browser","Chrome");
		
		report.setSystemInfo("Reporter","ABCD");
		
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("On finish executed");
		report.flush();
	}

}
