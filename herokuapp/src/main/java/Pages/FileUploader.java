package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploader {
    
    public static void main(String[] args) {
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/upload");

        driver.findElement(By.id("file-upload")).sendKeys("/Users/kaya/Downloads/IF PES English.docx");
        driver.findElement(By.id("file-submit")).click();
        Assert.assertTrue(driver.findElement(By.tagName("h3")).getText().contains("File Uploaded!"));

        driver.quit();
    }
}
