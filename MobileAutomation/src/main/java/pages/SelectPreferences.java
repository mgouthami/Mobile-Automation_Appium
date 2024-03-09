package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class SelectPreferences {
    private AppiumDriver driver;

    @AndroidFindBy(accessibility = "savePreference")
    private WebElement savePreference;

        public SelectPreferences(AppiumDriver driver){
        this.driver=driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }
    public boolean isSavePreferenceDisplayed(){
        return savePreference.isDisplayed();
    }
    public void clickOnSavePreferences(){
        savePreference.click();
    }
}
