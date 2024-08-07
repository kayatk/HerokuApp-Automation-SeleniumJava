package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicContent {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/dynamic_content");

        Boolean flag= true;
      //  while (flag==true){
        try {
            driver.findElement(By.xpath("//div[@id='content']/div[1]/div[2]")).getText().contains("Excepturi");
           // System.out.println(driver.findElement(By.xpath("//div[@id='content']/div[1]/div[2]")).getText());
            flag=false;
            System.out.println("found");
            //break;
            
        } catch (Exception e) {
            driver.navigate().refresh();
            //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
            Thread.sleep(1000);
        }
   // }
   driver.quit();
    }
}
