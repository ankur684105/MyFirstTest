package TestNG;


import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class customListeners implements ISuiteListener,ITestListener{

	@Override
	public void onFinish(ISuite arg0) {
		// TODO Auto-generated method stub
		System.out.println("Finished Suite:"+arg0.getName());
	}

	@Override
	public void onStart(ISuite arg0) {
		// TODO Auto-generated method stub
		System.out.println("Started Suite:"+arg0.getName());
	}
	@Override
	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		System.out.println("Test Finished  "+ arg0.getName());
	}

	@Override
	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		System.out.println("Test Started  "+ arg0.getName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		System.out.println("Test Suceeded with %age ::"+ arg0.getName());
	}

	@Override
	public void onTestFailure(ITestResult arg0) {
		// TODO Auto-generated method stub
		System.out.println("Test Failed by %age ::"+arg0+ arg0.getName());
	}

	@Override
	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		System.out.println("Test is Skipped  "+ arg0.getName());
	}

	@Override
	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		System.out.println("Test is started please enjoy  "+ arg0.getName());
	}

	@Override
	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		System.out.println("Test is Suceeded  "+ arg0.getName());
	}

	

}
