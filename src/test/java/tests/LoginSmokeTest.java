package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import pages.LoginElements;
import utilities.CaptureScreenshot;
import utilities.LaunchBrowser;

/**
 * Created by clifftonkariuki on 7/30/17.
 */
public class LoginSmokeTest {

    WebDriver driver;

    static String Url= "http://127.0.0.1/Lost&Found/index.html";
    //String title= driver.getTitle();

    @AfterTest
    public void teardown(){
        //driver.manage().deleteAllCookies();
        driver.quit();
    }

    public  void takeScreenshot(){
        CaptureScreenshot capture= new CaptureScreenshot();
        capture.captureScreenshot(driver);
        System.out.println("Captured Successful clerk login screenshot\n");
    }

    @Test(priority = 1)
    public void positiveTestClerkLogin() throws InterruptedException {
        driver= LaunchBrowser.startChromeDriver(Url);
       System.out.println("Starting the browser now...\n");

        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Thread.sleep(2000);

        LoginElements clerk_login= PageFactory.initElements(driver, LoginElements.class);
        clerk_login.clerkLogin("clif.kariuki@gmail.com", "xx");
        takeScreenshot();

        Thread.sleep(2000);
        teardown();
    }

    @Test(priority = 2)
    public void negativeTestClerkLogin() throws InterruptedException {
        driver= LaunchBrowser.startChromeDriver(Url);
        System.out.println("Starting the browser now...\n");

        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Thread.sleep(2000);

        LoginElements clerk_login= PageFactory.initElements(driver, LoginElements.class);
        clerk_login.clerkLogin("cliffton.kariuki@gmail.com", "wrong pass");
        takeScreenshot();

        Thread.sleep(2000);
        teardown();
    }

    @Test(priority = 3)
    public void positiveTestAdminLogin() throws InterruptedException {
        driver= LaunchBrowser.startChromeDriver(Url);
       System.out.println("Starting the browser now...\n");

        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Thread.sleep(2000);

        LoginElements admin_login= PageFactory.initElements(driver, LoginElements.class);
        admin_login.adminLogin("1", "admin@huduma.com", "admin");
        takeScreenshot();

        Thread.sleep(2000);
        teardown();
    }

    @Test(priority = 4)
    public void negativeTestAdminLogin() throws InterruptedException {
        driver= LaunchBrowser.startChromeDriver(Url);
        System.out.println("Starting the browser now...\n");

        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Thread.sleep(2000);

        LoginElements admin_login= PageFactory.initElements(driver, LoginElements.class);
        admin_login.adminLogin("1", "admin@huduma.coke", "incorrectpass");
        takeScreenshot();

        Thread.sleep(2000);
        teardown();

    }
}
