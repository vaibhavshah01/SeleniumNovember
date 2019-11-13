package com.test;

import org.testng.annotations.*;

public class TestNgBasics
{
   @BeforeSuite
   public void setUp()
   {
       System.out.println("System property set up");
   }
    @BeforeClass
    public void launchBrowser()
    {
        System.out.println("launch chrome browser");
    }
    @BeforeTest
    public void login()
    {
        System.out.println("login method");
    }
    @BeforeMethod
    public void enterURL()
    {
        System.out.println("url");
    }
    @Test
    public void googleTitleTest()
    {
        System.out.println("Google title");
    }
    @AfterMethod
    public void logOut()
    {
        System.out.println("logout");
    }
    @AfterTest
    public void deleteAllCookies()
    {
        System.out.println("Delete all cookies");
    }
    @AfterClass
    public void closeBrowser()
    {
        System.out.println("Close Browser");
    }
    @AfterSuite
    public void generateTestReports()
    {

    }

}
