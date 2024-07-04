package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ABTesting {
    public static void main(String[] args) {
        
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/");
        System.out.println(driver.getTitle());
        WebElement ABHyperlink =driver.findElement(By.xpath("//a[contains(text(),'A/B')]"));
        ABHyperlink.click();
        WebElement title = driver.findElement(By.cssSelector("h3"));
        System.out.println(title.getText());
        driver.quit();
    }
}
