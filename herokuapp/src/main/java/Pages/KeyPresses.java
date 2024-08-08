package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyPresses {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/key_presses");
        Assert.assertTrue(driver.getCurrentUrl().contains("key_presses"));

       WebElement input = driver.findElement(By.id("target"));
       WebElement result= driver.findElement(By.id("result"));

       //using SendKeys for simple key actions
       input.sendKeys("%^");
       Assert.assertTrue(result.getText().contains("6"));

       //using Keys class 
       input.sendKeys(Keys.SHIFT);
       Assert.assertTrue(result.getText().contains("SHIFT"));
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        driver.quit();
    }
    
}
