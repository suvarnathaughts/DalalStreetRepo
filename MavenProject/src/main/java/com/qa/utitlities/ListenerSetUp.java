package com.qa.utitlities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.qa.testBase.TestBase;

public class ListenerSetUp extends TestBase implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		
		logger.info("Test Execution Started");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		logger.info("Test Execution Completed");

		
			}

	@Override
	public void onTestFailure(ITestResult result) {
		
		logger.info("Test Execution Failed");
		
	    Util.TakesSS(result.getName()+System.currentTimeMillis());

			}

	@Override
	public void onTestSkipped(ITestResult result) {
		
		logger.info("Test Execution Skipped");

			}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
			}

	@Override
	public void onFinish(ITestContext context) {
			}
	
	
        
	
	
	

}
