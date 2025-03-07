package pages;

import org.apache.commons.exec.Watchdog;
import org.apache.commons.math3.analysis.function.Add;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.appium.java_client.pagefactory.AndroidFindBy;
import utils.Driver_for_POM;

public class Reimbursement_POM extends Driver_for_POM {
    

    public Reimbursement_POM()
    {
        super();
    }
/* =========================================================Reimbursement page Locator ==================================================== */
    @AndroidFindBy(accessibility="Send a new request")
    private WebElement sendNewRequest;
    @AndroidFindBy(uiAutomator="new UiSelector().className(\"android.view.View\").instance(7)")  
    private WebElement startDate;
    @AndroidFindBy(uiAutomator="new UiSelector().className(\"android.widget.Button\").instance(0)")
    private WebElement editButton;
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\")")
    private WebElement enterDateField;
    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"OK\")")
    private WebElement okButton;
    @AndroidFindBy(uiAutomator="new UiSelector().className(\"android.widget.EditText\").instance(0)")
    private WebElement amount;
    @AndroidFindBy(uiAutomator="new UiSelector().className(\"android.widget.EditText\").instance(1)")
    private WebElement message;
    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Add File\")")
    private WebElement addFile;

    /*=======================================================ACTION =================================================================================== */
   
    public void clickSendNewRequest() {
        wait.until(ExpectedConditions.elementToBeClickable(sendNewRequest));
        sendNewRequest.click();
    }

    public void clickStartDate()
    {
        wait.until(ExpectedConditions.elementToBeClickable(startDate));
        startDate.click();
    }

    public void clickEditCalender()
    {   wait.until(ExpectedConditions.elementToBeClickable(editButton));
        editButton.click();
    }

    public void enterDateField(String date)
    {
        enterDateField.click();
    }

    public void clickOkButton()
    {
        okButton.click();
    }

    public void enterAmount()
    {
        amount.click();
    }

    public void enterMessage()
    {
        message.click();
    }

    public void clickAddFile()
    {
        addFile.click();
    }
    

        




    
}
