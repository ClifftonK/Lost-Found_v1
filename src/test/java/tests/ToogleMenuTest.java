package tests;

import generic.LoginGeneral;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import pages.MenuBarToggle;
import utilities.CaptureScreenshot;


/**
 * Created by clifftonkariuki on 8/3/17.
 */
public class ToogleMenuTest {

    WebDriver driver;

    //String nid_title= "LFDR-ID cards";

   @AfterTest
    public void afterTest(){
        //driver.manage().deleteAllCookies();
        driver.quit();
    }

    public  void takeScreenshot(){
        CaptureScreenshot capture= new CaptureScreenshot();
        capture.captureScreenshot(driver);
        System.out.println("\nCaptured Successful clerk login screenshot\n");
    }

    @Test(priority = 1)
    public void testClickNhifButton() throws InterruptedException {
        driver= LoginGeneral.callClerkLoginAction();
        Thread.sleep(2000);

        System.out.println("about to click the ID Cards link\n");
        MenuBarToggle clicknid= PageFactory.initElements(driver, MenuBarToggle.class);
        clicknid.clickNidCardLink();

        Thread.sleep(3000);
        takeScreenshot();
        afterTest();
    }

    @Test(priority = 2)
    public void testClickNssfButton() throws InterruptedException {
        driver= LoginGeneral.callClerkLoginAction();
        Thread.sleep(2000);

        System.out.println("about to click the NHIF Card link\n");
        MenuBarToggle clicknhif= PageFactory.initElements(driver, MenuBarToggle.class);
        clicknhif.clickNidCardLink();
        clicknhif.clickNhifLink();

        Thread.sleep(3000);
        takeScreenshot();
        afterTest();

    }

}
