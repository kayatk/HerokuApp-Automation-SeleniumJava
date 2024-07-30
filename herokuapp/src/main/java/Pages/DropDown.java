package Pages;

import static org.junit.Assert.assertThat;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
    public static void main(String args[]){

       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://the-internet.herokuapp.com/dropdown");
       WebElement title =driver.findElement(By.cssSelector("h3"));
       Assert.assertTrue(title.getText().contains("Dropdown List"));

       //Dropdown
       Select select =new Select(driver.findElement(By.id("dropdown")));
       select.selectByVisibleText("Option 1");
      Assert.assertEquals(select.getFirstSelectedOption().getText(),"Option 1");

      //Navigation
      //Navigating back to the main page
     // driver.navigate().back();
    //Assert.assertTrue(driver.findElement(By.xpath("//h2[text()='Available Examples']")).isDisplayed());
   
      driver.quit();

      
    }
    
}
