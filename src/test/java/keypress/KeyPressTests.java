package keypress;

import base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.KeyPressesPage;

import static org.testng.Assert.assertEquals;

public class KeyPressTests extends BaseTests {

    private KeyPressesPage keyPage;

    @Test
    public void testBackSpace() {
        keyPage = homePage.clickKeyPresses();
        keyPage.enterText("A" + Keys.BACK_SPACE);
        assertEquals(keyPage.getResultText(), "You entered: BACK_SPACE");
    }

}
