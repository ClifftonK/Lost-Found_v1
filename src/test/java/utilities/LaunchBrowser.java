package utilities;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by clifftonkariuki on 7/30/17.
 */
public class LaunchBrowser {

    static WebDriver driver;

    public static WebDriver startChromeDriver(String url){

        //this is the code for locating chromedriver when using maven. make sure to include the "webdrivermanager" dependency
        ChromeDriverManager.getInstance().setup();
        //System.setProperty("Webdriver.chrome.driver", "home/clifftonkariuki/workspace/Selenium_Jars/chromedriver");

        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);

        return driver;
    }
}
