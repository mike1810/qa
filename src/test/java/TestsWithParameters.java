import org.testng.Assert;
import org.testng.annotations.*;

public class TestsWithParameters {

    @Test(groups = "firstGroup")
    @Parameters({"firstNumber", "secondNumber"})
    public void testWithData(String param1, String param2) {
        Assert.assertEquals(param1.length(), param2.length());
    }

    @Test(groups = "secondGroup")
    @Parameters({"firstNumber", "thirdNumber"})
    public void testWithData2(String param1, String param2) {
        Assert.assertNotEquals(param1.length(), param2.length());
    }
}
