package pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.security.Key;

public class AddingCart {
    @FindBy(id = "twotabsearchtextbox")
    WebElement search;
    @FindBy(id ="add-to-cart-button")
    WebElement cart;
    @FindBy(xpath = "(//div[@class='a-section aok-relative s-image-fixed-height'])[1]")
    WebElement selectP;
    public void search(String name){
    search.sendKeys(name+Keys.ENTER);
    }
    public void addCart(){
        cart.click();
    }
    public void sp(){
        selectP.click();
    }
    public AddingCart(EdgeDriver driver){
        PageFactory.initElements(driver,this);
    }
}
