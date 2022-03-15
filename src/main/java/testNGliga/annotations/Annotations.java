package testNGliga.annotations;

import org.testng.annotations.*;

public class Annotations {

    @BeforeSuite
    public void bSuite() {
        System.out.println("Before Suite");
    }

    @BeforeTest
    public void bTest() {
        System.out.println("Before Test");
    }

    @BeforeClass
    public void bClass() {
        System.out.println("Before Class");
    }

    @AfterMethod
    public void aMethod() {
        System.out.println("After Method");
    }

    @Test
    public void test_1() {
        System.out.println("Test");
    }

    @AfterClass
    public void aClass() {
        System.out.println("After Class");
    }

    @AfterTest
    public void aTest() {
        System.out.println("After Test");
    }

    @AfterSuite
    public void aSuite3() {
        System.out.println("After Suite");
    }

}
