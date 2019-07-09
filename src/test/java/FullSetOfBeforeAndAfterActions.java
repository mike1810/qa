import org.testng.Assert;
import org.testng.annotations.*;


public class FullSetOfBeforeAndAfterActions {

    @Test(groups = "firstGroup")
    @Parameters({"firstParameter", "secondParameter"})
    public void firstGroupTest(int a, int b) {
        Assert.assertEquals(a, b, "Not equals");
    }

    @Test(groups = "secondGroup")
    @Parameters({"firstParameter", "secondParameter"})
    public void secondGroupTest(int a, int b) {
        Assert.assertNotEquals(a, b + 1, "Equals");
    }

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Before suite actions");//clean up, delete info,...
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("After suite actions");//clean up, delete info,...
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("Before test actions.");//clean up, delete info,...
    }

    @AfterTest
    public void afterTest() {
        System.out.println("After test actions.");
    }

    @BeforeGroups("firstGroup")
    public void beforeFirstGroup() {
        System.out.println("Before first group actions.");
    }

    @AfterGroups("firstGroup")
    public void afterFirstGroup() {
        System.out.println("After first group actions.");
    }

    @BeforeGroups("secondGroup")
    public void beforeSecondGroup() {
        System.out.println("Before second group actions.");
    }

    @AfterGroups("secondGroup")
    public void afterSecondGroup() {
        System.out.println("After second group actions.");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("Before class actions.");//clean up, delete info,...
    }

    @AfterClass
    public void afterClass() {
        System.out.println("After class actions.");//clean up, delete info,...
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Before method actions.");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("After method actions.");
    }

/*    @Test( expectedExceptions = {Exception.class}, groups = "firstGroup")
    public void firstGroupTest2() throws Exception{
        int i = 1/0;
        throw new Exception();
    }
    @Test( expectedExceptions = {IndexOutOfBoundsException.class},  groups = "secondGroup")
    public void secondGroupTest2() throws IndexOutOfBoundsException{
        int[] array = new int[]{1,3,4};
        System.out.println(array[array.length+2]);
        throw new IndexOutOfBoundsException();
    }*/
}
