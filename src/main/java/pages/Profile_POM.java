package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.DriverManager;
import utils.Driver_for_POM;

import java.time.Duration;

public class Profile_POM extends Driver_for_POM {

    public Profile_POM() {
      super();
    }
    @AndroidFindBy(xpath = "(//android.widget.EditText)[2]\n")
    private WebElement phoneNumber;


    public void enterPhoneNumber(String ph)
    {
        wait.until(ExpectedConditions.elementToBeClickable(phoneNumber));
        phoneNumber.click();
        phoneNumber.sendKeys(ph);
    }
}
