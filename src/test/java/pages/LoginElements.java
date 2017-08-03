package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by clifftonkariuki on 7/30/17.
 */
public class LoginElements {

    WebDriver driver;

    public LoginElements(WebDriver ldriver){
        this.driver= ldriver;
    }

    public void clerkLogin(String clerk_login, String clerk_password){

        driver.findElement(By.className("cd-signin")).click();

        driver.findElement(By.xpath("//a[contains(@href, '#001')]")).click();

        driver.findElement(By.id("login_email")).sendKeys(clerk_login);
        driver.findElement(By.id("signup-password")).sendKeys(clerk_password);

        driver.findElement(By.name("main")).click();

    }

    public void adminLogin(String admin_name, String admin_login, String admin_password){
        driver.findElement(By.className("cd-signin")).click();

        driver.findElement(By.xpath("//a[contains(@href, '#002')]")).click();

        driver.findElement(By.id("admin_name")).sendKeys(admin_name);
        driver.findElement(By.id("admin_email")).sendKeys(admin_login);
        driver.findElement(By.id("admin_password")).sendKeys(admin_password);

        driver.findElement(By.name("admin")).click();

    }
}
