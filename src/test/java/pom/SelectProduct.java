package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectProduct {
    @FindBy(id=" ")
    WebElement select;
    public void select( ){
        select.click();
    }
   public SelectProduct(ChromeDriver driver){
       PageFactory.initElements(driver,this);
   }
}
