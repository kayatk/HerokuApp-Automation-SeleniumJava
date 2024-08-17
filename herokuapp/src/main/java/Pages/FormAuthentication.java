package Pages;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class FormAuthentication {
            public static void main(String[] args) throws IOException, ParseException {
                    WebDriver driver =new ChromeDriver();
                    driver.manage().window().maximize();
                    driver.get("https://the-internet.herokuapp.com/login");
                    Assert.assertTrue(driver.getCurrentUrl().contains("login"));

                    By userName= By.id("username");
                    By password =By.id("password");
                    By loginBtn = By.xpath("//button[@type='submit']");
                    By logoutBtn = By.className("button");
                    By message =By.id("flash");

                    //Invalid credentials
                        driver.findElement(userName).sendKeys(dataReader("Invalid","userName"));
                        driver.findElement(password).sendKeys(dataReader("Invalid","password"));
                        driver.findElement(loginBtn).click();
                        Assert.assertTrue("Invalid Message",driver.findElement(message).getText().contains("Your username is invalid!"));
                    //Invalid Password
                        driver.findElement(userName).sendKeys(dataReader("Valid","userName"));
                        driver.findElement(password).sendKeys(dataReader("Invalid","password"));
                        driver.findElement(loginBtn).click();
                        Assert.assertTrue("Invalid Message",driver.findElement(message).getText().contains("Your password is invalid!"));
                    //Valid Login
                        driver.findElement(userName).sendKeys(dataReader("Valid","userName"));
                        driver.findElement(password).sendKeys(dataReader("Valid","password"));
                        driver.findElement(loginBtn).click();
                        Assert.assertTrue("Invalid Message",driver.findElement(message).getText().contains("You logged into a secure area!"));
                    //Logout
                        driver.findElement(logoutBtn).click();
                        Assert.assertTrue("Invalid Message on Logout",driver.findElement(message).getText().contains("You logged out of the secure area!"));

                    driver.quit();
            }

            public static String dataReader(String crdentialType,String key) throws IOException, ParseException{
                JSONParser js =new JSONParser();
                FileReader file =new FileReader("herokuapp/src/main/resources/credentials.json");
                Object ob =js.parse(file);
                JSONObject jobj = (JSONObject)ob;
                JSONObject jcred = (JSONObject) jobj.get(crdentialType);
                String value = (String)jcred.get(key);
                return value;
            }
            
    
}
    
