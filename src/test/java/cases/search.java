package cases;

import pom.Login;
import pom.SearchProduct;
import pom.SearchProduct.*;
import utility.data;

import java.io.InterruptedIOException;

public class search extends start{
    public void searchP() throws InterruptedException,  IllegalArgumentException, InterruptedIOException {
        data d = new data();
        d.Data();
        Login l = new Login();
        Thread.sleep(3000);
        l.accountList(driver);
        Thread.sleep(3000);
        l.sign();
        Thread.sleep(3000);
        l.setEmail();
        Thread.sleep(3000);
        l.setPassword();
        Thread.sleep(3000);

        SearchProduct s = new SearchProduct();
        Thread.sleep(3000);
        s.search("book");

    }



}
