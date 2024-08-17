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
        By logoutBtn = By.className("button secondary radius");

        //Invalid credentials


        //Invalid Password

        //Invalid userName

        //Valid Login

        //Logout
    }
}
