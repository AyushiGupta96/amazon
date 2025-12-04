package pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchProduct {
    @FindBy(id ="twotabsearchtextbox")
    WebElement search;
    public void search(String name){
        search.sendKeys(name+ Keys.ENTER);
    }
    public void SearchProduct1(ChromeDriver driver){
        PageFactory.initElements(driver,this);
    }
}
