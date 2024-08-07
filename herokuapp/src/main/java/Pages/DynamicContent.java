package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicContent {
    public static void main(String[] args) {

        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/dynamic_content");

        Boolean flag= true;
        while (flag==true){
        try {
            driver.findElement(By.xpath("//div[@id='content']/div[1]/div[2]/text()")).getText().contains("Recusandae");
            
        } catch (Exception e) {
            driver.navigate().refresh();
            flag = true;
        }
    }
    }
}
