
import listeners.CustomListener;
import listeners.CustomListenerForSuite;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners()
public class TestsWithDataProviderAndCustomListener {

    @DataProvider(name = "name")
    @Test
    public Object[][] simpleDataProvider(){
        return new Object[][]{
                {1,-1},
                {2,2},
                {-2,3}
        };
    }

    @Test(dataProvider = "name")
    public void dataProviderPairEquals(int a, int b){
        Assert.assertEquals(
                Math.pow(a,2),
                Math.pow(b,2),
                "Provided numbers are not equals in power 2");
    }

    @Test(dataProvider = "name")
    public void dataProviderPairNotEquals(int a, int b){
        Assert.assertNotEquals(
                Math.pow(a,2),
                Math.pow(b,2),
                "Provided numbers are equals in power 2" );
    }

    @Test(dataProvider = "name")
    public void dataProviderPairTrueOrFail(int a, int b){
        if(!(a < 1 && b > 2)){
            Assert.fail(a + " >= 1 or " + b + " <= 2");
        }else{
            Assert.assertTrue(a < 1 && b > 2);
        }
    }

    @Test(dataProvider = "name")
    public void dataProviderPairFalseOrFail(int a, int b){
        if(!(a < 1 && b > 2)){
            Assert.assertFalse(a < 1 && b > 2);
        }else{
            Assert.fail(a + " < 1 or " + b + " > 2");
        }
    }

}
