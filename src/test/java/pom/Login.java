package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login extends LaunchQuit{
    //find elements
    @FindBy(id = "nav-link-accountList-nav-line-1")
    WebElement accountAndList;

}
