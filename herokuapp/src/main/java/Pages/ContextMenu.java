package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextMenu {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.xpath("//a[contains(text(),'Context Menu')]")).click();
        WebElement title = driver.findElement(By.xpath("//h3[contains(text(),'Context Menu')]"));
        Assert.assertTrue(title.isDisplayed());

        Actions action = new Actions(driver);
        action.contextClick(driver.findElement(By.id("hot-spot")));
       // action.contextClick();
       try {
        Thread.sleep(5000);
    } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
        driver.quit();

    }
}
