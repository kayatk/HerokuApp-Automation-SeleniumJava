package Pages;

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
        Assert.assertTrue(driver.findElement(By.xpath("You clicked: Cancel")).isDisplayed());
        driver.findElement(By.xpath("//button[contains(text(),'Confirm')]")).click();
        driver.switchTo().alert().accept();
        Assert.assertTrue(driver.findElement(By.xpath("You clicked: Ok")).isDisplayed());


        //JS Prompt
        driver.findElement(By.xpath("//button[contains(text(),'Prompt')]")).click();
        String msg ="Text";
        driver.switchTo().alert().sendKeys(msg);
        driver.switchTo().alert().accept();
        Assert.assertEquals(driver.switchTo().alert().getText(),"You entered: "+msg);
        driver.findElement(By.xpath("//button[contains(text(),'Prompt')]")).click();
        driver.switchTo().alert().dismiss();
        

    }
    
}
