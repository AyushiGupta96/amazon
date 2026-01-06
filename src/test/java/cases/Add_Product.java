package cases;

import pom.AddingCart;

import java.util.Iterator;
import java.util.Set;

public class Add_Product extends start{
   public void productadd(){
       AddingCart a = new AddingCart(driver);
       a.search("pen");
       a.sp();
       Set<String> ss = driver.getWindowHandles();
       Iterator<String> it = ss.iterator();
       String parent = it.next();
       String child = it.next();
       driver.switchTo().window(child);
       a.addCart();
   }
}
