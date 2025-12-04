package cases;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utility.screenshot;

import java.time.Duration;


public class start extends screenshot {
    @BeforeMethod
    public void get(){
        WebDriver driver = new EdgeDriver();
        driver.get("");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().maximize();

    }
    @AfterMethod
    public void close() throws IllegalArgumentException{
        driver.close();
    }
}
