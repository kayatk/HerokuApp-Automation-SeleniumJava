package Pages;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ContextMenu {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.xpath("//a[contains(text(),'Context Menu')]")).click();
        WebElement title = driver.findElement(By.xpath("//h3[contains(text(),'Context Menu')]"));
        Assert.assertTrue(title.isDisplayed());

        Actions action = new Actions(driver);
        action.contextClick(driver.findElement(By.id("hot-spot"))).build().perform();
       System.out.println(ExpectedConditions.alertIsPresent());
        
         
        //Handling Jasvascript Alerts
        Alert alert = driver.switchTo().alert();
        // driver.switchTo().alert().accept();
        String alertText =alert.getText();
        Assert.assertTrue(alertText.contains("context menu"));
        alert.accept();
        //  Boolean x = (ExpectedConditions.alertIsPresent());
        //Assert.assertFalse();
        driver.quit();

    }
}
