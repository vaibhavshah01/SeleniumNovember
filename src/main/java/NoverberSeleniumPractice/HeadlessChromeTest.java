package NoverberSeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class HeadlessChromeTest
{
    public static void main(String[] args)
    {
        //set up property for chrome driver
        System.setProperty("webdriver.chrome.driver", "src\\main\\Resources\\BrowserDriver\\chromedriver.exe");
        // to make  it headless we need to use ChromeOptions
        ChromeOptions options = new ChromeOptions();
        options.addArguments("window-size=1400,800");
        options.addArguments("headless");

        // now we need to pass the 'options'
        //launch the browser
        WebDriver driver = new ChromeDriver(options);
        //Maximise the window
        driver.manage().window().maximize();
        //Delete all cookies
        driver.manage().deleteAllCookies();
        //Enter the URL and launch the website
        driver.get("https://demo.nopcommerce.com");
        //page load wait time
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        //web element load wait time
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        //we print the title of the page
        System.out.println("page title : " + driver.getTitle());


    }
}
