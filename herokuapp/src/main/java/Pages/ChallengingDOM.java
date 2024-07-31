package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class ChallengingDOM {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/challenging_dom");
        Assert.assertTrue(driver.getCurrentUrl().contains("challenging_dom"));

        //Locate the element using Relative elements/Friendly Locator
       driver.findElement(RelativeLocator.with(By.tagName("td")).below(By.xpath("//tbody//td[1]")).above(By.xpath("//tbody//tr[3]")));
        driver.quit();
    }
    
}
