package pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.io.InterruptedIOException;

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
    public void SearchFilter() throws InterruptedIOException, InterruptedException {
        Select s = new Select(drop);
        Thread.sleep(30);
        s.selectByVisibleText("pen");


    }
    public WebElement sort(){
     return sort;
    }
    public WebElement price(){
        return price;
    }
    public SearchFilters(ChromeDriver driver){
        PageFactory.initElements(driver,this);
    }
}
