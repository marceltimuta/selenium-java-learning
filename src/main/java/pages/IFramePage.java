package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class IFramePage {

    private WebDriver driver;
    private String editorID = "mce_0_ifr";
    private By textArea = By.id("tinymce");
    private By decreaseIndentButton = By.cssSelector("#mceu_12 button");

    public IFramePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clearTextArea() {
        switchToFrameArea();
        driver.findElement(textArea).clear();
        switchToMainArea();
    }

    public void setTextArea(String text) {
        switchToFrameArea();
        driver.findElement(textArea).sendKeys(text);
        switchToMainArea();
    }

    public void decreaseIndentation() {
        driver.findElement(decreaseIndentButton).click();
    }

    public String getTextFromFrameField() {
        switchToFrameArea();
        String text = driver.findElement(textArea).getText();
        switchToMainArea();
        return text;
    }

    private void switchToFrameArea() {
        driver.switchTo().frame(editorID);
    }

    private void switchToMainArea() {
        driver.switchTo().parentFrame();
    }
}
