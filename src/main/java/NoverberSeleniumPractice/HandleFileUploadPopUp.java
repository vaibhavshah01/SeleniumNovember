package NoverberSeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFileUploadPopUp
{
    public static void main(String[] args)
    {
        //set up property for chrome driver
        System.setProperty("webdriver.chrome.driver", "src\\main\\Resources\\BrowserDriver\\chromedriver.exe");
        //launch the browser
        WebDriver driver = new ChromeDriver();
        //Enter the URL and launch the website
        driver.get("https://html.com/input-type-file/");
        //Enter the xpath of choose file option and set path the file we want to attach in send keys
        driver.findElement(By.name("fileupload")).sendKeys("C:\\Users\\User\\Desktop\\CV_temp.docx");

    }
}
