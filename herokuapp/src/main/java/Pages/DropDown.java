package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown {
    public static void main(String args[]){

       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://the-internet.herokuapp.com/dropdown");
       WebElement title =driver.findElement(By.cssSelector("h3"));
       Assert.assertTrue(title.getText().contains("Dropdown List"));

    }
    
}
