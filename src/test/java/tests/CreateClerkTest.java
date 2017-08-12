package tests;

import generic.LoginGeneral;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import pages.CreateClerkElements;
import pages.LoginElements;
import utilities.CaptureScreenshot;
import utilities.LaunchBrowser;

/**
 * Created by clifftonkariuki on 8/5/17.
 */
public class CreateClerkTest {

    WebDriver driver;

    static String clerkname= "Automation Kariuki";
    static String clerkid= "109";
    static String clerkidno= "30232409";
    static String clerkemail= clerkname+ "@huduma.com";
    static String clerkpassword= "changeme";
   // static String Url= "http://127.0.0.1/Lost&Found/index.html";

    @AfterTest
    public void tearDown(){
        //driver.manage().deleteAllCookies();
        driver.quit();
    }

    public  void takeScreenshot(){
        CaptureScreenshot capture= new CaptureScreenshot();
        capture.captureScreenshot(driver);
        System.out.println("\nCaptured Successful clerk login screenshot\n");
    }

    @Test(priority = 1)
    public void createClerkTest() throws InterruptedException {
        driver= LoginGeneral.callAdminLoginAction();

        Thread.sleep(2000);

        CreateClerkElements create_clerk= PageFactory.initElements(driver, CreateClerkElements.class);
        create_clerk.createClerk(clerkname, clerkid, clerkidno, clerkemail, clerkpassword);

        Thread.sleep(5000);

        takeScreenshot();
        tearDown();
    }

    @Test(priority = 2)
    public void createClerkNegativeTest() throws InterruptedException {
        driver= LoginGeneral.callAdminLoginAction();

        Thread.sleep(3000);

        takeScreenshot();
        tearDown();
    }
}
