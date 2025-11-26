package pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReachCart {
    @FindBy(id = "add-to-cart-button")
    WebElement cart;
     @FindBy(xpath = "(//div[@class='a-section aok-relative s-image-fixed-height'][1]")
             WebElement Sproduct;
    @FindBy(id = "twotabsearchtextbox")
    WebElement searchbox;
    public void search(String PName) {
        searchbox.sendKeys(PName + Keys.ENTER);
    }

    public void selectproduct() {
        Sproduct.click();
    }

    public void addcart ()
    {
        cart.click();
    }

    public ReachCart(EdgeDriver driver) {

        PageFactory.initElements(driver, this);

    }
}
