package NoverberSeleniumPractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUpHandle
{
    public static void main(String[] args) throws InterruptedException
    {
        //set up property for chrome driver
        System.setProperty("webdriver.chrome.driver", "src\\main\\Resources\\BrowserDriver\\chromedriver.exe");
        //launch the browser
        WebDriver driver = new ChromeDriver();
        //Enter the URL and launch the website
        driver.get("https://demo.nopcommerce.com");
        // click on SEARCH (it throws pop up message)
        driver.findElement(By.xpath("//input[@value=\"Search\"]")).click();
        // give a wait time
        Thread.sleep(5000);
        // I need to switch window and go on pop up window
        Alert alert=driver.switchTo().alert();
        // get message or text from alert pop up window
        System.out.println(alert.getText());
        // validation the message
        String text = alert.getText();
        if (text.equals("Please enter some search keyword"))
        {
            System.out.println("correct pop up message");
        }else
            {
                System.out.println("Incorrect pop up message");
            }
        // we need to press ok on alert pop up window
        alert.accept();
    }
}
