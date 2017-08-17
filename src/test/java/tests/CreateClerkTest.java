package tests;

import generic.LoginGeneral;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import pages.CreateClerkElements;
import utilities.CaptureScreenshot;

/**
 * Created by clifftonkariuki on 8/5/17.
 */
public class CreateClerkTest {

    WebDriver driver;

    static String clerkname= "Cliffton John Automation";
    static String clerkid= "112";
    static String clerkidno= "90897867";
    static String clerkemail= clerkname+ "@huduma.com";
    static String clerkpassword= "changeme";

    static String clerk_already_exists_id= "100";

    @AfterTest
    public void tearDown(){
        //driver.manage().deleteAllCookies();
        driver.quit();
    }

    public void takeScreenshot(){
        CaptureScreenshot capture= new CaptureScreenshot();
        capture.captureScreenshot(driver);
        System.out.println("Captured Successful clerk login screenshot\n");
    }

    @Test(priority = 1)
    public void createClerkTest() throws InterruptedException {
        /*for this test to pass, make sure that the value in
          the clerkid String above does not exist in the db since it is a primary key. Please log into the DB and
          check that value, it is incremental so just check the last value in the Asc order and set the value
          clerkid +1*/

        driver= LoginGeneral.callAdminLoginAction();

        Thread.sleep(2000);

        CreateClerkElements create_clerk= PageFactory.initElements(driver, CreateClerkElements.class);
        create_clerk.createClerk(clerkname, clerkid, clerkidno, clerkemail, clerkpassword);
        takeScreenshot();

        Thread.sleep(5000);
        tearDown();
    }

    @Test(priority = 2)
    public void createClerkNegativeTest() throws InterruptedException {
        driver= LoginGeneral.callAdminLoginAction();

        Thread.sleep(3000);

        CreateClerkElements create_clerk= PageFactory.initElements(driver, CreateClerkElements.class);
        create_clerk.createClerk(clerkname, clerk_already_exists_id, clerkidno, clerkemail, clerkpassword);
        takeScreenshot();

        Thread.sleep(5000);
        tearDown();
    }
}
