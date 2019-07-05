import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;



public class testsWithData {

    @Test
    @Parameters({"qwe", "ewq"})
    public void testWithData(int param1, int param2){
        Assert.assertEquals(param1, param2);
    }

    @DataProvider(name = "name")
    public Object[][] simpleDataProvider(){
            return new Object[][]{
                    {1,1},
                    {2,3}
            };
    }

    @Test(dataProvider = "qwe")
    public void simpleTestWithDataProvider(int a, int b){
        Assert.assertEquals(a,b,"Provided numbers are not equals");
        Assert.assertNotEquals(a, b+1,"Provided numbers are equals" );
    }
}
