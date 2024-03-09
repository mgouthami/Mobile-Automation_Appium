package androidTest;

import org.testng.annotations.Test;
import pages.*;

public class AppiumTest extends BaseTest {

    @Test
    public void firstTest() throws Exception {

        SelectPreferences selectPreferences = new SelectPreferences(driver);
        selectPreferences.isSavePreferenceDisplayed();
        selectPreferences.clickOnSavePreferences();
        Skip skip = new Skip(driver);
        skip.clickOnSkip();
        PassCode passCode = new PassCode(driver);
        passCode.enterPassCode();
        passCode.reEnterPassCode();
        HomePage homepage=new HomePage(driver);
        homepage.clickOnOk();
        homepage.clickOnSettings();
        Settings settings=new Settings(driver);
        settings.clickLogout();

    }





         //Thread.sleep(5000);
         // Set an implicit wait time to handle synchronization issues
         // Your test steps go here
         // Example: Click a button
//         MobileElement button = driver.findElementByAccessibilityId("savePreference");
//         button.click();
//         MobileElement skip_button=driver.findElementByAccessibilityId("skipButton-one");
//         skip_button.click();
//         MobileElement Use_PassCode=driver.findElementByAccessibilityId("usePasscode");
//         Use_PassCode.click();
//         driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"setPasscodePin\"]/android.widget.EditText[1]").sendKeys("1");
//         driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"setPasscodePin\"]/android.widget.EditText[2]").sendKeys("1");
//         driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"setPasscodePin\"]/android.widget.EditText[3]").sendKeys("1");
//         driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"setPasscodePin\"]/android.widget.EditText[4]").sendKeys("1");
//         driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"setPasscodePin\"]/android.widget.EditText[5]").sendKeys("1");
//         driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"setPasscodePin\"]/android.widget.EditText[6]").sendKeys("1");
//         boolean confirm_passcode=driver.findElementByAccessibilityId("confirmPasscodeHeader").isDisplayed();
//         Assert.assertTrue(confirm_passcode,"confirm passcode is displayed");
//         driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"confirmPasscodePin\"]/android.widget.EditText[1]").sendKeys("1");
//         driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"confirmPasscodePin\"]/android.widget.EditText[2]").sendKeys("1");
//         driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"confirmPasscodePin\"]/android.widget.EditText[3]").sendKeys("1");
//         driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"confirmPasscodePin\"]/android.widget.EditText[4]").sendKeys("1");
//         driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"confirmPasscodePin\"]/android.widget.EditText[5]").sendKeys("1");
//         driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"confirmPasscodePin\"]/android.widget.EditText[6]").sendKeys("1");
//         driver.findElementByAccessibilityId("ok").click();
//         driver.findElementByAccessibilityId("settings").click();
//         driver.findElementByXPath("//android.widget.TextView[@content-desc=\"languageTitle\"]").click();
//
//     }



        //Thread.sleep(5000);
        // Set an implicit wait time to handle synchronization issues
        // Your test steps go here
        // Example: Click a button

//        MobileElement Use_PassCode=driver.findElementByAccessibilityId("usePasscode");
//        Use_PassCode.click();
//        driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"setPasscodePin\"]/android.widget.EditText[1]").sendKeys("1");
//        driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"setPasscodePin\"]/android.widget.EditText[2]").sendKeys("1");
//        driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"setPasscodePin\"]/android.widget.EditText[3]").sendKeys("1");
//        driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"setPasscodePin\"]/android.widget.EditText[4]").sendKeys("1");
//        driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"setPasscodePin\"]/android.widget.EditText[5]").sendKeys("1");
//        driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"setPasscodePin\"]/android.widget.EditText[6]").sendKeys("1");
//        boolean confirm_passcode=driver.findElementByAccessibilityId("confirmPasscodeHeader").isDisplayed();
//        Assert.assertTrue(confirm_passcode,"confirm passcode is displayed");
//        driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"confirmPasscodePin\"]/android.widget.EditText[1]").sendKeys("1");
//        driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"confirmPasscodePin\"]/android.widget.EditText[2]").sendKeys("1");
//        driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"confirmPasscodePin\"]/android.widget.EditText[3]").sendKeys("1");
//        driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"confirmPasscodePin\"]/android.widget.EditText[4]").sendKeys("1");
//        driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"confirmPasscodePin\"]/android.widget.EditText[5]").sendKeys("1");
//        driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"confirmPasscodePin\"]/android.widget.EditText[6]").sendKeys("1");
//        driver.findElementByAccessibilityId("ok").click();
//        driver.findElementByAccessibilityId("settings").click();
//        driver.findElementByAccessibilityId("logout").click();
//        driver.findElementByAccessibilityId("unlockApplication").click();
//        driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"enterPasscodePin\"]/android.widget.EditText[1]").sendKeys("1");
//        driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"enterPasscodePin\"]/android.widget.EditText[2]").sendKeys("1");
//        driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"enterPasscodePin\"]/android.widget.EditText[3]").sendKeys("1");
//        driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"enterPasscodePin\"]/android.widget.EditText[4]").sendKeys("1");
//        driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"enterPasscodePin\"]/android.widget.EditText[5]").sendKeys("1");
//        driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"enterPasscodePin\"]/android.widget.EditText[6]").sendKeys("1");
//        boolean Home_Page=driver.findElementByAccessibilityId("bringYourDigitalID").isDisplayed();
//        driver.findElementByAccessibilityId("settings").click();
//        driver.findElementByAccessibilityId("logout").click();



        // Close the app
       // driver.closeApp();

    }



