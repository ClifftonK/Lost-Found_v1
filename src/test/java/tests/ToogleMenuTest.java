package tests;

import generic.LoginGeneral;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import pages.MenuBarToggle;
import utilities.CaptureScreenshot;

/**
 * Created by clifftonkariuki on 8/3/17.
 */
public class ToogleMenuTest {
    WebDriver driver;
    String nid_title= "LFDR-ID cards";

   @AfterTest
    public void afterTest(){
        driver.manage().deleteAllCookies();
        driver.quit();
    }

    @Test(priority = 1)
    public void testClickNhifButton() throws InterruptedException {
        //call login action from the generic class
        LoginGeneral login_action= new LoginGeneral();
        login_action.callClerkLoginAtion();
        System.out.println("\nSuccessful Clerk Login \n");

        Thread.sleep(3000);

        System.out.println("about to click the ID Cards link\n");
        MenuBarToggle clicknid= PageFactory.initElements(driver, MenuBarToggle.class);
        clicknid.clickNidCardLink();

        //Assert.assertTrue(driver.getTitle(), is(nid_title));
        afterTest();
    }

    @Test(priority = 2)
    public void testClickNssfButton() throws InterruptedException {
        LoginGeneral login_action= new LoginGeneral();
        login_action.callClerkLoginAtion();
        System.out.println("\nSuccessful Clerk Login \n");

        Thread.sleep(5000);

        MenuBarToggle clicknhif= PageFactory.initElements(driver, MenuBarToggle.class);
        clicknhif.clickNidCardLink();
        clicknhif.clickNhifLink();

        afterTest();

    }

}
