import org.testng.Assert;
import org.testng.annotations.Test;

public class exTest {

    @Test(priority = 1)
    public void Test() {
        Assert.assertTrue(1 == 1);
    }

}
