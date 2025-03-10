package pages;

import io.appium.java_client.AppiumBy;
import utils.DriverManager;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utils.Driver_for_POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Sign_in_POM extends Driver_for_POM {


    public Sign_in_POM() {
       super();
    }

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(0)")
    private WebElement usernameField;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(1)")
    private WebElement passwordField;

    @AndroidFindBy(uiAutomator= "new UiSelector().className(\"android.widget.ImageView\").instance(1)")
    private WebElement viewPassword;

    @AndroidFindBy(accessibility= "Submit")
    private WebElement submitButton;

    @AndroidFindBy(id= "com.android.permissioncontroller:id/permission_allow_button")
    private WebElement allowButton1;

    @AndroidFindBy(accessibility= "Accept")
    private WebElement allowButton2;

    @AndroidFindBy(id= "com.android.permissioncontroller:id/permission_allow_foreground_only_button")
    private WebElement allowButton3;

    public void enterUsername(String username) {
        wait.until(ExpectedConditions.elementToBeClickable(usernameField));
        usernameField.click();
        usernameField.sendKeys(username);
    }

    public void enterPassword(String password) {
        wait.until(ExpectedConditions.elementToBeClickable(passwordField));
        passwordField.click();
        passwordField.sendKeys(password);
    }

    public void tapViewPassword(){viewPassword.click();}

    public void tapSubmitButton() {
        submitButton.click();
    }

    public void tapAllowButton1(){allowButton1.click();}

    public void tapAllowButton2(){allowButton2.click();}

    public void tapAllowButton3(){allowButton3.click();}

    public void verifyHomePage() {
        boolean isDisplayed = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(2)")).isDisplayed();
        if (!isDisplayed) {
            throw new AssertionError("Home page not displayed.");
        }
    }

}



