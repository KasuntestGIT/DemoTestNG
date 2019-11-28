package TestNGSample1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VideoSample1 {

    @Test(priority = 2,description = "login fuction")
    public static void Login()
    {
        Assert.assertEquals(12,10);
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
