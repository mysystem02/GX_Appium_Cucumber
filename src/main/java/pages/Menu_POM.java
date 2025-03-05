package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utils.DriverManager;
import utils.Driver_for_POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Menu_POM extends Driver_for_POM {

    public Menu_POM() {
     super();
    }

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(2)")
    private WebElement menuButton;

    @AndroidFindBy(accessibility= "Driver Dispatch Form")
    private WebElement dispatchForm;

    @AndroidFindBy(accessibility= "Dispatch Schedules")
    private WebElement dispatchSchedules;

    @AndroidFindBy(accessibility= "Time Card")
    private WebElement timeCard;

    @AndroidFindBy(accessibility= "Request Time Off")
    private WebElement requestTimeOff;

    @AndroidFindBy(accessibility= "Reimbursements")
    private WebElement reimbursements;

    @AndroidFindBy(accessibility= "Profile")
    private WebElement profile;

    @AndroidFindBy(accessibility= "Driver History")
    private WebElement driverHistory;

    @AndroidFindBy(accessibility= "Change Password")
    private WebElement changePassword;

    @AndroidFindBy(accessibility= "Terms & Conditions")
    private WebElement termsConditions;

    @AndroidFindBy(accessibility= "Privacy Policy")
    private WebElement privacyPolicy;

    @AndroidFindBy(accessibility= "Frequently Asked Questions")
    private WebElement frequentlyAskedQuestions ;

    @AndroidFindBy(accessibility= "Logout")
    private WebElement logout;

    @AndroidFindBy(xpath= "//android.widget.ImageView")
    private WebElement back;


    public void tabMenuButton() {
        wait.until(ExpectedConditions.elementToBeClickable(menuButton));
        menuButton.click();
    }

    public void tapDispatchForm() {
        wait.until(ExpectedConditions.elementToBeClickable(dispatchForm));
        dispatchForm.click();

    }

    public void tapDispatchSchedules(){
        wait.until(ExpectedConditions.elementToBeClickable(dispatchSchedules));
        dispatchSchedules.click();}

    public void tapTimeCard() {
        wait.until(ExpectedConditions.elementToBeClickable(timeCard));
        timeCard.click();
    }

    public void tapRequestTimeOff(){
        wait.until(ExpectedConditions.elementToBeClickable(requestTimeOff));
        requestTimeOff.click();}

    public void tapReimbursements(){
        wait.until(ExpectedConditions.elementToBeClickable(reimbursements));
        reimbursements.click();}

    public void tapProfile(){
        wait.until(ExpectedConditions.elementToBeClickable(profile));
        profile.click();}

    public void tapDriverHistory(){
        wait.until(ExpectedConditions.elementToBeClickable(driverHistory));
        driverHistory.click();}

    public void tapChangePassword(){
        wait.until(ExpectedConditions.elementToBeClickable(changePassword));
        changePassword.click();}

    public void tapTermsConditions(){
        wait.until(ExpectedConditions.elementToBeClickable(termsConditions));
        termsConditions.click();}

    public void tapPrivacyPolicy(){
        wait.until(ExpectedConditions.elementToBeClickable(privacyPolicy));
        privacyPolicy.click();}

    public void tapFrequentlyAskedQuestions(){
        wait.until(ExpectedConditions.elementToBeClickable(frequentlyAskedQuestions));
        frequentlyAskedQuestions.click();}

    public void tapLogout(){
        wait.until(ExpectedConditions.elementToBeClickable(logout));
        logout.click();}

    public void tapBack(){
        wait.until(ExpectedConditions.elementToBeClickable(back));
        back.click();}
}

