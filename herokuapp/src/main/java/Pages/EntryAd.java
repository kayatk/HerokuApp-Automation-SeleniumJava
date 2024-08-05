package Pages;

import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EntryAd {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://the-internet.herokuapp.com/entry_ad");
       WebElement title =driver.findElement(By.cssSelector("h3"));
       Assert.assertTrue(title.getText().contains("Entry"));

        try {
           String windows = driver.getWindowHandle();    
           System.out.println(driver.switchTo().window(windows).findElement(By.tagName("h3")).getText());

         // Assert.assertEquals( driver.switchTo().window(windows).findElement(By.tagName("h3")).getText(), "This is a modal window"); 
          driver.findElement(By.xpath("//p[text()='Close']")).click();
            
        } catch (Exception e) {
            
        }
       finally {
        driver.quit();
        }
    }
}
