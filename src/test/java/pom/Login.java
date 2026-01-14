package pom;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import Data.data;

import static Data.data.password;
import static Data.data.user_name;

@Test
public class Login extends LaunchQuit{
    //find elements
    @FindBy(id = "nav-link-accountList-nav-line-1")
    WebElement accountAndList;
    @FindBy(xpath = "(//span[@class='nav-action-inner'])[1]")
    WebElement signinButton;
    @FindBy(className = "a-input-text")
    WebElement Email;
    @FindBy(id = "ap_password")
    WebElement pass;
    @FindBy(xpath = "//span[@.=Sign in")
    WebElement submitbutton;
    //create methods
    public void accountList(EdgeDriver driver){
        Actions a1 = new Actions(driver) ;
        a1.moveToElement(accountAndList).perform();

    }
    public void sign(){
        signinButton.click();
    }
    public void setEmail(){
        Email.sendKeys(user_name+ Keys.ENTER);

    }
    public void setPassword(){
        pass.sendKeys(password + Keys.ENTER);
    }
    public void Login(EdgeDriver driver){
        PageFactory.initElements(driver,this);
    }
}
