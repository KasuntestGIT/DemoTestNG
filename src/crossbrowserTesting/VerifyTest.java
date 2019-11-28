package crossbrowserTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class VerifyTest {

    WebDriver driver;
    @Test
    @Parameters("browser")
    public void verifyPageTitle(String browserName)
    {
        if(browserName.equalsIgnoreCase("chrome"))
        {
            System.setProperty("webdriver.chrome.driver","C:\\chromedr\\chromedriver.exe");
            driver = new ChromeDriver();
        }
        else if(browserName.equalsIgnoreCase("IE"))
        {
        System.setProperty("webdriver.ie.driver","C:\\iedriver\\IEDriverServer.exe");
        driver = new InternetExplorerDriver();
        }

        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");


    }
}
