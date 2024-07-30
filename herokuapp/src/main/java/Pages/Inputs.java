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
        WebElement input = driver.findElement(By.xpath("//input[@type=\"number\"]"));
        Assert.assertTrue(driver.getCurrentUrl().contains("inputs"));

        //Handling Number Input
        input.sendKeys("5");
        driver.quit();
    }
}
