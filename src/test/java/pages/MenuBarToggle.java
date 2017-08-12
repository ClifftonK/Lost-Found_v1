package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by clifftonkariuki on 8/3/17.
 */
public class MenuBarToggle {

   static WebDriver driver;

    public MenuBarToggle(WebDriver ldriver){this.driver= ldriver;}

    public static WebDriver clickNidCardLink(){
        driver.findElement(By.xpath("//a[contains(@href, 'nid.php')]")).click(); //this is ID Card xpath on home.php

        return driver;
    }

    public static WebDriver clickNhifLink(){
        driver.findElement(By.xpath("//a[contains(@href, 'nhif.php')]")).click(); //this is NHIF Card xpath on nid.php

        return driver;
    }

    public void clickNssfLink(){
        driver.findElement(By.xpath("//a[contains(@href, 'nssf.php')]")).click(); //this is NSSF Card xpath on nhif.php

    }

    public void clickDlLink(){
        driver.findElement(By.xpath("//a[contains(@href, 'dl.php')]")).click(); //this is Driving License xpath on nssf.php

    }

    public void goBackHomeFromDl(){
        driver.findElement(By.linkText("Go Back Home")).click(); //this is link text to go back home from dl.php
    }

}
