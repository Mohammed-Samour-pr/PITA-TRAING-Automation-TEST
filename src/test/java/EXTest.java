import org.testng.ITestResult;
import org.testng.annotations.*;

public class EXTest {

    @BeforeClass
    public void printtStatus1() {
        System.out.println("Before  Class");
    }


    @BeforeMethod
    public void printtStatus(ITestResult iTestResult) {
        System.out.println(iTestResult.getMethod().getMethodName() + "Started.....");
    }

    @AfterMethod
    public void printStatus(ITestResult iTestResult) {
        System.out.println(iTestResult.getMethod().getMethodName() + "Finished....");
    }

    @Test(priority = 1)
    public void print() {
        System.out.println("Test...!!");
    }

    @AfterClass
    public void printStatus2() {
        System.out.println("After Class");

    }
}
