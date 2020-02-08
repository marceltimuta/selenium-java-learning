package javascript;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class JavaScriptTests extends BaseTests {

    @Test
    void testScrollToTable() {
        homePage.clickLargeAndDeepDomLink().scrollToTable();
    }

    @Test
    void testScrollToFifthParagraph() {
        homePage.clickInfiniteScrollLink().scrollToParagraph(5);
    }

    @Test
    void testChangeDropDownToMultipleSelection() {
        String dropDownText = homePage.clickDropDownLink().changeDropDownToMultipleSelection().getDropDownText();
        assertEquals(dropDownText, "Please select an option\n" + "Option 1\n" + "Option 2");
    }
}
