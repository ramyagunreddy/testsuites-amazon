package com.github.amazon.suites.pages;

import com.github.amazon.suites.utils.Log;
import com.github.amazon.suites.utils.TimeUtils;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class ItemViewPage {
    private AndroidDriver<AndroidElement> driver;

    public ItemViewPage() {
    }

    public ItemViewPage(AndroidDriver<AndroidElement> driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "com.amazon.mShop.android.shopping:id/chrome_action_bar_back_icon_image")
    private MobileElement btnBackToResults;

    private final String addToCartText = "Add to Cart";

    public void addToCart() {
        Log.debug("Waiting to scroll and click the '" + addToCartText + "' button");
        TimeUtils.makeWait(7000);
        driver.findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true))" +
                        ".scrollIntoView(new UiSelector().text(\"" + addToCartText + "\"))")).click();
        Log.debug("Just clicked the '" + addToCartText + "' button");
        TimeUtils.makeWait(2000);
    }

    public void clickBackButton() {
        TimeUtils.makeWait(2000);
        btnBackToResults.click();
        Log.debug("Just clicked the 'back' button");
    }


}
