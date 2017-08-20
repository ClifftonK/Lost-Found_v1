package tests;

import generic.LoginGeneral;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import pages.CreateClerkElements;
import sun.rmi.runtime.Log;
import utilities.CaptureScreenshot;

/**
 * Created by clifftonkariuki on 8/20/17.
 */
public class EditClerk extends LoginGeneral {

    static WebDriver driver;
    static LoginGeneral callLoginGen;

    static String newpass= "NewP@ssw0Rd";
    static String correctconfirmpass= "NewP@ssw0Rd";
    static String confirmpass= "C0nF1rmP@ss";

    public EditClerk(WebDriver ldriver){this.driver= ldriver;}

    public static void takeScreenshot(){
        CaptureScreenshot capture= new CaptureScreenshot();
        capture.captureScreenshot(driver);
        System.out.println("Captured Successful clerk login screenshot\n");
    }

    @AfterTest
    public static void tearDown(){
        //driver.manage().deleteAllCookies();
        driver.quit();
    }

    @Test(priority = 1)
    public static void editClerkPositiveTest() throws InterruptedException {
        driver= LoginGeneral.callCreateClerkAction();

        Thread.sleep(3000);

        CreateClerkElements editClerk= PageFactory.initElements(driver, CreateClerkElements.class);
        editClerk.editClerk(newpass, correctconfirmpass);
        takeScreenshot();

        tearDown();
    }

    @Test(priority = 2)
    public void editClerkNegativeTest() throws InterruptedException {
        driver= LoginGeneral.callCreateClerkAction();

        Thread.sleep(3000);

        CreateClerkElements editClerk= PageFactory.initElements(driver, CreateClerkElements.class);
        editClerk.editClerk(newpass, confirmpass);
        takeScreenshot();

        tearDown();
    }
}
