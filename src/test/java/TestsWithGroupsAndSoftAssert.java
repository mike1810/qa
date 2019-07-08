import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;


public class TestsWithGroupsAndSoftAssert {

    @Test( groups = "assert" )
    public void withAssert(){
        int first = 1;
        int second = 1;
        Assert.assertEquals(first,second,"Provided members are not equals");
    }

    @Test( groups = "softAssert" )
    public void withSoftAssert(){
        SoftAssert softAssert = new SoftAssert();
        int first = 2;
        int second = 2;
        softAssert.assertEquals(first,second,"First pair is not equals");

        first = 2;
        second = 2;
        softAssert.assertEquals(first,second,"Second pair is not equals");

        softAssert.assertAll();
    }

}
