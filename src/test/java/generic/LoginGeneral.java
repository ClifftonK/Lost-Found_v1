package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.LoginElements;
import utilities.LaunchBrowser;

/**
 * Created by clifftonkariuki on 8/3/17.
 */
public class LoginGeneral {

    static WebDriver driver;

    static String Url= "http://127.0.0.1/Lost&Found/index.html";
    //String title= driver.getTitle();

    public static WebDriver callClerkLoginAction(){
        driver= LaunchBrowser.startChromeDriver(Url);
        System.out.println("Starting the browser now...\n");

        LoginElements clerk_login= PageFactory.initElements(driver, LoginElements.class);
        clerk_login.clerkLogin("clif.kariuki@gmail.com", "xx");

        return driver;
    }

    public void callAdminLoginAction(){
        driver= LaunchBrowser.startChromeDriver(Url);
        System.out.println("Starting the browser now...\n");

        LoginElements admin_login= PageFactory.initElements(driver, LoginElements.class);
        admin_login.adminLogin("1", "admin@huduma.com", "admin");
    }
}
