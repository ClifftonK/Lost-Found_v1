package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.CreateClerkElements;
import pages.LoginElements;
import utilities.LaunchBrowser;

/**
 * Created by clifftonkariuki on 8/3/17.
 */
public abstract class LoginGeneral {

    static WebDriver driver;
    static LoginGeneral alllogin;

    static String Url= "http://127.0.0.1/Lost&Found/index.html";

    static String admin_name= "1";
    static String admin_email= "admin@huduma.com";
    static String admin_pass= "admin";

    static String clerk_email= "clif.kariuki@gmail.com";
    static String clerk_pass= "xx";

    static String clerkname= "Edit Automation";
    static String clerkid= "117";
    static String clerkidno= "23454334";
    static String clerkemail= clerkname+ "@huduma.com";
    static String clerkpassword= "changeme";

    public static WebDriver callClerkLoginAction(){
        driver= LaunchBrowser.startChromeDriver(Url);
        System.out.println("Starting the browser now...\n");

        LoginElements clerk_login= PageFactory.initElements(driver, LoginElements.class);
        clerk_login.clerkLogin(clerk_email, clerk_pass);
        System.out.println("Successful clerk login\n");

        return driver;
    }

    public static WebDriver callAdminLoginAction(){
        driver= LaunchBrowser.startChromeDriver(Url);
        System.out.println("Starting the browser now...\n");

        LoginElements admin_login= PageFactory.initElements(driver, LoginElements.class);
        admin_login.adminLogin(admin_name, admin_email, admin_pass);
        System.out.println("Successful admin login\n");

        return driver;
    }

    public static WebDriver callCreateClerkAction() throws InterruptedException {
        alllogin.callAdminLoginAction();

        Thread.sleep(4000);

        CreateClerkElements create_clerk= PageFactory.initElements(driver, CreateClerkElements.class);
        create_clerk.createClerk(clerkname, clerkid, clerkidno, clerkemail, clerkpassword);
        System.out.println("Clerk successfully created.. Moving to Changing Password\n");

        return driver;
    }
}
