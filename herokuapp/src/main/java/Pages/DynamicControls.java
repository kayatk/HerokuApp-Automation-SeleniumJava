package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicControls {
    public static void main(String[] args) {
         WebDriver driver =new ChromeDriver();
         driver.manage().window().maximize();
         driver.get("https://the-internet.herokuapp.com/dynamic_controls");

         //Enter Text in disabled field
         JavascriptExecutor js = (JavascriptExecutor) driver;
         js.executeScript("document.getElementsByTagName('input')[1].disabled=false;");

         //Enter Text on disabled field
         js.executeScript("document.getElementsByTagName('input')[1].value='field disabled';");

         driver.quit();
    }
    
}
