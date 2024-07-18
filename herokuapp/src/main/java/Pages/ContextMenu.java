package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContextMenu {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.xpath("//a[contains(text(),'Context Menu')]")).click();
        WebElement title = driver.findElement(By.xpath("//h3[contains(text(),'Context Menu')]"));
        Assert.assertTrue(title.isDisplayed());

        driver.quit();

    }
}
