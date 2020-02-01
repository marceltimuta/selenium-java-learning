package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ResetSuccessfulPage {
    private WebDriver driver;

    private By forgotPasswordText = By.id("content");

    public ResetSuccessfulPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getForgotPasswordText() {
        return driver.findElement(forgotPasswordText).getText();
    }
}
