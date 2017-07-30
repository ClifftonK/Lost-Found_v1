package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by clifftonkariuki on 7/30/17.
 */
public class LaunchBrowser {

    static WebDriver driver;

    public static WebDriver startChromeDriver(String url){
        System.setProperty("Webdriver.chrome.driver", "../Selenium_Jars/chromedriver");

        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);

        return driver;
    }
}
