package context;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.ContextMenuPage;

import static org.testng.Assert.assertEquals;

public class ContextTests extends BaseTests {

    @Test
    public void testContextMenu() {
        ContextMenuPage contextMenuPage = homePage.clickContextMenu();
        contextMenuPage.rightClickOnBox();
        assertEquals(contextMenuPage.getAlertText(), "You selected a context menu");
        contextMenuPage.acceptAlert();
    }
}
