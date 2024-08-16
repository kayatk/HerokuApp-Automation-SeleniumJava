package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class LazyLoading {
    public static void main(String[] args) {
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/infinite_scroll");
        Assert.assertTrue(driver.getCurrentUrl().contains("infinite_scroll"));

        
         JavascriptExecutor js = (JavascriptExecutor) driver;

         // Get the initial page height
         long lastHeight = (long) js.executeScript("return document.body.scrollHeight");
 
         while (true) {
             // Scroll down to the bottom
             js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
 
             // Wait to load new content
             try {
                 Thread.sleep(500);
             } catch (InterruptedException e) {
                 e.printStackTrace();
             }
 
             // Get the new scroll height
             long newHeight = (long) js.executeScript("return document.body.scrollHeight");
 
             // Check if the height hasn't changed, meaning the page is fully loaded
             if (newHeight == lastHeight) {
                 break;
             }
 
             lastHeight = newHeight;
         }
 

    }
}
