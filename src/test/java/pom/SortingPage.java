package pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SortingPage {
    @FindBy(id="twotabsearchtextbox")
    WebElement search;
    @FindBy(id = "searchDropdownBox")
    WebElement search01;

    @FindBy(id = "searchDropdownBox")
    WebElement dropdown;

    @FindBy(xpath = "//span[@class='a-button-text a-declarative']")
    WebElement sort;

    @FindBy(xpath = "//select[@name='s']")
    WebElement priceselect;

    public void SearchFilter(){
        search.click();
        search.sendKeys("pen"+ Keys.ENTER);
    }
    public void SearchFilter1(String pen) throws InterruptedException {
        Select s = new Select(dropdown);
        Thread.sleep(5000);
        s.selectByVisibleText(pen);
    }
    public void sort(EdgeDriver driver){
        sort.click();
    }
    public void priceHigh() throws InterruptedException {
        Select s = new Select(priceselect);
        Thread.sleep(5000);
        s.selectByVisibleText("Price: High to Low");
    }
    public void priceLow() throws InterruptedException {
        Select s = new Select(priceselect);
        Thread.sleep(5000);
        s.selectByVisibleText("Price: Low to High");
    }
    public void customerReview() throws InterruptedException {
        Select s = new Select(priceselect);
        Thread.sleep(5000);
        s.selectByVisibleText("Avg. Customer Review");
    }
    public void newArrival() throws InterruptedException {
        Select s = new Select(priceselect);
        Thread.sleep(5000);
        s.selectByVisibleText("Newest Arrivals");
    }
    public void bestSeller() throws InterruptedException {
        Select s = new Select(priceselect);
        Thread.sleep(5000);
        s.selectByVisibleText("Newest Arrivals");
    }
    public void SortingPage(EdgeDriver driver){
        PageFactory.initElements(driver,this);
    }
}
