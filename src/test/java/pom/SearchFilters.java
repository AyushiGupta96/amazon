package pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchFilters {
    @FindBy(id="twotabsearchtextbox")
    WebElement search;
    @FindBy(id="nav-search-dropdown-card")
    WebElement drop;
    @FindBy(xpath = "(//span[@class='nav-search-submit-text nav-sprite nav-progressive-attribute'])")
    WebElement  sort;
    @FindBy(xpath = "//div[@class='a-popover-inner']")
    WebElement priceselect;
    @FindBy(xpath = "(//span[@class='a-price-whole'])")
    WebElement price;
    public void setSearch(String name){
       search.click();
       search.sendKeys(name+ Keys.ENTER);
    }



}
