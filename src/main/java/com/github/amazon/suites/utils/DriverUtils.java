package com.github.amazon.suites.utils;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class DriverUtils {
    public static AndroidDriver<AndroidElement> getDriver() throws MalformedURLException {

        File appDir = new File("src");
        File app = new File(appDir, "amazon-shopping-24-7-0-100.apk");
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel_4_API_30");
        cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");

        return new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);

    }
}
