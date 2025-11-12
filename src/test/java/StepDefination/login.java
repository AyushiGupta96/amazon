package StepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login {

    @Given(" I am on the amazon page")
    public void i_am_on_the_amazon_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }



    @When(" user enters <email> and <password>")
    public void user_enters_email_and_password(String email , String password) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }










    //Step undefined
   // You can implement missing steps with the snippets below:
    @When("user enters <email> and <password>")
    public void user_enters_email_and_password() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


    //Step undefined
    //You can implement missing steps with the snippets below:
    @When("click on login button")
    public void click_on_login_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


    //Step undefined
   // You can implement missing steps with the snippets below:
    @Then(" user should be logged into amazon account")
    public void user_should_be_logged_into_amazon_account() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
