package nested_frames;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.NestedFramesPage;

import static org.testng.Assert.assertEquals;

public class NestedFrameTests extends BaseTests {

    @Test
    public void testNestedFrames() {
        NestedFramesPage nestedFramesPage = homePage.clickOnNestedFramesLink();
        assertEquals(nestedFramesPage.getTextFromLeftFrame(), "left".toUpperCase());
        assertEquals(nestedFramesPage.getTextFromBottomFrame(), "bottom".toUpperCase());
    }
}
