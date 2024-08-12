package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrames {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/iframe");
        Assert.assertTrue(driver.getCurrentUrl().contains("iframe"));

        driver.findElement(By.xpath("//div[@class='tox-icon']")).click();


        driver.switchTo().frame("mce_0_ifr");
        Assert.assertTrue(driver.findElement(By.xpath("//p[contains(text(),'Your content')]")).isDisplayed());
        driver.switchTo().defaultContent();
       Boolean val= driver.findElement(By.xpath("//h3[contains(text(),'An iFrame')]")).isDisplayed();
       Assert.assertTrue(val);
       driver.quit();

    }
}
