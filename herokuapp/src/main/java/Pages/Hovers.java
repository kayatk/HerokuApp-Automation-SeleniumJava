package Pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hovers {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/hovers");
        Assert.assertTrue(driver.getCurrentUrl().contains("hovers"));
        
        List<WebElement> elements = driver.findElements(By.xpath("//div[@class='figure']"));
        for (WebElement webElement : elements) {
            
        }

        driver.quit();
    }
}
