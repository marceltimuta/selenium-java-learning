package context;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ContextTests extends BaseTests {

    @Test
    public void testContextMenu() {
        var contextMenuPage = homePage.clickContextMenu();
        contextMenuPage.rightClickOnBox();
        assertEquals(contextMenuPage.getAlertText(), "You selected a context menu");
        contextMenuPage.acceptAlert();
    }
}
