import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

public class fullSetOfBeforeAndAfterActions {

    @Test( expectedExceptions = {Exception.class}, groups = "firstGroup")
    public void firstGroupTest() throws Exception{
        int i = 1/0;
        throw new Exception();
    }
    @Test( expectedExceptions = {IndexOutOfBoundsException.class},  groups = "secondGroup")
    public void secondGroupTest() throws IndexOutOfBoundsException{
        int[] array = new int[]{1,3,4};
        System.out.println(array[array.length+2]);
        throw new IndexOutOfBoundsException();
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("Before suite actions");//clean up, delete info,...
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("After suite actions");//clean up, delete info,...
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("Before class actions.");//clean up, delete info,...
    }

    @AfterClass
    public void afterClass(){
        System.out.println("After class actions.");//clean up, delete info,...
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("Before test actions.");//clean up, delete info,...
    }

    @AfterTest
    public void afterTest(){
        System.out.println("After test actions.");//clean up, delete info,...
    }

    @BeforeGroups
    public void beforeGroups(){
        System.out.println("Before groups actions.");//start browser,...
    }

    @AfterGroups
    public void afterGroups(){
        System.out.println("After groups actions.");//start browser,...
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before method actions.");//start browser,...
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("After method actions.");//start browser,...
    }
}
