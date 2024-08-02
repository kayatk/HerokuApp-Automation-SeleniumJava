package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class DisappearingElement {
    public static void main(String[] args) {
        
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/disappearing_elements");

        
        Boolean flag = false;
        while(flag==false){
            try {
                WebElement gallery = driver.findElement(By.xpath("//a[text()='Gallery']"));
                gallery.isDisplayed();
                System.out.println("Element found or visible");
             } catch (Exception e) {
                System.out.println("Element not found or not visible");
            }
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.location.reload(true)");
        }
       
        
            driver.quit();
    
    }
}
