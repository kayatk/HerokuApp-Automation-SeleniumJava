package Pages;

import java.util.List;
import org.apache.hc.client5.http.classic.methods.HttpGet;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.CloseableHttpResponse;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.core5.http.ClassicHttpRequest;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class CheckBoxes {
    public static void main(String[] args) {
        
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.xpath("//a[contains(text(),'Broken')]")).click();
       
    //Verify Title Present or not
       Assert.assertTrue(driver.findElement(By.xpath("//h3[contains(text(),'Broken')]")).isDisplayed());

    //Find all Images   
       List <WebElement> images = driver.findElements(By.tagName("img"));
       for (WebElement img : images) {
            CloseableHttpClient client = HttpClients.createDefault();
            HttpGet request = new HttpGet(img.getAttribute("src"));
            CloseableHttpResponse response = client.execute(request);
            //if (response.getStatusLine().getSta)

       }


    }
    
}
