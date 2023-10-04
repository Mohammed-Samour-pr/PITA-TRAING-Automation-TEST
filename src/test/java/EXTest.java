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
        Assert.assertTrue(9 == 9);
    }


    @Test
    public void Test30210() {
        Assert.assertTrue(9 == 9);
    }


    @Test
    public void Test3v() {
        Assert.assertTrue(9 == 9);
    }

    @Test
    public void Tes48t3() {
        Assert.assertTrue(9 == 9);
    }

    @Test
    public void Test4543() {
        Assert.assertTrue(9 == 9);
    }

    @Test
    public void Test453() {
        Assert.assertTrue(9 == 9);
    }

    @Test
    public void Tes1t3() {
        Assert.assertTrue(9 == 9);
    }

    @Test
    public void Test213() {
        Assert.assertTrue(9 == 9);
    }

    @Test
    public void Test13() {
        Assert.assertTrue(9 == 9);
    }

    @Test
    public void Tes1t131() {
        Assert.assertTrue(9 == 9);
    }

    @Test
    public void Test131() {
        Assert.assertTrue(9 == 9);
    }

    @Test
    public void Test113() {
        Assert.assertTrue(9 == 9);
    }

    @Test
    public void Test3aaa() {
        Assert.assertTrue(9 == 9);
    }

    @Test
    public void Test3aa() {
        Assert.assertTrue(9 == 9);
    }

    @Test
    public void Testa3() {
        Assert.assertTrue(1 == 1);
    }

    @Test
    public void Test30aa() {
        Assert.assertTrue(1 == 1);
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
    public void Test9() {
        Assert.assertTrue(1 == 1);
    }

    @AfterClass
    public void printStatus2() {
        System.out.println("After Class");

    }
}
