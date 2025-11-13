package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class LaunchQuit {
    private WebDriver driver;
    private final String AUT_URL= "  ";
    @BeforeMethod
    public void Launch(){
        driver = new EdgeDriver();
        driver.get(AUT_URL);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();

    }
    @AfterMethod
    public void quit(){
        driver.quit();
    }


}
