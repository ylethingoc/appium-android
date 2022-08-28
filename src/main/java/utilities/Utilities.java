package utilities;

import common.Constant;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.WebElement;

import java.util.HashMap;

import static common.Constant.DRIVER;

public class Utilities {

    public static void pressEnter() {
        DRIVER.pressKey(new KeyEvent(AndroidKey.ENTER));
    }

    public static void pressBack() {
        DRIVER.pressKey(new KeyEvent(AndroidKey.BACK));
    }

    public static WebElement scrollToView() {
        return DRIVER.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"My Website\").instance(0))"); //scroll down to the element and click
    }

    public static void click () {
        scrollToView().click();
    }

    public static boolean isDisplayed() {
        return scrollToView().isDisplayed();
    }

    public static String getURL() {
        return DRIVER.findElementById("com.android.chrome:id/url_bar").getText();
    }

    public static String getAppState() {
        // state app can be NOT_INSTALLED, NOT_RUNNING, RUNNING_IN_BACKGROUND_SUSPENDED,
        // RUNNING_IN_BACKGROUND, RUNNING_IN_FOREGROUND
        return String.valueOf(DRIVER.queryAppState(Constant.PACKAGE_NAME));
    }
}
