package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDOMexpandtesting {

     public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://practice.expandtesting.com/shadowdom");
        Assert.assertTrue(driver.getCurrentUrl().contains("shadowdom"));

        JavascriptExecutor js =(JavascriptExecutor)driver;
        js.executeScript("return document.querySelector('#shadow-host').shadowRoot.querySelector('button');")

    
    System.out.println(driver.findElement(By.xpath("//span")).getText());

    driver.quit();
    }
    
}
