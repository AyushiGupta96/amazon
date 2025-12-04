package cases;

import org.testng.annotations.Test;
import pom.Login;


import static utility.screenshot.driver;

public class Login1 extends start{
    @Test
    public void login() throws InterruptedException,IllegalArgumentException{
        Login l = new Login(driver);
        Thread.sleep(2000);
       l.accountList(driver);
       Thread.sleep(3000);
       l.sign(driver);
       Thread.sleep(3000);
       l.setEmail(driver);
       Thread.sleep(3000);
       l.setPassword(driver);
    }
}
