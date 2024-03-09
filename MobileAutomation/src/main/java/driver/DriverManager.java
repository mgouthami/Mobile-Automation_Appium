package driver;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;
import java.util.concurrent.TimeUnit;

public class DriverManager {
    private static AppiumDriver<MobileElement> driver =null;
    public static AppiumDriver<MobileElement> getDriver() throws Exception{
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", "Google sdk_gphone_x86_64");
        capabilities.setCapability("appPackage", "io.mosip.residentapp"); // Replace with your app's package name
        capabilities.setCapability("appActivity", "io.mosip.residentapp.MainActivity"); // Replace with your app's main activity
        capabilities.setCapability("automationName", "UiAutomator2"); // Replace with your

        // Initialize the AndroidDriver with the Appium server URL and capabilities
        driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723"), capabilities);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;

    }
    public static void quitDriver(){
        driver.quit();
    }
}
