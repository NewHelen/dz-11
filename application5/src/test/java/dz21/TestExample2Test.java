package dz21;

import org.testng.annotations.Test;

public class TestExample2Test extends BaseTest
{

    @Test(testName = "Test example 2 test name", groups = "smoke")
    public void test3(){
        System.out.println("My 3 test");
    }
}
