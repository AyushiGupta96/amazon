package pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class productAddCart {
    @FindBy(id = "twotabsearchtextbox")
    WebElement search;
    @FindBy(xpath = "(//div[@class='a-section aok-relative s-image-fixed-height'][1]")
    WebElement Sproduct;
    @FindBy(xpath ="//input[@id='add-to-cart-button']")
    WebElement AddCart_button;
    public void search(String name){
        search.sendKeys(name+ Keys.ENTER);
    }
    public void selectproduct(){
        Sproduct.click();
    }
    public void cart(){
        AddCart_button.click();
    }
    public productAddCart(EdgeDriver driver){
        PageFactory.initElements(driver,this);
    }
}
