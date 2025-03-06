package stepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import pages.Sign_in_POM;
import utils.DriverManager;
import utils.ImageComparison;

public class SignInSteps {
    WebDriver driver;
    Sign_in_POM SignIn;

    @Given("User launches the app on {string}")
    public void user_launches_the_app(String platform) {
        DriverManager.initializeDriver(platform);
        this.driver = DriverManager.getDriver();
        SignIn = new Sign_in_POM();
    }

    @When("User enters {string} and {string}")
    public void user_enters_credentials(String username, String password) {
        SignIn.enterUsername(username);
        SignIn.enterPassword(password);
        SignIn.tapViewPassword();
        SignIn.tapSubmitButton();
    }

    @Then("User should see the homepage")
    public void user_should_see_the_homepage() {
        SignIn.verifyHomePage();
    }

//    @Then("The UI should match the design with no visual differences")
//    public void validateVisualDifferences() {
//        ImageComparison.compareAndHighlightDifferences("screenshots/reference.png", "screenshots/test.png", "screenshots/differences.png");
//    }

    @Given("The app is launched on {string}")
    public void the_app_is_launched(String platform) {
        DriverManager.initializeDriver(platform);
        this.driver = DriverManager.getDriver();
        SignIn = new Sign_in_POM();
    }

    @When("I enter username {string} and password {string}")
    public void i_enter_username_and_password(String username, String password) {
        SignIn.enterUsername(username);
        SignIn.enterPassword(password);
        SignIn.tapViewPassword();

    }

    @When("I click the login button")
    public void i_click_the_login_button() {
        SignIn.tapSubmitButton();
    }

    @Then("I should see the home screen")
    public void i_should_see_the_home_screen() {
        SignIn.verifyHomePage();
    }

}
