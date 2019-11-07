package NoverberSeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropFile
{
    static WebDriver driver;
    public static void main(String[] args) throws IOException
    {   //we are creating the Properties class
        Properties prop = new Properties();
        // we create FileInputStream class and set path of config properties
        // which make connection between config file and java code
        FileInputStream fis = new FileInputStream("C:\\dev\\SeleniumNovember\\src\\main\\java\\NoverberSeleniumPractice\\config.properties");
        // we read the file
        prop.load(fis);
        // print the value so we need the key in get.property method
        System.out.println(prop.getProperty("name"));
        // read the url from config file
        prop.getProperty("URL");
        // it will give String so we store in String
        String url =prop.getProperty("URL");
        //print the URL
        System.out.println(url);
        //read the browser from the config file
        prop.getProperty("browser");
        //it gives a string so store in String
        String browserName = prop.getProperty("browser");
        // print the browser name
        System.out.println(browserName);
        // we use logic for different browser
        if (browserName.equals("chrome"))
        {
            //set up property for chrome driver
            System.setProperty("webdriver.chrome.driver", "src\\main\\Resources\\BrowserDriver\\chromedriver.exe");
            //launch the browser
            driver = new ChromeDriver();
        }else if (browserName.equals("FF"))
        {
            // set up property for geckodriver
            System.setProperty("webdriver.gecko.driver", "src\\main\\Resources\\BrowserDriver\\geckodriver.exe");
            //open the browser
            driver = new FirefoxDriver();
        }
            // get url
            driver.get(url);
            //click on Register //locator linktext
            driver.findElement(By.linkText("Register")).click();
            // add the first name on register page
            driver.findElement(By.xpath(prop.getProperty("firstname_xpath"))).sendKeys(prop.getProperty("firstName"));
            // add last name on Register page
            driver.findElement(By.xpath(prop.getProperty("lastname_xpath"))).sendKeys(prop.getProperty("lastName"));
            // add company name on Register page
            driver.findElement(By.xpath(prop.getProperty("company_xpath"))).sendKeys(prop.getProperty("companyName"));

    }
}
