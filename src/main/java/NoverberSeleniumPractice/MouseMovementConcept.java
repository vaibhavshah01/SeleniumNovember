package NoverberSeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovementConcept
{
    public static void main(String[] args)throws InterruptedException
    {
        //set up property for chrome driver
        System.setProperty("webdriver.chrome.driver", "src\\main\\Resources\\BrowserDriver\\chromedriver.exe");
        //launch the browser
        WebDriver driver = new ChromeDriver();
        //Maximise the window
        driver.manage().window().maximize();
        //Delete all cookies
        driver.manage().deleteAllCookies();
        //Enter the URL and launch the website
        driver.get("https://demo.nopcommerce.com");
        //make Actions class for mouse hover over
        Actions action =new Actions(driver);
        //Mouse hover over on Electronics
        action.moveToElement(driver.findElement(By.linkText("Electronics"))).build().perform();
        Thread.sleep(3000);
        // click on camera & photo
        driver.findElement(By.linkText("Camera & photo")).click();



    }
}
