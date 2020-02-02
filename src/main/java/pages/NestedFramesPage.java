package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NestedFramesPage {

    private WebDriver driver;
    private By textArea = By.tagName("body");

    public NestedFramesPage(WebDriver driver) {
        this.driver = driver;
    }

    private void switchToFrameTop() {
        driver.switchTo().frame("frame-top");
    }

    private void switchToFrameLeft() {
        driver.switchTo().frame("frame-left");
    }

    private void switchToFrameBottom() {
        driver.switchTo().frame("frame-bottom");
    }

    private String getFrameText() {
        return driver.findElement(textArea).getText();
    }

    private void switchToMainArea() {
        driver.switchTo().parentFrame();
    }

    public String getTextFromLeftFrame() {
        switchToFrameTop();
        switchToFrameLeft();
        String text = getFrameText();
        switchToMainArea();
        switchToMainArea();
        return text;
    }

    public String getTextFromBottomFrame() {
        switchToFrameBottom();
        String text = getFrameText();
        switchToMainArea();
        return text;
    }

}
