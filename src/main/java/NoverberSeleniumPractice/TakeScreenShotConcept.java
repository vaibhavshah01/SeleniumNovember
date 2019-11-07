package NoverberSeleniumPractice;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class TakeScreenShotConcept
{
    public static void main(String[] args) throws IOException
    {
        //set up property for chrome driver
        System.setProperty("webdriver.chrome.driver", "src\\main\\Resources\\BrowserDriver\\chromedriver.exe");
        //launch the browser
        WebDriver driver = new ChromeDriver();
        //Enter the URL and launch the website
        driver.get("https://demo.nopcommerce.com");
        //page load wait time
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        //web element load wait time
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        //Take a Screen Shot and Store as a file format
        File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        // Now copy the Screen Shot to desired location using copyFile //method
       FileUtils.copyFile(src,new File("C:\\dev\\SeleniumNovember\\src\\main\\java\\NoverberSeleniumPractice/nopcommerce.png"));

    }
}
