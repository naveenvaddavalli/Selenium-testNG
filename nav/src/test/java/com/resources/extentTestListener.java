package com.resources;


import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.utils.extentManager;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class extentTestListener implements ITestListener {
    private static ExtentTest test;

    @Override
    public void onStart(ITestContext context) {
        extentManager.getInstance();
    }

    @Override
    public void onTestStart(ITestResult result) {
        test = extentManager.getInstance().createTest(result.getMethod().getMethodName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        test.log(Status.PASS, "Test Passed");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        test.log(Status.FAIL, "Test Failed");
        test.log(Status.FAIL, result.getThrowable());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        test.log(Status.SKIP, "Test Skipped");
    }

    @Override
    public void onFinish(ITestContext context) {
        extentManager.getInstance().flush();
    }
}