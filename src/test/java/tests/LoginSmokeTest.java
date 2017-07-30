package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.LoginElements;
import utilities.LaunchBrowser;

/**
 * Created by clifftonkariuki on 7/30/17.
 */
public class LoginSmokeTest {

    WebDriver driver;

    @Test(priority = 1)
    public void positiveTestClerkLogin(){
        driver= LaunchBrowser.startChromeDriver("http://127.0.0.1/Lost&Found/index.html");

        LoginElements clerk_login= PageFactory.initElements(driver, LoginElements.class);
        clerk_login.clerkLogin("clif.kariuki@gmail.com", "xx");

        driver.quit();
    }

    public void negativeTestClerkLogin(){

    }

    @Test(priority = 3)
    public void positiveTestAdminLogin(){
        driver= LaunchBrowser.startChromeDriver("http://127.0.0.1/Lost&Found/index.html");

        LoginElements admin_login= PageFactory.initElements(driver, LoginElements.class);
        admin_login.adminLogin("1", "admin@huduma.com", "admin");
    }

    public void negativeTestAdminLogin(){

    }
}
