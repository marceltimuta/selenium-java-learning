package hover;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.HoversPage;

import static org.testng.Assert.*;

public class HoverTests extends BaseTests {

    @Test
    public void testHoverFigure() {
        HoversPage hoverPage = homePage.clickHovers();
        HoversPage.FigureCaption caption = hoverPage.hoverOverFigures(0);
        assertTrue(caption.isCaptionDisplayed(), "Caption not displayed");
        assertEquals(caption.getTitle(), "name: user1", "caption title is incorrect");
        assertEquals(caption.getLinkText(), "View profile", "Caption link text is incorrect");
        assertTrue(caption.getLink().endsWith("/users/1"), "Link is broken");
    }

}
