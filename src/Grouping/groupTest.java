package Grouping;

import org.testng.annotations.Test;

public class groupTest {
    @Test(groups = "sanity")
    public void Test1()
    {
        System.out.println("Test1");
    }

    @Test(groups = "smoke")
    public void Test2()
    {
        System.out.println("Test2");
    }

    @Test(groups = "sanity")
    public void Test3()
    {
        System.out.println("Test3");
    }



}
