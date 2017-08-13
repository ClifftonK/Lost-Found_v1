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
        System.out.println("Captured Successful clerk login screenshot\n");
    }

    @Test(priority = 1)
    public void testClickNhifButton() throws InterruptedException {
        driver= LoginGeneral.callClerkLoginAction();
        Thread.sleep(2000);

        System.out.println("about to click the ID Cards link\n");
        MenuBarToggle clicknid= PageFactory.initElements(driver, MenuBarToggle.class);
        clicknid.clickNidCardLink();
        takeScreenshot();

        Thread.sleep(2000);
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
        takeScreenshot();

        Thread.sleep(2000);
        afterTest();

    }

    @Test(priority = 3)
    public void testClickNssfLink () throws InterruptedException {
        driver= LoginGeneral.callClerkLoginAction();
        Thread.sleep(2000);

        System.out.println("about to click the NHIF Card link\n");
        MenuBarToggle clicknssf= PageFactory.initElements(driver, MenuBarToggle.class);
        clicknssf.clickNidCardLink();
        clicknssf.clickNhifLink();
        clicknssf.clickNssfLink();
        takeScreenshot();

        Thread.sleep(2000);
        afterTest();
    }

    @Test(priority = 4)
    public void testClickDlButton() throws InterruptedException{
        driver= LoginGeneral.callClerkLoginAction();
        Thread.sleep(2000);

        System.out.println("about to click the NHIF Card link\n");
        MenuBarToggle clickdl= PageFactory.initElements(driver, MenuBarToggle.class);
        clickdl.clickNidCardLink();
        clickdl.clickNhifLink();
        clickdl.clickNssfLink();
        clickdl.clickDlLink();
        takeScreenshot();

        Thread.sleep(2000);
        afterTest();
    }

    @Test(priority = 5)
    public void testGoBackHome() throws InterruptedException{
        driver= LoginGeneral.callClerkLoginAction();
        Thread.sleep(2000);

        System.out.println("about to click the NHIF Card link\n");
        MenuBarToggle gobackhome= PageFactory.initElements(driver, MenuBarToggle.class);
        gobackhome.clickNidCardLink();
        gobackhome.clickNhifLink();
        gobackhome.clickNssfLink();
        gobackhome.clickDlLink();
        gobackhome.goBackHomeFromDl();
        takeScreenshot();

        Thread.sleep(2000);
        afterTest();
    }

}
