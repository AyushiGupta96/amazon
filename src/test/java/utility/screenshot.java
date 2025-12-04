package utility;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import java.io.File;
import java.io.IOException;

public class screenshot implements ITestListener {
    public static EdgeDriver driver;
    public void pass(ITestResult result){
        Reporter.log("pass");
        TakesScreenshot s = (TakesScreenshot) driver;
        File source = s.getScreenshotAs(OutputType.FILE);
        File destination = new File("E:\\intellij_install\\project\\amazon"+".png");
       try {


          FileUtils.copyFile(source, destination);
       }
       catch (IOException e){
e.printStackTrace();
       }

    }
    public void Fail(ITestResult result) {
        // TODO Auto-generated method stub


        Reporter.log("Fail");

        TakesScreenshot s1 = (TakesScreenshot) driver;
        File source = s1.getScreenshotAs(OutputType.FILE);
        File destination = new File(
                "E:\\intellij_install\\project\\amazon" + ".png");
        try {
            FileHandler.copy(source, destination);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
