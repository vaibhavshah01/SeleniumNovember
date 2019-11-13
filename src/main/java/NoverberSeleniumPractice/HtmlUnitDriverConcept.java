package NoverberSeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import java.util.concurrent.TimeUnit;

public class HtmlUnitDriverConcept
{
    public static void main(String[] args) throws InterruptedException
    {
        //set up property for chrome driver
        System.setProperty("webdriver.chrome.driver", "src\\main\\Resources\\BrowserDriver\\chromedriver.exe");
        //launch the browser
        //WebDriver driver = new ChromeDriver();
        // Ghost driver or headless driver we use
        WebDriver driver =new HtmlUnitDriver();
        driver.manage().window().maximize(); //maximize window
        driver.manage().deleteAllCookies();//delete all cookies
        //dynamic wait
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        driver.get("https://ui.freecrm.com");// enter URL
        System.out.println("Before login title is : -----" + driver.getTitle());
        Thread.sleep(2000);
        driver.findElement(By.name("email")).sendKeys("vaibhav.softwaretester@gmail.com");
        driver.findElement(By.name("password")).sendKeys("Test12345");
        driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[3]")).click();
        Thread.sleep(2000);
        System.out.println("After login title is : -----" + driver.getTitle());

    }
}
