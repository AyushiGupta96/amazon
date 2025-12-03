package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class profile {
    @FindBy(xpath = "//span[@class='nav-line-2 ']")
    WebElement account;
    @FindBy(xpath = "//button[.='Manage Profiles']")
    WebElement Manage_Profiles;
    @FindBy(linkText = "//a[@href='/slc/hub?disablePicker=1&shoppingAs=1&ref=sl_ph_navpicker']")
    WebElement profileview;
    public void accountAndlist(EdgeDriver driver){
        Actions a = new Actions(driver);
        a.moveToElement(account).perform();

    }
    public void profile(){
        Manage_Profiles.click();
    }
    public void view(){
        profileview.click();
    }
    public profile(EdgeDriver driver){
        PageFactory.initElements(driver,this);
    }
}
