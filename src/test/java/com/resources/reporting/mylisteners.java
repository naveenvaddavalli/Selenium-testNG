package com.resources.reporting;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class mylisteners implements ITestListener {

    @Override
    public void onTestFailure(ITestResult result) {
        String methodName = result.getMethod().getMethodName();
        String className = result.getTestClass().getName();
        Throwable error = result.getThrowable();

        System.out.println("❌ FAILED: " + className + "." + methodName);
        Reporter.log("❌ FAILED: " + className + "." + methodName, true);

        if (error != null) {
            System.out.println("🔍 Reason: " + error.getMessage());
            Reporter.log("🔍 Reason: " + error.getMessage(), true);
        }
    }
}
