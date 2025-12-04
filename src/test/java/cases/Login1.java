package cases;

import org.testng.annotations.Test;
import pom.Login;
import utility.data;


import java.io.InterruptedIOException;

import static utility.screenshot.driver;

public class Login1 extends start{
    @Test
    public void login() throws InterruptedException, IllegalArgumentException, InterruptedIOException {
        data d = new data();
        d.Data();
        Login l = new Login(driver);
        Thread.sleep(2000);
       l.accountList(driver);
       Thread.sleep(3000);
       l.sign();
       Thread.sleep(3000);
       l.setEmail();
       Thread.sleep(3000);
       l.setPassword();
    }
}
