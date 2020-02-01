package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class KeyPressesPage {

    private WebDriver driver;

    private By keyPressField = By.id("target");
    private By resultMessage = By.id("result");

    public KeyPressesPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterText(String text) {
        driver.findElement(keyPressField).sendKeys(text);
    }

    public String getResultText() {
        return driver.findElement(resultMessage).getText();
    }

}
