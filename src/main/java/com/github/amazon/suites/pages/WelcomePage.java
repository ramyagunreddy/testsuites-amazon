package com.github.amazon.suites.pages;

import com.github.amazon.suites.utils.Log;
import com.github.amazon.suites.utils.TimeUtils;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {
    private AndroidDriver<AndroidElement> driver;

    public WelcomePage() {
    }

    public WelcomePage(AndroidDriver<AndroidElement> driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    // @iOSFindBy(id = "com.amazon.mShop.android.shopping:id/skip_sign_in_button")
    @AndroidFindBy(id = "com.amazon.mShop.android.shopping:id/skip_sign_in_button")
    private AndroidElement btnSkipSignin;

    @AndroidFindBy(id = "com.amazon.mShop.android.shopping:id/btn_cancel")
    private AndroidElement btnCancelPopup;


    public void clickSkipSignin() {
        TimeUtils.makeWait(7000);
        btnSkipSignin.click();
        Log.debug("Skipped signin");
    }

    public void clickCountrySelectionPopup() {
        TimeUtils.makeWait(10000);
        btnCancelPopup.click();
        Log.debug("Closed country selection");
    }

}