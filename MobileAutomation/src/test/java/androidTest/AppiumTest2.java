package androidTest;

import io.appium.java_client.MobileElement;
import org.testng.annotations.Test;

public class AppiumTest2 extends BaseTest {

       @Test
    public void dummyTest(){
        MobileElement button = driver.findElementByAccessibilityId("savePreference");
        button.click();
        MobileElement skip_button=driver.findElementByAccessibilityId("skipButton-one");
        skip_button.click();
        MobileElement Use_PassCode=driver.findElementByAccessibilityId("usePasscode");
        Use_PassCode.click();
        driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"setPasscodePin\"]/android.widget.EditText[1]").sendKeys("1");
        driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"setPasscodePin\"]/android.widget.EditText[2]").sendKeys("1");

    }

}
