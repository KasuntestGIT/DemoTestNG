package VerifyPageTitle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PageTitleVerify {

    @Test
    public void verifyApp()
    {
        System.setProperty("webdriver.chrome.driver","C:\\chromedr\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");

        String  title = driver.getTitle();
        System.out.println("Title is " + title);

        String expected = "Test";

        Assert.assertEquals(title,expected);
//        Assert.assertTrue(title.contains("Test page"));
//        String  title = driver.findElement(By.id("ID")).getAttribute("InnerHTML");

        System.out.println("Test completed");
    }
}
