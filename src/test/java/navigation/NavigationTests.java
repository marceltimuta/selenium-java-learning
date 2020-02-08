package navigation;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class NavigationTests extends BaseTests {

    @Test
    void testNavigator() {
        homePage.clickOnDynamicLoading().clickOnExampleOneLink();
        getWindowManager().goBack();
        getWindowManager().refreshPage();
        getWindowManager().goForward();
        getWindowManager().goTo("https://google.com");
    }

    @Test
    void testSwitchTabs() {
        homePage.clickMultipleWindows().clickHere();
        getWindowManager().switchTab("New Window");
    }

    @Test
    void testIfPageIsOpenInNewTab() {
        var newTab = homePage.clickOnDynamicLoading().openPageInNewTab();
        getWindowManager().switchToNewTab();

        assertTrue(newTab.checkIfStartButtonIsDisplayed(), "Browser switched to wrong tab");
    }
}
