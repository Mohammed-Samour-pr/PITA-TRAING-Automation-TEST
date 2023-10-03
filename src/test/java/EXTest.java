import org.testng.Assert;
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


    @Test
    public void Test1() {
        Assert.assertTrue(1 == 0);
    }

    @Test
    public void Test2() {
        Assert.assertTrue(5 == 5);
    }


    @Test
    public void Test3() {
        Assert.assertTrue(6 == 9);
    }


    @Test
    public void Test4() {
        Assert.assertTrue(0 == 0);
    }


    @Test
    public void Test5() {
        Assert.assertTrue(1 == 1);
    }

    @Test
    public void Test6() {
        Assert.assertTrue(1 == 1);
    }

    @AfterClass
    public void printStatus2() {
        System.out.println("After Class");

    }
}
