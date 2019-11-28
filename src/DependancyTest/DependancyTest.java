package DependancyTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependancyTest {


    @Test(priority = 2,description = "login fuction")
    public static void Login()
    {
        Assert.assertEquals(12,12);
        System.out.println("Login");
    }

    @Test(priority = 1,description = "select function",dependsOnMethods = "Login")
    public static void selectItems()
    {
        System.out.println("selectItems");
    }

    @Test(priority = 3)
    public static void checkout()
    {
        System.out.println("checkout");
    }

}

