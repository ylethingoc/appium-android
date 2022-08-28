package driver;

import com.google.common.collect.Lists;
import common.Constant;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.android.AndroidKeyMetastate;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.aspectj.util.FileUtil;
import org.json.JSONObject;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;

public class Driver {

    public static void start() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 5 API 31");
        capabilities.setCapability(MobileCapabilityType.UDID, "emulator-5554");
        capabilities.setCapability("autoDismissAlerts", true);
        capabilities.setCapability("app", "C:\\Users\\ngocy\\Downloads\\Dictionary_v6.2.apk");
        Constant.DRIVER = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    }

    public static void quit() {
        Constant.DRIVER.quit();
    }

    public static void takeScreenshot(String imageName) throws IOException {
        File scrFile = ((TakesScreenshot) Constant.DRIVER).getScreenshotAs(OutputType.FILE);
        FileUtil.copyFile(scrFile, new File("failureScreenshot/" + imageName + ".png"));
    }

}
