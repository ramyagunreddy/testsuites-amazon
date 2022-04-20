package com.github.amazon.suites.tests;

import com.github.amazon.suites.pages.HomePage;
import com.github.amazon.suites.pages.ItemViewPage;
import com.github.amazon.suites.pages.SearchResultsPage;
import com.github.amazon.suites.pages.WelcomePage;
import com.github.amazon.suites.utils.DriverUtils;
import com.github.amazon.suites.utils.Log;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import java.net.MalformedURLException;

public class MultipleItemsToCartTest {
    public static void main(String[] args) throws MalformedURLException {

        AndroidDriver<AndroidElement> driver = DriverUtils.getDriver();

        Log.info("START: Test suited to add multiple items to cart ");

        WelcomePage wpage = new WelcomePage(driver);

        wpage.clickSkipSignin();
        wpage.clickCountrySelectionPopup();

        HomePage hpage = new HomePage(driver);
        String searchText = "mobile phones";

        hpage.clickDontChangeAddress();
        hpage.clickSearchIcon();
        hpage.typeSearchText(searchText);
        hpage.selectSuggestion();

        // SearchResults
        SearchResultsPage spage = new SearchResultsPage(driver);

        ItemViewPage ipage = new ItemViewPage(driver);

        for (String product : new String[]{"Moto G Stylus | 2021 | 2-Day Battery", "SAMSUNG Galaxy S20 FE 5G Factory"}) {
            spage.clickProduct(product);
            ipage.addToCart();
            ipage.clickBackButton();
        }
    }
}
