package keypress;

import base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class KeyPressTests extends BaseTests {


    @Test
    public void testBackSpace() {
        var keyPage = homePage.clickKeyPresses();
        keyPage.enterText("A" + Keys.BACK_SPACE);

        assertEquals(keyPage.getResultText(), "You entered: BACK_SPACE");
    }

}
