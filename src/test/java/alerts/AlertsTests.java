package alerts;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.AlertsPage;

import static org.testng.Assert.assertEquals;

public class AlertsTests extends BaseTests {

    @Test
    public void testAlertButton() {
        AlertsPage alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerAlert();
        alertsPage.alertClickToAccept();
        assertEquals(alertsPage.getResultText(), "You successfuly clicked an alert");
    }

    @Test
    public void testGetTextFromAlert() {
        AlertsPage alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerConfirm();
        assertEquals(alertsPage.alertGetText(), "I am a JS Confirm");
        alertsPage.alertClickToDismiss();
        assertEquals(alertsPage.getResultText(), "You clicked: Cancel");
    }

    @Test
    public void testAlertInput() {
        AlertsPage alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerPrompt();
        alertsPage.alertSetInput("I am the best automator");
        alertsPage.alertClickToAccept();
        assertEquals(alertsPage.getResultText(), "You entered: I am the best automator");
    }
}
