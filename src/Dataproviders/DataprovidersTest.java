package Dataproviders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataprovidersTest {

    WebDriver driver;

    @DataProvider(name = "TestData")
    public Object[][] gatData()
    {
        Object[][] data = new Object[3][2];

        data[0][0]="kasunaratthanage@gmail.com";
        data[0][1]="DANTHA13";

        data[1][0]="Kasun12@gmail.com";
        data[1][1]="password";

        data[2][0]="kalana@gmail.com";
        data[2][1]="password123";

        return data;

    }

    @Test(dataProvider = "TestData")
    public void TestDataProviders(String username,String password) {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedr\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");

        driver.findElement(By.id("email")).sendKeys(username);
//        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("pass")).sendKeys(password);
//        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("loginbutton")).click();
        driver.quit();
        Assert.assertTrue(true);

    }

}
