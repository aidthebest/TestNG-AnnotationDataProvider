package testNGliga;

import org.testng.annotations.*;
import org.testng.annotations.Test;

public class Test4 {

    @BeforeTest(groups = "1")
    public void bTest() {
        System.out.println("Before Test");
    }

    @AfterMethod(groups = "1")
    public void aMethod() {
        System.out.println("After Method");
    }

    @AfterTest(groups = "1")
    public void aTest() {
        System.out.println("After Test");
    }

    @Test(groups = "1")
    public void test5() {
        System.out.println("Test");
    }
}
