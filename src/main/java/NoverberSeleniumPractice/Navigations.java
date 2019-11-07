package NoverberSeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Navigations
{
    public static void main(String[] args) throws InterruptedException
    {
        //set up property for chrome driver
        System.setProperty("webdriver.chrome.driver", "src\\main\\Resources\\BrowserDriver\\chromedriver.exe");
        //launch the browser
        WebDriver driver = new ChromeDriver();
        //page load wait time
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        //web element load wait time
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        //Enter the URL and launch the website
        driver.get("https://demo.nopcommerce.com");
        //navigate to another page
        driver.navigate().to("https://google.com");
        // wait time to see the back and forth
        Thread.sleep(1500);
        // go back to nop commerce page
        driver.navigate().back();
        // wait time to see back and forth
        Thread.sleep(1500);
        // go back to google page
        driver.navigate().forward();
        //refresh the page
        driver.navigate().refresh();



    }
}
