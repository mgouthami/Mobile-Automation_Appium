package androidTest;

import driver.DriverManager;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    AppiumDriver<MobileElement> driver =null;
    @BeforeMethod
    public void beforeMethod() throws Exception{
        driver=DriverManager.getDriver();


    }
    @AfterMethod
    public void afterMethod(){
        DriverManager.quitDriver();
    }
}
