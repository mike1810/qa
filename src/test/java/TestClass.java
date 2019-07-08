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

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before method actions.");//start browser,...
    }

    @AfterClass
    public void afterClass(){
        System.out.println("After method actions.");//clean up, delete info,...
    }







}
