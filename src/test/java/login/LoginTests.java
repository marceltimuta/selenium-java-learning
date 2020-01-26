package login;

import Base.BaseTests;
import org.testng.annotations.Test;
import pages.Loginpage;
import pages.SecureAreaPage;

import static org.testng.Assert.*;

public class LoginTests extends BaseTests {

    @Test
    public void testSuccessfulLogin() {
        Loginpage loginpage = homePage.clickFormAuthentication();
        loginpage.setUserName("tomsmith");
        loginpage.setPassword("SuperSecretPassword!");
        SecureAreaPage secureAreaPage = loginpage.clickOnLoginButton();
        assertTrue(secureAreaPage.getStatusAlertMessage().contains("You logged into a secure area!"),
                "Alert text is incorrect!");
    }
}
