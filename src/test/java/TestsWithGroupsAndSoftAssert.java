import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;


public class TestsWithGroupsAndSoftAssert {

    @Test
    public void withAssert() {
        int first = 1;
        int second = 1;
        Assert.assertEquals(Math.sqrt(first), Math.sqrt(second), "Provided members are not equals");
    }

    @Test
    public void withSoftAssert() {
        SoftAssert softAssert = new SoftAssert();
        int first = 2, second = 2;
        softAssert.assertEquals(
                Math.sqrt(first)
                , Math.sqrt(second),
                "First pair is not equals");

        first = 3;
        second = 4;
        softAssert.assertEquals(
                Math.sqrt(first),
                Math.sqrt(second),
                "First pair is not equals");
    }
}
