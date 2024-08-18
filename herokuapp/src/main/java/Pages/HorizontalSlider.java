package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class HorizontalSlider {
    public static void main(String[] args) {
        
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/horizontal_slider");
        Assert.assertTrue(driver.getCurrentUrl().contains("horizontal_slider"));

        driver.findElement(By.xpath("//input[@type='range']"));

        
    }
    
}
