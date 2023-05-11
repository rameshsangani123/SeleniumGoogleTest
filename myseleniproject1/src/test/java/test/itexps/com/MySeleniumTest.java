/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.itexps.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author 12244
 */
public class MySeleniumTest {
 private WebDriver driver;
private String baseUrl;
    
    public MySeleniumTest() {
    }

    

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        System.setProperty("webdriver.chrome.driver","c:\\data\\chromedriver.exe"); 
         driver = new ChromeDriver();
         
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
    
    @Test
  public void testGoogle() throws Exception {
    driver.get(baseUrl + "chrome://newtab/");
    driver.get("https://www.google.com/");
  }
  
 @Test
  public void testItexps() throws Exception {
    driver.get("https://www.itexps.net/");
    driver.findElement(By.id("DrpDwnMn00label")).click();
    driver.findElement(By.id("DrpDwnMn01label")).click();
    driver.findElement(By.id("DrpDwnMn02label")).click();
    driver.findElement(By.id("DrpDwnMn03label")).click();
    driver.findElement(By.id("DrpDwnMn04label")).click();
    driver.findElement(By.id("DrpDwnMn05label")).click();
    driver.findElement(By.id("DrpDwnMn06label")).click();
  }
}
