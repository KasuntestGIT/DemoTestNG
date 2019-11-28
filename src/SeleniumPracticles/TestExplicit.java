package SeleniumPracticles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


public class TestExplicit {

    @Test
    public void Test1() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedr\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        WebDriverWait wdwait = new WebDriverWait(driver,5);
        wdwait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
        driver.findElement(By.id("username")).sendKeys("user");
        driver.quit();
}
}