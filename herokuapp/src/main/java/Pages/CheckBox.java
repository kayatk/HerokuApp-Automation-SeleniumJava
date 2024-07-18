package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {
    public static void main(String[] args) {

        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.xpath("//a[contains(text(),'Checkboxes')]")).click();
        WebElement title = driver.findElement(By.xpath("//h3[contains(text(),'Checkboxes')]"));
        Assert.assertTrue(title.isDisplayed());

        //verify checkboxes default value
        WebElement checkBx1 = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
        WebElement checkBx2 = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));

        Assert.assertTrue(checkBx2.isSelected());
        Assert.assertFalse(checkBx1.isSelected());

        driver.quit();


    }
    
}
