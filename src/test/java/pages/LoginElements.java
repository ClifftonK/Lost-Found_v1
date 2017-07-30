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

        driver.findElement(By.xpath("//a[contains(@href, '#001')]"));

        driver.findElement(By.id("login_email")).sendKeys(clerk_login);
        driver.findElement(By.id("signup-password")).sendKeys(clerk_password);

        driver.findElement(By.name("main")).click();

    }

    public void adminLogin(String admin_login, String admin_password, String admin_name){
        driver.findElement(By.className("cd-signin")).click();

        driver.findElement(By.xpath("//a[contains(@href, '#002')]"));

        driver.findElement(By.id("name")).sendKeys(admin_name);
        driver.findElement(By.id("email")).sendKeys(admin_login);
        driver.findElement(By.id("admin-password")).sendKeys(admin_password);

        driver.findElement(By.name("admin")).click();

    }
}
