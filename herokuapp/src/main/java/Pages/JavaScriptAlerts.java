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
        Alert alert = driver.switchTo().alert();
        Assert.assertEquals(alert.getText(), "I am a JS Alert");
        alert.accept();
        Assert.assertTrue(driver.findElement(By.xpath("//p[text()='You successfully clicked an alert']")).isDisplayed());


        //JS Confirm
        driver.findElement(By.xpath("//button[contains(text(),'Confirm')]")).click();
        Alert confirm = driver.switchTo().alert();
        Assert.assertEquals(confirm.getText(),"I am a JS Confirm");
        confirm.dismiss();
        Assert.assertTrue(driver.findElement(By.xpath("//p[text()='You successfully clicked an alert']")).isDisplayed());
        driver.findElement(By.xpath("//button[contains(text(),'Confirm')]")).click();
        confirm.accept();
        Assert.assertTrue(driver.findElement(By.xpath("//p[text()='You successfully clicked an alert']")).isDisplayed());


        //JS Prompt
        driver.findElement(By.xpath("//button[contains(text(),'Prompt')]")).click();
        Alert prompt = driver.switchTo().alert();
        Assert.assertEquals(confirm.getText(),"II am a JS prompt");

    }
    
}
