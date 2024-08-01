package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class DragAndDrop {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/drag_and_drop");
        WebElement element = driver.findElement(By.tagName("h3"));
       System.out.println(element.getText()); 
       // Assert.assertEquals("", "");
    }
    
}
