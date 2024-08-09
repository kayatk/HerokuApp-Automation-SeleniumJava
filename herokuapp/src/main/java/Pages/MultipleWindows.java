package Pages;

import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindows {
    public static void main(String[] args) {
         WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/windows");
        Assert.assertTrue(driver.getCurrentUrl().contains("windows"));
           
       String parentWindow = driver.getWindowHandle();
       driver.findElement(By.xpath("//a[text()='Click Here'] "));
       Set<String> windows = driver.getWindowHandles();
       for(String i :windows){
            if(parentWindow != i){
                driver.switchTo().window(i);
                Assert.assertTrue(driver.getCurrentUrl().contains("new"));
                Assert.assertTrue(driver.findElement(By.xpath("//h3[text()='New Window']")).isDisplayed());
                driver.close();
            }
       }

        driver.quit();
    }
}
