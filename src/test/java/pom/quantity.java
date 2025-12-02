package pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class quantity {
    @FindBy(id = "twotabsearchtextbox")
    WebElement searchbox;
    @FindBy(xpath = "(//div[@class='a-section aok-relative s-image-fixed-height'][1]")
    WebElement Sproduct;
    @FindBy(id = "add-to-cart-button")
    WebElement addCart;
    @FindBy(xpath = "//span[@id='a-autoid-34']")
    WebElement GoTocart;
    @FindBy(xpath= "(//input[@class='a-color-link'])[1]")
    WebElement removeproduct;
    @Test(priority = 1)
   public void search(String name){
       searchbox.sendKeys(name+ Keys.ENTER);
   }
   @Test(priority = 2)
   public void product(){
       Sproduct.click();
   }
   @Test(priority = 3)
   public void add2cart(){
       addCart.click();
   }
   @Test(priority = 4)
   public void Go2cart(){
       GoTocart.click();
   }
   @Test(priority = 5)
   public void remove(){
       removeproduct.click();
   }
   public quantity(EdgeDriver driver){
       PageFactory.initElements(driver,this);
   }


}
