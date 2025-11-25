package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_product {
    @FindBy(xpath = "")
    WebElement select;
    public void selected(){
        select.click();
    }
    public Select_product(EdgeDriver driver){
        PageFactory.initElements(driver,this);
    }
}
