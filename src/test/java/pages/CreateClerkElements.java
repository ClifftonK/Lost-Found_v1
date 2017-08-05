package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by clifftonkariuki on 8/5/17.
 */
public class CreateClerkElements {

    WebDriver driver;

    public CreateClerkElements(WebDriver ldriver){this.driver= ldriver;}

    public void createClerk(String clerkname, String clerkid, String clerkidnumber, String clerkemail, String
            clerkpassword){

        driver.findElement(By.name("cname")).sendKeys(clerkname);
        driver.findElement(By.name("cid")).sendKeys(clerkid);
        driver.findElement(By.name("cidno")).sendKeys(clerkidnumber);
        driver.findElement(By.name("cemail")).sendKeys(clerkemail);
        driver.findElement(By.name("cpassword")).sendKeys(clerkpassword);
        //driver.findElement(By.name("")).sendKeys(clerkhuduma);

        WebElement set_huduma= driver.findElement(By.name("huduma"));
        Select huduma= new Select(set_huduma);
        huduma.selectByVisibleText("Huduma Eastleigh");

        driver.findElement(By.name("create_clerk")).click();
    }
}
