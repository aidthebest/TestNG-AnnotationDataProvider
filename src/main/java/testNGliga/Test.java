package testNGliga;

import org.testng.annotations.*;

import javax.crypto.interfaces.PBEKey;
import java.sql.SQLOutput;

public class Test {

    @BeforeSuite(groups = "1")
    public void bSuite() {
        System.out.println("Before Suite");
    }

    @AfterSuite(groups = "1")
    public void aSuite3() {
        System.out.println("After Suite");
    }

    @BeforeClass(groups = "1")
    public void bClass() {
        System.out.println("Before Class");
    }

    @AfterMethod(groups = "1",onlyForGroups = "1")
    public void aMethod() {
        System.out.println("After Method");
    }

    @org.testng.annotations.Test(groups = "1")
    public void test1() {
        System.out.println("Test");
    }

    @org.testng.annotations.Test(groups = "2", dataProvider = "testData")
    public void test2(String data) {
        System.out.println(data);
    }

    @org.testng.annotations.Test(groups = "1", invocationCount = 2)
    public void test3() {}

    @DataProvider(name = "testData")
    public Object[][] getData() {
        return new Object[][]{{"Test"}, {"Test data: 1 2"}};
    }
}
