package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class DropDownListPage {

    private WebDriver driver;

    private By dropDown = By.id("dropdown");

    public DropDownListPage(WebDriver driver) {
        this.driver = driver;
    }

    public DropDownListPage changeDropDownToMultipleSelection() {
        String script = "document.querySelector(\"#dropdown\").setAttribute('multiple','')";
        var jsScript = (JavascriptExecutor) driver;
        jsScript.executeScript(script);
        return this;
    }

    public String getDropDownText() {
        return driver.findElement(dropDown).getText();
    }
}
