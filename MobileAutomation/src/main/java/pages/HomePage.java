package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    private AppiumDriver driver;

    @AndroidFindBy(accessibility = "settings")
    private WebElement settingButton;

    @AndroidFindBy(accessibility = "ok")
    private WebElement okButton;

    public HomePage(AppiumDriver driver){
        this.driver=driver;
        //It will initialize all the webelements using FindBy in the HomePage
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }
    public void clickOnSettings(){
        settingButton.click();
    }
    public void clickOnOk(){
        okButton.click();
    }
}
