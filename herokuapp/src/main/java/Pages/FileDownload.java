package Pages;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FileDownload {
    public static void main(String[] args) {
        ChromeOptions option = new ChromeOptions();
        Map<String,Object> download =new HashMap<String,Object>();
        download.put("download.default_directory", "herokuapp/src/main/resources");
        option.setExperimentalOption("download", download);

        WebDriver driver =new ChromeDriver(option);
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/download");
        Assert.assertTrue(driver.getCurrentUrl().contains("download"));
    

        driver.findElement(By.xpath("//a[text()='selenium-snapshot.png']")).click();
        Assert.assertTrue(isFileAvailable(),"File Not Found");
        
    }
    
    public boolean isFileAvailable(){

        File folder =new File("herokuapp/src/main/resources");
        File[] lFiles =folder.listFiles();
        boolean isFileAvailable = false;
        for(File x: lFiles){
            if(x.isFile()){
                String fileName =x.getName();
                if ((fileName.matches(fileName))) {
                    isFileAvailable =true;
                }
            }
        }
        return isFileAvailable;
    }
}
