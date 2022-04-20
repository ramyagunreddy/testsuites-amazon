package com.github.amazon.suites.pages;

import com.github.amazon.suites.utils.Log;
import com.github.amazon.suites.utils.TimeUtils;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindAll;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SearchResultsPage {


    private AndroidDriver<AndroidElement> driver;

    public SearchResultsPage() {
    }

    public SearchResultsPage(AndroidDriver<AndroidElement> driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }


    @AndroidFindAll({@AndroidBy(id = "android.view.View")})
    private List<MobileElement> lstItems;

    public void clickProduct(String productName) {
        Log.debug("Waiting to click item '" + productName + "'");
        TimeUtils.makeWait(7000);
        driver.findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true))" +
                        ".scrollIntoView(new UiSelector().textContains(\"" + productName + "\"))")).click();
        Log.debug("Just clicked the item '" + productName + "'");
    }


}
