package utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

/**
 * Created by clifftonkariuki on 8/3/17.
 */
public class CaptureScreenshot {

    public static void captureScreenshot(WebDriver ldriver){

        File src= ((TakesScreenshot)ldriver).getScreenshotAs(OutputType.FILE);
            try {
                FileUtils.copyFile(src, new File("/home/clifftonkariuki/Pictures/AutomationScreenshots/LFDR"+System
                        .currentTimeMillis()+".png"));
            }catch (IOException e){
                System.out.println(e.getMessage());
            }
        }
}
