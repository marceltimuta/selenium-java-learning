package login;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class LoginTests extends BaseTests {

    @Test
    public void testSuccessfulLogin() {
        var loginPage = homePage.clickFormAuthentication();
        loginPage.setUserName("tomsmith");
        loginPage.setPassword("SuperSecretPassword!");
        var secureAreaPage = loginPage.clickOnLoginButton();
        assertTrue(secureAreaPage.getStatusAlertMessage().contains("You logged into a secure area!"),
                "Alert text is incorrect!");
    }
}
