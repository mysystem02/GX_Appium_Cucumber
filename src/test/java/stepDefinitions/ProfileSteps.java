package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import pages.Menu_POM;
import pages.Profile_POM;
import pages.Sign_in_POM;
import utils.DriverManager;
import utils.Swipe;

public class ProfileSteps {
    WebDriver driver;
    Sign_in_POM SignIn;
    Profile_POM profile;
    Menu_POM menu;


//    @Given("User launches the app on {string}")
//    public void user_launches_the_app(String platform) {
//        DriverManager.initializeDriver(platform);
//        this.driver = DriverManager.getDriver();
//        SignIn = new Sign_in_POM();
//    }
//
//    @When("User enters {string} and {string}")
//    public void user_enters_credentials(String username, String password) {
//        SignIn.enterUsername(username);
//        SignIn.enterPassword(password);
//        SignIn.tapViewPassword();
//        SignIn.tapSubmitButton();
//    }
//
//    @Then("User should see the homepage")
//    public void user_should_see_the_homepage() {
//        SignIn.verifyHomePage();
//        menu.tabMenuButton();
//        menu.tapProfile();
//    }
    @And("User change {string}")
    public void user_change_phone_number(String ph)
    {
        menu.tabMenuButton();
        menu.tapProfile();
        Swipe.swipeAction(new Point(371, 1318), new Point(286, 333));
        profile.enterPhoneNumber(ph);
    }

}

