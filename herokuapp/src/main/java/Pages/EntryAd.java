package Pages;

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
            
        } catch (Exception e) {
            // TODO: handle exception
        }
       finally {
        driver.quit();
        }
    }
}
