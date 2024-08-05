package Pages;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FileDownload {
    public static void main(String[] args) throws IOException {
       
       
       String path ="/Users/kaya/Documents/Selenium/herokuapp/herokuapp/src/main/resources";
       File file = new File(path);
       FileUtils.cleanDirectory(file);
      // String path=System.getProperty("user.dir") + "src/main/resources";
        Map<String,String> preferences =new HashMap<>();
        preferences.put("download.default_directory",path );
        ChromeOptions option = new ChromeOptions();
        option.setExperimentalOption("prefs", preferences);
        System.out.println(System.getProperty("user.dir")+"/Selenium/herokuapp/herokuapp/src/main/resources");

        WebDriver driver =new ChromeDriver(option);
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/download");
        Assert.assertTrue(driver.getCurrentUrl().contains("download"));
        driver.findElement(By.xpath("//a[text()='selenium-snapshot.png']")).click();
      
      driver.quit();
        
    }
    
   
}
