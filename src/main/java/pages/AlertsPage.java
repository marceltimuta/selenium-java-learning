package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsPage {

    private WebDriver driver;
    private By alertButton = By.cssSelector("button[onclick=\"jsAlert()\"]");
    private By confirmButton = By.cssSelector("button[onclick=\"jsConfirm()\"]");
    private By promptButton = By.cssSelector("button[onclick=\"jsPrompt()\"]");
    private By results = By.id("result");


    public AlertsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void triggerAlert() {
        driver.findElement(alertButton).click();
    }

    public void triggerConfirm() {
        driver.findElement(confirmButton).click();
    }

    public void triggerPrompt() {
        driver.findElement(promptButton).click();
    }

    public void alertClickToAccept() {
        driver.switchTo().alert().accept();
    }

    public void alertClickToDismiss() {
        driver.switchTo().alert().dismiss();
    }

    public void alertSetInput(String text) {
        driver.switchTo().alert().sendKeys(text);
    }

    public String alertGetText() {
        return driver.switchTo().alert().getText();
    }

    public String getResultText() {
        return driver.findElement(results).getText();
    }
}
