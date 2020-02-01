package forgot_password;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.ForgotPasswordPage;
import pages.ResetSuccessfulPage;

import static org.testng.Assert.assertEquals;

public class ForgotPasswordTests extends BaseTests {

    @Test
    public void testCorrectMessage() {
        ForgotPasswordPage forgotPasswordPage = homePage.clickForgotPassword();
        forgotPasswordPage.enterEmailAddress("test@yahoo.com");
        ResetSuccessfulPage resetSuccessful = forgotPasswordPage.clickOnRetrievePasswordButton();
        assertEquals(resetSuccessful.getForgotPasswordText(),
                "Your e-mail's been sent!", "Text is incorrect");
    }
}
