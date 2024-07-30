package Pages;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptAlerts {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        Assert.assertTrue(driver.getCurrentUrl().contains("javascript_alerts"));

        //Js Alert
        driver.findElement(By.xpath("//button[contains(text(),'Alert')]")).click();
        Assert.assertEquals(driver.switchTo().alert().getText(), "I am a JS Alert");
        driver.switchTo().alert().accept();
        Assert.assertTrue(driver.findElement(By.xpath("//p[text()='You successfully clicked an alert']")).isDisplayed());


        //JS Confirm
        driver.findElement(By.xpath("//button[contains(text(),'Confirm')]")).click();
        Assert.assertEquals(driver.switchTo().alert().getText(),"I am a JS Confirm");
        driver.switchTo().alert().dismiss();
        Assert.assertTrue(driver.findElement(By.xpath("//p[text()='You clicked: Cancel']")).isDisplayed());
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.xpath("//button[contains(text(),'Confirm')]")).click();
        driver.switchTo().alert().accept();
        Assert.assertTrue(driver.findElement(By.xpath("//p[text()='You clicked: Ok']")).isDisplayed());


        //JS Prompt
        driver.findElement(By.xpath("//button[contains(text(),'Prompt')]")).click();
        Assert.assertEquals(driver.switchTo().alert().getText(),"I am a JS prompt");
        String msg ="Text";
        driver.switchTo().alert().sendKeys(msg);
        driver.switchTo().alert().accept();
        Assert.assertTrue(driver.findElement(By.xpath("//p[text()='You entered: "+msg+"']")).isDisplayed());
        driver.findElement(By.xpath("//button[contains(text(),'Prompt')]")).click();
        driver.switchTo().alert().dismiss();
        Assert.assertTrue(driver.findElement(By.xpath("//p[text()='You entered: null']")).isDisplayed());
        
        driver.quit();
    }
    
}
