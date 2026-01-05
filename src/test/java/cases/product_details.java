package cases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import pom.productDetails;
import pom.productDetails.*;

import java.util.Iterator;
import java.util.Set;

public class product_details extends start{
@Test
    public void details (){
    productDetails  pd = new productDetails(driver);
    pd.search("aa");
    pd.select();
    Set<String>  window = driver.getWindowHandles();
    Iterator<String>I1 = window.iterator();
    String parent = I1.next();
    String child = I1.next();
    driver.switchTo().window(child);
    WebElement priceses = driver.findElement(
            By.xpath("//span[@class='a-price aok-align-center reinventPricePriceToPayMargin priceToPay']"));
    System.out.println("price tag is displayed" +priceses.isDisplayed());
    System.out.println(priceses.getText());
    WebElement review = driver.findElement(By.xpath("//div[@id='detailBulletsWrapper_feature_div']"));
    System.out.println("review "+ review.isDisplayed());
    System.out.println(review.getText());
    pd.GetReview();
    WebElement qua = driver.findElement(By.xpath("//select[@name='quantity']"));
    Select se = new Select(qua);
    se.selectByIndex(1);
    }
}
