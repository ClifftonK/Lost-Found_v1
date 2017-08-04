package tests;

import generic.LoginGeneral;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.MenuBarToggle;
import utilities.CaptureScreenshot;

/**
 * Created by clifftonkariuki on 8/3/17.
 */
public class ToogleMenuTest {
    WebDriver driver;

    @Test
    public void testToggleMenu() throws InterruptedException {
        //call login action from the generic class
        LoginGeneral login_action= new LoginGeneral();
        login_action.callClerkLoginAtion();
        System.out.println("\nSuccessful Clerk Login \n");

        Thread.sleep(5000);

        System.out.println("about to click the ID Cards link\n");
        MenuBarToggle toggle_menu= PageFactory.initElements(driver, MenuBarToggle.class);
        toggle_menu.clickNidCardLink();

        CaptureScreenshot capture= new CaptureScreenshot();
        capture.captureScreenshot(driver);
        System.out.println("\nCaptured successful navigation to the NID Page screenshot\n");

        driver.quit();
    }
}
