package testNGliga;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test2 {

    @AfterMethod(groups = "1", onlyForGroups = "1")
    public void aMethod() {
        System.out.println("After Method");
    }

    @Test(groups = "2", dataProvider = "testData1")
    public void test1(String data) {
        System.out.println(data);
      }

    @Test(groups = "1")
    public void test2() {
    }

    @Test(groups ="2",dataProvider = "testData2")
    public void test3(String data) {
        System.out.println(data);
    }

    @Test(groups = "1")
    public void test4() {
    }

    @DataProvider(name = "testData1")
    public Object[][] getData1() {
        return new Object[][]{{"Test"}, {"Test data: three four"}};
    }

    @DataProvider(name = "testData2")
    public Object[][] getData2() {
        return new Object[][]{{"Test"}, {"Test data: true false"}};
    }

}
