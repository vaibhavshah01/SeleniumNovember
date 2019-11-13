package NoverberSeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ElementVisibillityTest
{
    public static void main(String[] args)
    {
        //set up property for chrome driver
        System.setProperty("webdriver.chrome.driver", "src\\main\\Resources\\BrowserDriver\\chromedriver.exe");
        //launch the browser
        WebDriver driver = new ChromeDriver();
        //page load wait time
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        //web element load wait time
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        //Maximise the window
        driver.manage().window().maximize();
        //Delete all cookies
        driver.manage().deleteAllCookies();
        //Enter the URL and launch the website
        driver.get("https://demo.nopcommerce.com");

        //is displayed method              //for all elements
        //click on Register //locator linktext //it's give boolean value (true or false)
       // driver.findElement(By.linkText("Register")).isDisplayed();
        //isDisplayed() give boolean value (true or false)
      //  boolean b1 = driver.findElement(By.linkText("Register")).isDisplayed();
        //print the boolean value
       // System.out.println(b1);

        // is Enabled() method
        //click on Register //locator linktext //it's give boolean value (true or false)
       // driver.findElement(By.linkText("Register")).isEnabled();
        //isEnabled() give boolean value (true or false)
      //  boolean b2 = driver.findElement(By.linkText("Register")).isEnabled();
        //print the boolean value
       // System.out.println(b2);

        //isSelected() method // only applicable for dropdown,checkbox,radiobutton
        //click on Register //locator linktext //it's give boolean value (true or false)
        driver.findElement(By.linkText("Register")).click();
        // checkbox for newsletter in registration form
        driver.findElement(By.id("Newsletter")).isSelected();
        //isSelected() give boolean value
        boolean b3= driver.findElement(By.xpath("//input[@id=\"Newsletter\"]")).isSelected();
        //print thr boolean value
        System.out.println(b3);






    }
}
