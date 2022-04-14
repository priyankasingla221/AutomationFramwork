package com.automationFramework.Utils;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.automationFramework.Base.TestBase;

public class CustomListener extends TestBase implements ITestListener{
	@Override
	public void onTestStart(ITestResult result) {
		logger.info("Test Started...." + result.getMethod().getMethodName());
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		logger.info("Test Passed...." + result.getMethod().getMethodName());
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		logger.info("Test Failed...." + result.getMethod().getMethodName());
		Utils.takeScreenShotOfFailedTestCase(result.getMethod().getMethodName());
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		logger.info("Test Skipped...." + result.getMethod().getMethodName());
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
	}
	
	

}
