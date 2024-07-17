package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class AddRemoveElements {
    public static void main(String[] args) {

        //Add Element Feature - Verify Onclick of AddElement button Element should get Added
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.xpath("//a[contains(text(),'Add/Remove')]")).click();
        Assert.assertTrue(driver.findElement(By.xpath("//h3[contains(text(),'Add/Remove')]")).isDisplayed());
        
        WebElement addBtn =driver.findElement(By.xpath("//button[text()='Add Element']"));
        
        //Add Element 
        addBtn.click();
        WebElement removeBtn =driver.findElement(By.xpath("//button[text()='Delete']"));
        Assert.assertTrue(removeBtn.isDisplayed());
        
        //Remove Element
        removeBtn.click();
        Assert.assertFalse(isElementPresent(removeBtn));
        
        driver.quit();
        
    }

    //To verify the Element Present

    public static Boolean isElementPresent(WebElement element)
    {
        try {
            element.isDisplayed();
            return true;
        } catch (Exception e) {
            return false;
        }
    }}
