package Pages;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Hovers {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/hovers");
        Assert.assertTrue(driver.getCurrentUrl().contains("hovers"));

        Actions act = new Actions(driver);
        String parentWindow= driver.getWindowHandle();
        int i=1;
        List<WebElement> elements = driver.findElements(By.xpath("//div[@class='figure']"));
        for (WebElement webElement : elements) {
          act.moveToElement(webElement).pause(Duration.ofSeconds(2)).build().perform();
         driver.findElement(By.xpath("//a[@href='/users/"+i+"']")).click();
         Assert.assertTrue(driver.getCurrentUrl().contains("/users/"+i));
         try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
         driver.navigate().back();
            i++;
        }

        driver.quit();
    }
}
