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

        driver.findElement(By.xpath("//body[contains(text(),'LEFT')]")).isDisplayed();

        driver.quit();
    }
    
}
