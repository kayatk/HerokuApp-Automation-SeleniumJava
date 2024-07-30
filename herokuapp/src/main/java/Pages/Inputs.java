package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Inputs {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/inputs");
       // WebElement title = driver.findElement(By.xpath("null"));
        Assert.assertTrue(driver.getCurrentUrl().contains("inputs"));

        //Handling Number Input

        driver.quit();
    }
}
