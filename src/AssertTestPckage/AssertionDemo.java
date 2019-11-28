package AssertTestPckage;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionDemo {

    @Test
    public void softAssert()
    {
        SoftAssert assertion = new SoftAssert();
        System.out.println("testcase 1 started");
        assertion.assertEquals(10,10,"Not matched");
        System.out.println("testcase 1 completed");
        assertion.assertAll();


    }

    @Test
    public void Hard()
    {
        System.out.println("Test 2 is started");
        Assert.assertEquals(10,10);
        System.out.println("Test 2 is completed");

    }

}
