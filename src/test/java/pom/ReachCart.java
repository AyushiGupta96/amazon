package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ReachCart {
    @FindBy(id = "add-to-cart-button")
    WebElement cart;
     @FindBy(xpath = "(//div[@class='a-section aok-relative s-image-fixed-height'][1]")
             WebElement Sproduct;
    @FindBy(id = "twotabsearchtextbox")
    WebElement searchbox;

}
