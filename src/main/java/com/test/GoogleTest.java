package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class GoogleTest
{
    WebDriver driver;
    @BeforeMethod
    public void setUp()
    {
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
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        // enter  the URL
        driver.get("http://www.google.com");
    }
    @Test(groups = "google")
    public void googleTitleTest()
    {
        String title = driver.getTitle();
        System.out.println(title);
    }
    @Test(groups = "google")
    public void googleLogoTest()
    {
        boolean b =driver.findElement(By.id("hplogo")).isDisplayed();
        System.out.println(b);
    }
    @Test(groups = "google")
    public void mailLinkTest()
    {
        boolean b1 =driver.findElement(By.linkText("Gmail")).isDisplayed();
        System.out.println(b1);
    }
    @Test(groups = "test")
    public void test1()
    {
        System.out.println("test1");
    }
    @Test(groups = "test")
    public void test2()
    {
        System.out.println("test2");
    }

    @AfterMethod
    public void tearDown()
    {
        driver.quit();
    }
}
