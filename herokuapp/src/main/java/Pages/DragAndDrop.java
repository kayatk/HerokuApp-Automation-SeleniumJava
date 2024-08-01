package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import junit.framework.Assert;

public class DragAndDrop {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/drag_and_drop");
        WebElement element = driver.findElement(By.tagName("h3"));
        Assert.assertEquals(element.getText(), "Drag and Drop");

        WebElement source = driver.findElement(By.id("column-a"));
        WebElement target =driver.findElement(By.id("column-b"));

        //Action class -dragAndDrop
        Actions action = new Actions(driver);
        action.dragAndDrop(source, target).perform();

       //Action Class -ClickAndHold

       action.clickAndHold(source)
                    .pause(Duration.ofSeconds(1))
                    .moveToElement(target)
                    .pause(Duration.ofSeconds(1))
                    .release()
                    .pause(Duration.ofSeconds(1))
                    .build().perform();
       

        driver.quit();
    }
    
}
