package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrame {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/nested_frames");
        Assert.assertTrue(driver.getCurrentUrl().contains("nested_frames"));

        driver.switchTo().frame("frame-bottom");
       Assert.assertTrue( driver.findElement(By.xpath("//body[contains(text(),'BOTTOM')]")).isDisplayed());

       driver.switchTo().defaultContent();
       driver.switchTo().frame("frame-top");
       driver.switchTo().frame("frame-left");
       Assert.assertTrue( driver.findElement(By.xpath("//body[contains(text(),'LEFT')]")).isDisplayed());
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frame-right");
        Assert.assertTrue( driver.findElement(By.xpath("//body[contains(text(),'RIGHT')]")).isDisplayed());


        driver.quit();
    }
    
}
