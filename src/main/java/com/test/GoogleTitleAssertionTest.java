package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class GoogleTitleAssertionTest
{
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        //set up property for chrome driver
        System.setProperty("webdriver.chrome.driver", "src\\main\\Resources\\BrowserDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        //Maximise the window
        driver.manage().window().maximize();
        //Delete all cookies
        driver.manage().deleteAllCookies();
        //page load wait time
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        //web element load wait time
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        // enter  the URL
        driver.get("http://www.google.com");
    }
    @Test
    public void googleTitleTest()
    {
        String title = driver.getTitle();
        // print the title
        System.out.println(title);
        // we validate the title that actula and expected are matching or not
        Assert.assertEquals(title,"Google","this is not matched");

     //   Assert.assertEquals("google","google","title is not matched");
    }
    @Test
    public void googleLogoTest()
    {
        boolean b = driver.findElement(By.id("hplogo")).isDisplayed();
        // if google logo displayed test case pass (that mean condition is true)
       // Assert.assertTrue(b);
        //Another way to do boolean Assertion
        Assert.assertEquals(b,true);
    }
    @AfterMethod
    public void tearDown()
    {
        driver.quit();
    }



}
