package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class checkout {
    @FindBy(id = "//span[@id='nav-cart-count']")
    WebElement cart;
    @FindBy(id="//span[@id='sc-buy-box-ptc-button']")
    WebElement proceed;
    @FindBy(xpath = "(//input[@name='submissionURL'])[2]")
    WebElement Address;

    @FindBy(xpath = "(//input[@data-testid='Address_selectShipToThisAddress'])")
    WebElement DAddress;

    @FindBy(xpath = "(//input[@name='ppw-instrumentRowSelection'])[8]")
    WebElement PaymentMood;

    @FindBy(xpath = "(//input[@id='placeOrder'])[1]")
    WebElement place_order;
    @Test(priority = 1)
    public void cart(){
        cart.click();
    }
    @Test(priority = 2)
    public void proceed2cart(){
        proceed.click();
    }
    @Test(priority = 3)
    public void address(){
        Address.click();
    }
    @Test(priority = 4)
    public void DeliveryAddress(){
        DAddress.click();
    }
    @Test(priority = 5)
    public void select_payment(){
        PaymentMood.click();
    }
    @Test(priority = 6)
    public void setPlace_order(){
        place_order.click();
    }
    public checkout(EdgeDriver driver){
        PageFactory.initElements(driver,this);
    }

}
