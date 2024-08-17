package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class FormAuthentication {
    public static void main(String[] args) {
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/login");
        Assert.assertTrue(driver.getCurrentUrl().contains("login"));

        By userName= By.id("username");
        By password =By.id("password");
        By loginBtn = By.xpath("//button[@type='submit']");
       // By logoutBtn = By.className("button secondary radius");
        By message =By.id("flash");

        
        //Invalid credentials
            driver.findElement(userName).sendKeys("Wrong username");
            driver.findElement(password).sendKeys("passwords");
            driver.findElement(loginBtn).click();
            Assert.assertTrue("Invalid Message",driver.findElement(message).getText().contains("Your username is invalid!"));
        //Invalid Password
            driver.findElement(userName).sendKeys("tomsmith");
            driver.findElement(password).sendKeys("passwords");
            driver.findElement(loginBtn).click();
            Assert.assertTrue("Invalid Message",driver.findElement(message).getText().contains("Your password is invalid!"));
        //Valid Login
            driver.findElement(userName).sendKeys("tomsmith");
            driver.findElement(password).sendKeys("SuperSecretPassword!");
            driver.findElement(loginBtn).click();
            Assert.assertTrue("Invalid Message",driver.findElement(message).getText().contains("You logged into a secure area!"));
        //Logout
            
        driver.quit();
    }
}
