package cases;

import org.openqa.selenium.edge.EdgeDriver;
import pom.ReachCart;

import java.util.Iterator;
import java.util.Set;

public class Reaching extends start{
    public void reach() {
        ReachCart r = new ReachCart(driver);
        r.search("pen");
        r.selectproduct();
        Set<String> st = driver.getWindowHandles();
        Iterator<String> ii = st.iterator();
        String parent = ii.next();
        String child = ii.next();
        driver.switchTo().window(child);
        r.addcart();
    }
}
