package Pages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class ChallengingDOM {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/challenging_dom");
        Assert.assertTrue(driver.getCurrentUrl().contains("challenging_dom"));

        //Locate the element using Relative elements/Friendly Locator
       // driver.findElement(RelativeLocator.with(By.tagName("td")).below(By.xpath("//tbody//td[1]")).above(By.xpath("//tbody//tr[3]")));
       
       
       WebElement ele = driver.findElement(By.xpath("//tbody//td[1]"));
       JavascriptExecutor js = (JavascriptExecutor)driver;
       js.executeScript("arguments[0].style.border='3px Solid red'",ele);
       TakesScreenshot ts = (TakesScreenshot)driver;
       File src=ts.getScreenshotAs(OutputType.FILE);
       File f = new File("herokuapp/src/main/resources/Highlighted.png");
        try {
            FileUtils.copyFile(src,f);
        } catch (IOException e) {
            e.printStackTrace();
        }

        driver.quit();
    }
    
}
