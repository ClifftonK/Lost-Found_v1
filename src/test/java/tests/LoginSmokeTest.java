package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.LoginElements;
import utilities.LaunchBrowser;

import java.util.concurrent.TimeUnit;

/**
 * Created by clifftonkariuki on 7/30/17.
 */
public class LoginSmokeTest {

    WebDriver driver;

    static String Url= "http://127.0.0.1/Lost&Found/index.html";

    @Test(priority = 1)
    public void positiveTestClerkLogin() throws InterruptedException {
        driver= LaunchBrowser.startChromeDriver(Url);

        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Thread.sleep(3000);

        LoginElements clerk_login= PageFactory.initElements(driver, LoginElements.class);
        clerk_login.clerkLogin("clif.kariuki@gmail.com", "xx");

        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(3000);

        driver.quit();
    }

    @Test(priority = 2)
    public void negativeTestClerkLogin() throws InterruptedException {

        driver= LaunchBrowser.startChromeDriver(Url);

        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Thread.sleep(3000);

        LoginElements clerk_login= PageFactory.initElements(driver, LoginElements.class);
        clerk_login.clerkLogin("cliffton.kariuki@gmail.com", "wrong pass");

        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(3000);

        driver.quit();

    }

    @Test(priority = 3)
    public void positiveTestAdminLogin() throws InterruptedException {
        driver= LaunchBrowser.startChromeDriver(Url);

        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Thread.sleep(3000);

        LoginElements admin_login= PageFactory.initElements(driver, LoginElements.class);
        admin_login.adminLogin("1", "admin@huduma.com", "admin");

        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Thread.sleep(3000);

        driver.quit();
    }

    @Test(priority = 4)
    public void negativeTestAdminLogin() throws InterruptedException {
        driver= LaunchBrowser.startChromeDriver(Url);

        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Thread.sleep(3000);

        LoginElements admin_login= PageFactory.initElements(driver, LoginElements.class);
        admin_login.adminLogin("1", "admin@huduma.coke", "incorrectpass");

        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Thread.sleep(3000);

        driver.quit();

    }
}
