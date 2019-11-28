package TestNGlisteners;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestNGlisteners.TestNGListener.class)
public class FirstTest {
    @Test
    public void TestVerify()
    {
        System.setProperty("webdriver.chrome.driver","C:\\chromedr\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        System.out.println(driver.getTitle());
        driver.quit();

    }

    /*
    Listeners are used for the customize the logs and reports.There are two level of listeners.
    1)Class level
    2)Siute level

    If you need to set listeners for 10 classes we can configure the listeners in testNG.xml file as following manner (suite level)
    Ex:
    <suite name="Suite">
    <listeners>
    <listener class-name="TestNGlisteners.TestNGlistener>
    </listeners>

     */

}
