package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDOM {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/shadowdom");
        Assert.assertTrue(driver.getCurrentUrl().contains("shadowdom"));
    
    System.out.println(driver.findElement(By.xpath("//span")).getText());

    driver.quit();
    }
}
