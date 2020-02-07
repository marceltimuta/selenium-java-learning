package frames;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FrameTests extends BaseTests {

    @Test
    public void testWysiwyg() {
        var iFramePage = homePage.clickOnWYSIWYGLink();
        iFramePage.clearTextArea();
        iFramePage.setTextArea("Hello ");
        iFramePage.decreaseIndentation();
        iFramePage.setTextArea("World!");
        assertEquals(iFramePage.getTextFromFrameField(), "Hello World!", "Text incorrect");
    }
}
