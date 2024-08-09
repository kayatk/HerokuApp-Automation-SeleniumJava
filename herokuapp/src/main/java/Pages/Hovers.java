package Pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Hovers {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/hovers");
        Assert.assertTrue(driver.getCurrentUrl().contains("hovers"));

        Actions act = new Actions(driver);
        
        List<WebElement> elements = driver.findElements(By.xpath("//div[@class='figure']"));
        for (WebElement webElement : elements) {
            act.moveToElement(webElement).perform();
           // Assert.assertTrue(driver.findElement(By.className("figcaption")).isDisplayed());
        }

        driver.quit();
    }
}
