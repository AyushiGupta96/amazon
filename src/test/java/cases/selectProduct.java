package cases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pom.AddingCart;
import pom.SearchProduct;
import pom.Select_product;
import pom.Select_product.*;
import pom.SearchProduct.*;

import java.util.Iterator;
import java.util.Set;

public class selectProduct extends start {
public void selectproduct()throws InterruptedException{
    SearchProduct p1 = new SearchProduct();
    p1.search("books");
    Select_product s1 = new Select_product(driver);
    s1.selected();
    Set<String> st = driver.getWindowHandles();
    Iterator<String> I1 = st.iterator();
    String main = I1.next();
    String child = I1.next();
    driver.switchTo().window(child);
    WebElement sel = driver.findElement(By.id("native_dropdown_selected_size_name"));
    Select se = new Select(sel);

    se.selectByIndex(3);
    Thread.sleep(3000);
    WebElement qy = driver.findElement(By.id("quantity"));
    Select qu1 = new Select(qy);
    qu1.selectByIndex(3);
    Thread.sleep(3000);
    AddingCart ac = new AddingCart(driver);
    ac.addCart();

}
}
