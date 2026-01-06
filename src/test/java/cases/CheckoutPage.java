package cases;

import pom.Login;
import pom.checkout;

public class CheckoutPage extends start{
public void check(){


    checkout c = new checkout(driver);
    c.cart();
    c.proceed2cart();
    c.address();
    c.DeliveryAddress();
    c.select_payment();
    c.setPlace_order();

}
}
