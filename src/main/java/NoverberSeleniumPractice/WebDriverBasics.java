package NoverberSeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import javax.print.attribute.standard.Chromaticity;

public class WebDriverBasics
{
    public static void main(String[] args)
    {
        //1. launch Gecko Driver
        // geckodriver
        //System.setProperty("webdriver.gecko.driver", "src\\main\\Resources\\BrowserDriver\\geckodriver.exe");

        //open the browser
      // WebDriver driver = new FirefoxDriver();
        //2. Launch chrome driver
        //chromedriver
        System.setProperty("webdriver.chrome.driver", "src\\main\\Resources\\BrowserDriver\\chromedriver.exe");

        //open the browser
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com");// enter URL
        String title = driver.getTitle();// get a title of the page
        System.out.println(title);//print the title of the page on console
        //validate the tile

       if (title.equals("nopCommerce demo store"))
        {
            System.out.println("Correct title");
        }
        else
            {
                System.out.println("Incorrect title");
            }
        // to get the current url
        //String currentUrl = driver.getCurrentUrl();
       // System.out.println(currentUrl);

        //to get the current url without using String
        System.out.println(driver.getCurrentUrl());
        driver.quit();


    }
}
