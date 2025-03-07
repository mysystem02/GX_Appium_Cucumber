package pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import utils.Driver_for_POM;
import utils.Excel_reader;
import org.openqa.selenium.WebElement;

public class Re_statusPOM extends Driver_for_POM {
    String re_status_check = Excel_reader.getLocation("from_location");

    public Re_statusPOM() {
        super();
    }

    @AndroidFindBy(accessibility = "Re-Status")
    private WebElement re_StatusButton;

    @AndroidFindBy(className= "android.widget.EditText")
    private WebElement locationField;

    @AndroidFindBy(accessibility= "Submit  ")
    private WebElement submit;

    public void tabRe_StatusButton() {
        re_StatusButton.click();
    }

    public void enterLocation(String location) {
        locationField.sendKeys(location);
    }

    public void tapLocation(){
        WebElement selectLocation =driver.findElement(AppiumBy.accessibilityId(re_status_check));
        selectLocation.click();}

    public void tapSubmit(){submit.click();}
}

