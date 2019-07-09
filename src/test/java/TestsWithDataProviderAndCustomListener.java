import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.SkipException;

public class TestsWithDataProviderAndCustomListener {

    @DataProvider(name = "correct")
    @Test
    public Object[][] correctDataProvider() {
        return new Object[][]{
                {1, -1},
                {2, 2},
                {-3, 3}
        };
    }

    @DataProvider(name = "incorrect")
    @Test
    public Object[][] incorrectDataProvider() {
        return new Object[][]{
                {-1, 2},
                {2, -1},
                {0, -2},
                {-2, 0}
        };
    }

    @Test(dataProvider = "correct")
    public void dataProviderPairEquals(int a, int b) {
        Assert.assertEquals(
                Math.pow(a, 2),
                Math.pow(b, 2),
                "Provided numbers are not equals in power 2");
    }

    @Test(dataProvider = "incorrect")
    public void dataProviderPairNotEquals(int a, int b) {
        Assert.assertNotEquals(
                Math.pow(a, 2),
                Math.pow(b, 2),
                "Provided numbers are equals in power 2");
    }

    @Test(dataProvider = "correct")
    public void dataProviderPairTrue(int a, int b) {
        if (!(Math.abs(a) == Math.abs(b))) {
            Assert.fail("Absolute value of '" + a + "' not equals absolute value of '" + b + "' \n");
        } else {
            Assert.assertTrue(Math.abs(a) == Math.abs(b));
        }
    }

    @Test(dataProvider = "incorrect")
    public void dataProviderPairTrueSkip(int a, int b) {
        if (!(Math.abs(a) == Math.abs(b))) {
            throw new SkipException("");
        } else {
            Assert.assertTrue(Math.abs(a) == Math.abs(b));
        }
    }

    @Test(dataProvider = "correct")
    public void dataProviderPairFail(int a, int b) {
        if (!(Math.abs(a) == Math.abs(b))) {
            Assert.assertFalse(Math.abs(a) == Math.abs(b));
        } else {
            Assert.fail("Absolute value of '" + a + "' equals absolute value of '" + b + "' \n");
        }
    }

    @Test(dataProvider = "incorrect")
    public void dataProviderPairFalse(int a, int b) {
        if (!(Math.abs(a) == Math.abs(b))) {
            Assert.assertFalse(Math.abs(a) == Math.abs(b));
        } else {
            Assert.fail("Absolute value of '" + a + "' equals absolute value of '" + b + "' \n");
        }
    }
}