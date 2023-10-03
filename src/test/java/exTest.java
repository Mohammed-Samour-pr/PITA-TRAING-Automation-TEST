import org.jetbrains.annotations.NotNull;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class exTest {


    @BeforeMethod
    public void printtStatus(ITestResult iTestResult) {
        // System.out.println("Before Method");
        System.out.println(iTestResult.getMethod().getMethodName() + "Started.....");
    }

    @AfterMethod
    public void printStatus(ITestResult iTestResult) {
        // System.out.println("After Method");
        System.out.println(iTestResult.getMethod().getMethodName() + "Finished....");
    }

    @Test(priority = 1)
    public void print() {
        System.out.println("Test...!!");
    }


}
