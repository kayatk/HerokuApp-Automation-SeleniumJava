package Pages;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FileDownload {
    public static void main(String[] args) {
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/download");
        Assert.assertTrue(driver.getCurrentUrl().contains("download"));
        ChromeOptions option = new ChromeOptions();
        Map<String,Object> download =new HashMap<String,Object>();
        download.put("download.default_directory", "herokuapp/src/main/resources");
        option.setExperimentalOption("download", download);
        driver.findElement(By.xpath("//a[text()='selenium-snapshot.png']")).click();

        
    }
    
}
