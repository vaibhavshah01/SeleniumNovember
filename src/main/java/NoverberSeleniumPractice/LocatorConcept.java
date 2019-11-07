package NoverberSeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept
{
    public static void main(String[] args)
    {
        //set up property for chrome driver
        System.setProperty("webdriver.chrome.driver", "src\\main\\Resources\\BrowserDriver\\chromedriver.exe");
        //launch the browser
        WebDriver driver = new ChromeDriver();
        //Enter the URL and launch the website
        driver.get("https://demo.nopcommerce.com");
        //click on Register //locator linktext
        driver.findElement(By.linkText("Register")).click();
        //click on Gender // locator xpath
        driver.findElement(By.xpath("//input[@value=\"M\"]")).click();
        // Enter the first name //locator id
        driver.findElement(By.id("FirstName")).sendKeys("Rehan");
        //Enter the last name //locator name
        driver.findElement(By.name("LastName")).sendKeys("Shah");
        //Enter the company name // locator : css selector
        driver.findElement(By.cssSelector("#Company")).sendKeys("Shri Krishna");
    }
}