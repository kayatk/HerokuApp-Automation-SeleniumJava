package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import junit.framework.Assert;

public class HorizontalSlider {
    public static void main(String[] args) {
        
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/horizontal_slider");
        Assert.assertTrue(driver.getCurrentUrl().contains("horizontal_slider"));

        WebElement slider =driver.findElement(By.xpath("//input[@type='range']"));
        //Using Send Keys
            slider.click();
            slider.sendKeys(Keys.ARROW_RIGHT);
            slider.sendKeys(Keys.ARROW_LEFT);
        //Using ACtion Class
            new Actions(driver).dragAndDropBy(slider, 30, 0).perform();
         driver.quit();
        
    }
    
}
