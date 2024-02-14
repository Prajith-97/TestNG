package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class customListner implements ITestListener {
    @Override
    public void onStart(ITestContext context) {
        System.out.println("Execution Started"+ context.getStartDate());
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("Execution Completed"+context.getEndDate());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("Test Failed"+result.getTestName());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("Test Skipped");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Test Passed");
    }
}
