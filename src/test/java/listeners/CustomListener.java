package listeners;

import org.testng.*;

public class CustomListener implements ITestListener{

    public void onTestStart(ITestResult var1){
        System.out.println("Test '" + var1.getTestName() + "' started");
    }

    public void onTestSuccess(ITestResult var1){
        System.out.println("Test '" + var1.getTestName() + "' successful");
    }

    public void onTestFailure(ITestResult var1){
        System.out.println("Test '" + var1.getTestName() + "' failed");
    }

    public void onTestSkipped(ITestResult var1){
        System.out.println("Test '" + var1.getTestName() + "' skipped");
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult var1){

    }

    public void onStart(ITestContext var1){
        System.out.println("Test '" + var1.getName() + "' started");
    }

    public void onFinish(ITestContext var1){
        System.out.println("Test '" + var1.getName() + "' finished");
    }
}




/*
public class CustomListener implements ISuiteListener{
    public void onStart(ISuite iSuite){
        System.out.println( "On Start actions\n" );
    }

    public void onFinish(ISuite iSuite){
        System.out.println( "On Finish actions\n" );
    }
}*/
