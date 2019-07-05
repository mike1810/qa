import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

public class TestClass {

    @Test( expectedExceptions = {Exception.class})
    public void someTest() throws Exception{
        int i = 1/0;
        throw new Exception();
    }

    @Test( expectedExceptions = {Exception.class})
    public void someTest2() throws Exception{
        int i = 1/0;
        throw new Exception();
    }

    @Test
    public void withAssert(){
        int first = 1;
        int second = 1;
        Assert.assertEquals(first,second,"Provided members are not equals");
    }

    @Test
    public void withSoftAssert(){
        SoftAssert softAssert = new SoftAssert();
        int first = 1;
        int second = 1;
        softAssert.assertEquals(first,second,"First pair is not equals");


        first = 2;
        second = 2;
        softAssert.assertEquals(first,second,"Second pair is not equals");

        softAssert.assertAll();
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before method actions.");//start browser,...
    }

    @AfterClass
    public void afterClass(){
        System.out.println("After method actions.");//clean up, delete info,...
    }







}
