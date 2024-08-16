package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecureFileDownload {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://practice.expandtesting.com/shadowdom");
        Assert.assertTrue(driver.getCurrentUrl().contains("shadowdom"));
}
