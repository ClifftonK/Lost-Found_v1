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

    static String clerkname= "Automation Mwangi";
    static String clerkid= "1891";
    static String clerkidno= "123454390";
    static String clerkemail= "grace.mwangi@huduma.com";
    static String clerkpassword= "changeme";
    static String Url= "http://127.0.0.1/Lost&Found/index.html";

    @AfterTest
    public void tearDown(){
        //driver.manage().deleteAllCookies();
        driver.quit();
    }

    public void createClerkTest(){

    }

    @Test
    public void createClerkNegativeTest() throws InterruptedException {
        //LoginGeneral admin_login= new LoginGeneral();
       // admin_login.callAdminLoginAction();
        driver= LaunchBrowser.startChromeDriver(Url);
        System.out.println("\nStarting the browser now...\n");

        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Thread.sleep(2000);

        LoginElements admin_login= PageFactory.initElements(driver, LoginElements.class);
        admin_login.adminLogin("1", "admin@huduma.com", "admin");
        System.out.println("Successful Admin login\n");

        Thread.sleep(3000);

       // CreateClerkElements create_clerk= PageFactory.initElements(driver, CreateClerkElements.class);
        //create_clerk.createClerk(clerkname, clerkid, clerkidno, clerkemail, clerkpassword);

        driver.findElement(By.name("cname")).sendKeys(clerkname);
        driver.findElement(By.name("cid")).sendKeys(clerkid);
        driver.findElement(By.name("cidno")).sendKeys(clerkidno);
        driver.findElement(By.name("cemail")).sendKeys(clerkemail);
        driver.findElement(By.name("cpassword")).sendKeys(clerkpassword);
        //driver.findElement(By.name("")).sendKeys(clerkhuduma);

        WebElement set_huduma= driver.findElement(By.name("huduma"));
        Select huduma= new Select(set_huduma);
        huduma.selectByVisibleText("Huduma Eastleigh");

        driver.findElement(By.name("create_clerk")).click();

        Thread.sleep(3000);

        CaptureScreenshot capture= new CaptureScreenshot();
        capture.captureScreenshot(driver);
        System.out.println("\nCaptured Successful clerk login screenshot\n");

        tearDown();
    }
}
