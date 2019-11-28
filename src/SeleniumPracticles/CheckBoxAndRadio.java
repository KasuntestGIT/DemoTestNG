package SeleniumPracticles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CheckBoxAndRadio {

    @Test(priority = 1)
    public void Radio() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedr\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/test/radio.html");

        WebElement element1 = driver.findElement(By.id("vfb-7-1"));
        WebElement element2 = driver.findElement(By.id("vfb-7-2"));
        WebElement element3 = driver.findElement(By.id("vfb-7-3"));
        element1.click();
        element2.click();
        element3.click();
        driver.quit();
        }

    @Test(priority = 2)
    public void CheckBox() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedr\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/test/radio.html");

        WebElement element1 = driver.findElement(By.id("vfb-6-0"));
        for (int i=0;i<=2;i++)
        {
            element1.click();
            System.out.println("Status is "+ element1.isSelected());
        }


    }



}

