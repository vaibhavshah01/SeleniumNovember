package NoverberSeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropBox
{
    public static void main(String[] args)
    { //set up property for chrome driver
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
        //Enter the birth of month by using Handle Drop Box (Select class)
        Select select =new Select(driver.findElement(By.name("DateOfBirthMonth")));
        select.selectByVisibleText("July");
        //Enter the year of birth
        Select select1=new Select(driver.findElement(By.name("DateOfBirthYear")));
        select1.selectByVisibleText("2010");

    }
}
