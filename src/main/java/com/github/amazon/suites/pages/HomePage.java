package com.github.amazon.suites.pages;

import com.github.amazon.suites.utils.Log;
import com.github.amazon.suites.utils.TimeUtils;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    private AndroidDriver<AndroidElement> driver;

    public HomePage() {
    }

    public HomePage(AndroidDriver<AndroidElement> driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "com.amazon.mShop.android.shopping:id/left_button")
    private MobileElement btnDontChangeAddress;

    @AndroidFindBy(id = "com.amazon.mShop.android.shopping:id/chrome_action_bar_search_icon")
    private MobileElement btnSearchIcon;

    @AndroidFindBy(id = "com.amazon.mShop.android.shopping:id/rs_search_src_text")
    private MobileElement txtSearch;

    @AndroidFindBy(id = "com.amazon.mShop.android.shopping:id/iss_search_dropdown_item_text_layout")
    private MobileElement drpSearchSuggestions;

    public void clickDontChangeAddress() {
        Log.debug("Waiting to click the 'Don't Change' button");
        TimeUtils.makeWait(10000);
        btnDontChangeAddress.click();
        Log.debug("Just clicked the 'Don't Change' button");
    }

    public void clickSearchIcon() {
        TimeUtils.makeWait(5000);
        btnSearchIcon.click();
        Log.debug("Just clicked the 'Search' button");
    }

    public void typeSearchText(String input) {
        TimeUtils.makeWait(2000);
        txtSearch.sendKeys(input);
        Log.debug("Just searched the '" + input + "' button");
    }

    public void selectSuggestion() {
        // ideally we should get the text to select from dropdown
        TimeUtils.makeWait(7000);
        drpSearchSuggestions.click();
        Log.debug("Just selected the first suggestion");
    }
}
