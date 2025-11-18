package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class LaunchQuit {
    private WebDriver driver;
    private final String AUT_URL= " https://www.amazon.com/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2Fgp%2Fnavigation-country%2Fselect-country%2F%3Fie%3DUTF8%26ref_%3Dnavm_hdr_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=anywhere_v2_us&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0 ";
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
