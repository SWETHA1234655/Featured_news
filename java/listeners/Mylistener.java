package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Mylistener implements ITestListener {
	
	public void onStart(ITestContext context)
	{
		System.out.println(" ---Started----");
	}
	public void onTestStart(ITestResult result)
	{
		System.out.println("Start");
	}
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("Success");
	}
	public void onTestFailure(ITestResult result)
	{
		System.out.println("Failure");
	}
	public void onTestSkipped(ITestResult result)
	{
		System.out.println("Skipped");
	}
	public void onTestFinish(ITestResult result)
	{
		System.out.println("Finish");
	}
	public void onFinish(ITestContext context)
	{
		System.out.println("---Finished---");
	}

}
