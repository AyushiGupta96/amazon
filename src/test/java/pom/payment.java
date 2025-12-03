package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class payment {
    @FindBy(xpath = "//span[@id='nav-cart-count']")
    WebElement Cart;

    @FindBy(xpath = "//input[@name='proceedToRetailCheckout']")
    WebElement proceed;

    @FindBy(xpath = "(//input[@data-testid='Address_selectShipToThisAddress'])")
    WebElement useAddress;

    @FindBy(xpath = "(//input[@name='ppw-instrumentRowSelection'])[1]")
    WebElement amazonpay;

    @FindBy(xpath = "(//input[@name='ppw-instrumentRowSelection'])[3]")
    WebElement BajajFinserv;

    @FindBy(xpath = "(//input[@name='ppw-instrumentRowSelection'])[4]")
    WebElement CCredit;

    @FindBy(xpath = "(//a[@class='a-link-emphasis pmts-add-cc-default-trigger-link'])[1]")
    WebElement CDetails;

    @FindBy(xpath = "//button[@class=' a-button-close a-declarative']")
    WebElement Close;

    @FindBy(xpath = "(//input[@name='ppw-instrumentRowSelection'])[5]")
    WebElement NetBanking;

    @FindBy(xpath = "(//input[@name='ppw-instrumentRowSelection'])[6]")
    WebElement UpIapps;

    @FindBy(xpath = "(//input[@name='ppw-instrumentRowSelection'])[7]")
    WebElement EMI;

    @FindBy(xpath = "(//input[@name='ppw-instrumentRowSelection'])[8]")
    WebElement COD;

    public void cart(){
        Cart.click();
    }
    public void setProceed(){
        proceed.click();
    }
    public void setUseAddress(){
        useAddress.click();
    }
    public void setAmazonpay(){
        amazonpay.click();
    }
    public void setBajajFinserv(){
        BajajFinserv.click();
    }
   public void credit(){
       CCredit.click();
   }
   public void Cdetails(){
       CDetails.click();
   }
  public void close(){
      Close.click();
  }
  public void NetBanking(){
      NetBanking.click();
  }
  public void UpIapps(){
      UpIapps.click();
  }
  public void EMI(){
      EMI.click();
  }
  public void COD(){
      COD.click();
  }
  public payment(EdgeDriver driver){
      PageFactory.initElements(driver,this);
  }
}
