package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicLoading {
    public static void main(String[] args) {
        WebDriver driver =new ChromeDriver();
         driver.manage().window().maximize();
         driver.get("https://the-internet.herokuapp.com/dynamic_loading");
    }
    
}
