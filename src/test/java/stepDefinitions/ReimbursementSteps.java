package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.Menu_POM;
import pages.Profile_POM;
import pages.Reimbursement_POM;
import pages.Sign_in_POM;

public class ReimbursementSteps

{
     WebDriver driver;
    Sign_in_POM SignIn;
    Profile_POM profile;
    Menu_POM menu;
    Reimbursement_POM reim;




    @Then("User click hamburger menu")
    public void user_click_hamburger_menu() {
        menu.tabMenuButton();

    }

    @When("User click Reimbursement menu")
    public void user_click_reimbursement_menu() {
        menu.tapReimbursements();


    }

    @Then("User should see reimbursement Page")
    public void user_should_see_reimbursement_page() {
        reim.clickSendNewRequest();

    }

//    @And("User enter {string}")
//    public void user_enter(String string) {
//        reim.clickStartDate("500");
//
//
//    }
//
//    @When("user enter {string}")
//    public void user_enter(String string) {
//
//    }

    @When("User enter send message")
    public void user_enter_send_message() {

    }

    @When("User enter file")
    public void user_enter_file() {

    }

    @Then("User click Send New Request")
    public void user_click_send_new_request() {

    }
}
