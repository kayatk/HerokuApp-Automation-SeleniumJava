package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DisappearingElement {
    public static void main(String[] args) {
        
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/disappearing_elements");

        WebElement gallery = driver.findElement(By.xpath("//a[text()='Gallery']"));

       try {
        gallery.isDisplayed();
    } catch (Exception e) {
        System.out.println("Element not found or not visible");

    }
    
    driver.navigate().refresh();
    
        try {
            gallery.isDisplayed();
        }
         catch (Exception e) {
            System.out.println("Element not found or not visible");
            
        }

        driver.quit();
    }
}
