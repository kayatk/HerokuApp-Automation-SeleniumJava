package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class FormAuthentication {
    public static void main(String[] args) {
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/login");
        Assert.assertTrue(driver.getCurrentUrl().contains("login"));

        //Invalid credentials

        //Invalid Password

        //Invalid userName

        //Valid Login

        //Logout
    }
}
