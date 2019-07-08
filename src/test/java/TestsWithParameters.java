import org.testng.Assert;
import org.testng.annotations.*;



public class TestsWithParameters {
    @Test
    @Parameters({"firstNumber", "secondNumber"})
    public void testWithData(String param1, String param2){
        Assert.assertEquals(param1.length(), param2.length());
    }
}
