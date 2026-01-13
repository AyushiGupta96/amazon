package cases;

import org.testng.annotations.Test;
import pom.Login;
import pom.payment;

import java.io.IOException;

public class paymentPage extends start{
    @Test
    public void payment() throws IOException {
        Login a = new Login();
        a.accountList(driver);
        a.sign();
        a.setEmail(email);
        a.setPassword(password);

        payment p = new payment(driver);
        p.cart();
        p.setProceed();
        p.setUseAddress();
        p.setAmazonpay();
        p.setBajajFinserv();
        p.credit();
        p.Cdetails();
        p.close();
        p.NetBanking();
        p.UpIapps();
        p.EMI();
        p.COD();
    }
}
