package cases;

import org.testng.annotations.Test;
import pom.Login;
import pom.payment;

import java.io.IOException;

public class paymentPage extends start{
    @Test
    public void payment() throws IOException, InterruptedException {
        Login a = new Login();
        a.accountList(driver);
        Thread.sleep(3000);
        a.sign();
        Thread.sleep(3000);
        a.setEmail(email);
        Thread.sleep(3000);
        a.setPassword(password);

        payment p = new payment(driver);
        p.cart();
        Thread.sleep(3000);
        p.setProceed();
        Thread.sleep(3000);
        p.setUseAddress();
        Thread.sleep(3000);
        p.setAmazonpay();
        Thread.sleep(3000);
        p.setBajajFinserv();
        Thread.sleep(3000);
        p.credit();
        Thread.sleep(3000);
        p.Cdetails();
        Thread.sleep(3000);
        p.close();
        Thread.sleep(3000);
        p.NetBanking();
        Thread.sleep(3000);
        p.UpIapps();
        Thread.sleep(3000);
        p.EMI();
        Thread.sleep(3000);
        p.COD();
        Thread.sleep(3000);
    }
}
