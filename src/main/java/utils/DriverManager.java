package utils;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.options.BaseOptions;

public class DriverManager implements Constant {

    public static AppiumDriver drivers;

    public static void initializeDriver(String platform) {
        var options = new BaseOptions<>()
                .amend("platformName", platformName_value)
                // .amend("appium:platformVersion", platformVersion_value)
                .amend("appium:deviceName", deviceName_value)
//                .amend("appium:app", app_value )
                .amend("appPackage","app.groundmetrx.com")
                .amend("appActivity", "app.groundmetrx.com.MainActivity")
                .amend("appium:automationName", automationName_value)
                .amend("appium:ensureWebviewsHavePages", true)
                .amend("appium:nativeWebScreenshot", true)
                .amend("appium:newCommandTimeout", 3600)
                .amend("noReset", true) //for session
                .amend("appium:connectHardwareKeyboard", true);


        drivers = new AndroidDriver(getUrl(), options);
        drivers.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    private static URL getUrl() {
        try {
            return new URL(Appium_URL);
        } catch (MalformedURLException e) {
            throw new RuntimeException("Invalid URL for Appium Server", e);
        }
    }

    public static AppiumDriver getDriver() {
        return drivers;
    }

}
