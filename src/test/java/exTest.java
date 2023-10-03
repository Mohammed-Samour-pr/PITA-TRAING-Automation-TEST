import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class exTest {

    @Test(priority = 1)
    public void print() {
        System.out.println("Test ...");
    }

    @BeforeMethod
    public void beforeTest() {
        System.out.println("Before Method");
    }


    @AfterMethod
    public void afterTest() {
        System.out.println("After Method");
    }


}
