package testNGliga;

import org.testng.annotations.*;
import org.testng.annotations.Test;

public class Test3 {

    @AfterClass(groups = "1")
    public void aClass() {
        System.out.println("After Class");
    }

    @AfterClass(groups = "1")
    public void aClass2() {
        System.out.println("After Class");
    }

    @BeforeClass(groups = "1")
    public void bClass() {
        System.out.println("Before Class");
    }

    @AfterTest(groups = "1")
    public void aTest() {
        System.out.println("After Test");
    }

    @AfterMethod(groups = "1", onlyForGroups = "1")
    public void aMethod() {
        System.out.println("After Method");
    }

    @Test(groups = "2", invocationCount = 2)
    public void test1() {
        System.out.println("Test");
    }

    @Test(groups = "2", dataProvider = "testData3")
    public void test2(String data) {
        System.out.println(data);
    }

    @Test(groups = "1")
    public void test3() {
    }

    @Test(groups = "2", dataProvider = "testData1")
    public void test4(String data) {
        System.out.println(data);
    }

    @Test(groups = "2", dataProvider = "testData2")
    public void test5(String data) {
        System.out.println(data);
    }

    @DataProvider(name = "testData1", parallel = true)
    public Object[][] getData1() {
        return new Object[][]{{"Test"}, {"Test data: three four"}};
    }

    @DataProvider(name = "testData2", parallel = true)
    public Object[][] getData2() {
        return new Object[][]{{"Test"}, {"Test data: true false"}};
    }

    @DataProvider(name = "testData3", parallel = true)
    public Object[][] getData3() {
        return new Object[][]{{"Test"}, {"Test data: 1 2"}};
    }
}
