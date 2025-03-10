package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.Menu_POM;
import pages.Profile_POM;
import pages.Reimbursement_POM;
import pages.Sign_in_POM;
import utils.DriverManager;

public class ReimbursementSteps

{

    Menu_POM menu;
    Reimbursement_POM reim;
    WebDriver driver;


    @Given("User launches the app on {string}")
    public void user_launches_the_app(String platform) {
        DriverManager.initializeDriver();
        this.driver = DriverManager.getDriver();
        Sign_in_POM SignIn = new Sign_in_POM();
        SignIn.enterUsername("arifraza");
        SignIn.enterPassword("1234567");
        SignIn.tapViewPassword();
        SignIn.tapSubmitButton();
        SignIn.tapAllowButton2();
        SignIn.tapAllowButton3();
        SignIn.tapAllowButton1();
    }
    @Then("User click hamburger menu")
    public void user_click_hamburger_menu() {
        menu=new Menu_POM();
        menu.tabMenuButton();
    }

    @When("User click Reimbursement menu")
    public void user_click_reimbursement_menu() {
        menu.tapReimbursements();
    }

    @Then("User should see reimbursement Page")
    public void user_should_see_reimbursement_page() {
        reim=new Reimbursement_POM();
        reim.clickSendNewRequest();
    }

//    @And("User enter {string}")
//    public void user_enter(String string) {
//        reim.clickStartDate("500");
//    }

//    @When("user enter {string}")
//    public void user_enter(String string) {
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
