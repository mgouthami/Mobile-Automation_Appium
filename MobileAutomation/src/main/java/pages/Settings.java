package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class Settings {

    private AppiumDriver driver;

    @AndroidFindBy(accessibility = "logout")
    private WebElement logoutButton;


    public Settings(AppiumDriver driver){
        this.driver=driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }
    public void clickLogout() {
        logoutButton.click();
    }

}
