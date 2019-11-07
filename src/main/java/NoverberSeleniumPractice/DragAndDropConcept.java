package NoverberSeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropConcept
{
    public static void main(String[] args) throws InterruptedException
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
        driver.get("https://jqueryui.com/droppable/");
        //only use when frame available
        // switch to the frame and only one frame that's why we put o in frame
        driver.switchTo().frame(0);
        //wait time to see the switch to frame action
        Thread.sleep(3000);
        // make Actions class for drag and drop
        Actions action =new Actions(driver);
        // click ,hold source and then move to target and release
        action.clickAndHold(driver.findElement(By.id("draggable")))
                .moveToElement(driver.findElement(By.id("droppable")))
                .release()
                .build()
                .perform();



    }
}
