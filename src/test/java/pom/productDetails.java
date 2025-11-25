package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class productDetails {
    @FindBy(id="twotabsearchtextbox")
    WebElement search;
    @FindBy(xpath = "(//div[@class='a-section aok-relative s-image-fixed-height'])[1]")
    WebElement Sproduct;
    @FindBy(xpath = "//a[@class='a-link-normal btfSubNavDesktopCustomerReviewsTab sub-nav-desktop-tab']")
    WebElement review;


}
