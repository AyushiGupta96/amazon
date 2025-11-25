package pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class productDetails {
    @FindBy(id="twotabsearchtextbox")
    WebElement search;
    @FindBy(xpath = "(//div[@class='a-section aok-relative s-image-fixed-height'])[1]")
    WebElement Sproduct;
    @FindBy(xpath = "//a[@class='a-link-normal btfSubNavDesktopCustomerReviewsTab sub-nav-desktop-tab']")
    WebElement review;
    public  void search(String name){
        search.sendKeys(name+ Keys.ENTER);
    }
    public void select(){
        Sproduct.click();
    }
    public void GetReview(){
        review.click();
    }
    public productDetails(EdgeDriver driver){
        PageFactory.initElements(driver,this);
    }

}
