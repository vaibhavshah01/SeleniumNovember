package NoverberSeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class HandleWindowPopUp
{
    public static void main(String[] args) throws InterruptedException
    {
        //set up property for chrome driver
        System.setProperty("webdriver.chrome.driver", "src\\main\\Resources\\BrowserDriver\\chromedriver.exe");
        //launch the browser
        WebDriver driver = new ChromeDriver();
        //maximize the window
        driver.manage().window().maximize();
        //delete all cookies
        driver.manage().deleteAllCookies();
        //Enter the URL
        driver.get("http://popuptest.com/goodpopups.html");
        //click on the pop up 3
        driver.findElement(By.linkText("Good PopUp #3")).click();
        // wait time
        Thread.sleep(2000);
        // to get windows id we use this method
        Set<String> handler=driver.getWindowHandles();
        // to get value from set object we need iterators
        Iterator<String> it = handler.iterator();
        // to get a parent window id value use this method
        String parentWindowId = it.next();
        // to print a value of parent window id
        System.out.println("Parent Window Id :" + parentWindowId);
        // to get a child window id value we use this method
        String childWindowId = it.next();
        // to print a value of child window id
        System.out.println("Child Window ID :" + childWindowId);
        // we switch to child window
        driver.switchTo().window(childWindowId);
        //wait time
        Thread.sleep(2000);
        // print child window title
        System.out.println("Child window title:"+ driver.getTitle());
        // now we close the pop up browser page
        driver.close();
        // now we back to parent window id
        driver.switchTo().window(parentWindowId);
        //wait time
        Thread.sleep(2000);
        // print title of parent window id
        System.out.println("Parent Window Title:" + driver.getTitle());



    }
}
