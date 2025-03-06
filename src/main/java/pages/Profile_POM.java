package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.DriverManager;

import java.time.Duration;

public class Profile_POM {

    private AppiumDriver driver;
    private WebDriverWait wait;

    public Profile_POM() {
        this.driver = DriverManager.getDriver();
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
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
