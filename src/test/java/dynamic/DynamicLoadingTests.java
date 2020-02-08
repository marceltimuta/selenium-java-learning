package dynamic;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class DynamicLoadingTests extends BaseTests {

    @Test
    void openDynamicLoadingExample1() {
        var loadingPage = homePage.clickOnDynamicLoading().clickOnExampleOneLink();
        loadingPage.clickStart();

        assertEquals(loadingPage.getLoadedText(),
                "Hello World!", "Message is incorrect");
    }

    @Test
    void openDynamicLoadingExample2() {
        var loadingPage = homePage.clickOnDynamicLoading().clickOnExampleTwoLink();
        loadingPage.clickStart();

        assertEquals(loadingPage.getLoadedText(),
                "Hello World!", "Message is incorrect");
    }
}
