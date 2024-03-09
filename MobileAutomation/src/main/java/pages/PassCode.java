package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class PassCode {

    private AppiumDriver driver;

    @AndroidFindBy(accessibility = "usePasscode")
    private WebElement usePassCode;

    public PassCode(AppiumDriver driver){
        this.driver=driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }
    public void enterPassCode() {
        usePassCode.click();
        driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"setPasscodePin\"]/android.widget.EditText[1]").sendKeys("1");
        driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"setPasscodePin\"]/android.widget.EditText[2]").sendKeys("1");
        driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"setPasscodePin\"]/android.widget.EditText[3]").sendKeys("1");
        driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"setPasscodePin\"]/android.widget.EditText[4]").sendKeys("1");
        driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"setPasscodePin\"]/android.widget.EditText[5]").sendKeys("1");
        driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"setPasscodePin\"]/android.widget.EditText[6]").sendKeys("1");
        boolean confirm_passcode = driver.findElementByAccessibilityId("confirmPasscodeHeader").isDisplayed();
        Assert.assertTrue(confirm_passcode, "confirm passcode is displayed");
    }
    public void reEnterPassCode(){
        driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"confirmPasscodePin\"]/android.widget.EditText[1]").sendKeys("1");
        driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"confirmPasscodePin\"]/android.widget.EditText[2]").sendKeys("1");
        driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"confirmPasscodePin\"]/android.widget.EditText[3]").sendKeys("1");
        driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"confirmPasscodePin\"]/android.widget.EditText[4]").sendKeys("1");
        driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"confirmPasscodePin\"]/android.widget.EditText[5]").sendKeys("1");
        driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"confirmPasscodePin\"]/android.widget.EditText[6]").sendKeys("1");

//            driver.findElementByAccessibilityId("settings").click();
//            driver.findElementByAccessibilityId("logout").click();
//            driver.findElementByAccessibilityId("unlockApplication").click();
//            driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"enterPasscodePin\"]/android.widget.EditText[1]").sendKeys("1");
//            driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"enterPasscodePin\"]/android.widget.EditText[2]").sendKeys("1");
//            driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"enterPasscodePin\"]/android.widget.EditText[3]").sendKeys("1");
//            driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"enterPasscodePin\"]/android.widget.EditText[4]").sendKeys("1");
//            driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"enterPasscodePin\"]/android.widget.EditText[5]").sendKeys("1");
//            driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"enterPasscodePin\"]/android.widget.EditText[6]").sendKeys("1");

    }
}
