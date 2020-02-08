package hover;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
public class HoverTests extends BaseTests {

    @Test
    public void testHoverFigure() {
        var hoverPage = homePage.clickHovers();
        var caption = hoverPage.hoverOverFigures(0);

        assertTrue(caption.isCaptionDisplayed(), "Caption not displayed");
        assertEquals(caption.getTitle(), "name: user1", "caption title is incorrect");
        assertEquals(caption.getLinkText(), "View profile", "Caption link text is incorrect");
        assertTrue(caption.getLink().endsWith("/users/1"), "Link is broken");
    }

}
