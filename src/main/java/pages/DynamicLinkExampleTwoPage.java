package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

public class DynamicLinkExampleTwoPage {

    private WebDriver driver;
    private By startButton = By.cssSelector("#start button");
    private By finishMessage = By.id("finish");

    public DynamicLinkExampleTwoPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickStart() {
        driver.findElement(startButton).click();
    }

    public String getLoadedText() {
        FluentWait wait = new FluentWait(driver)
                .withTimeout(Duration.ofSeconds(5))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoSuchElementException.class);

        wait.until(ExpectedConditions.presenceOfElementLocated(finishMessage));

        return driver.findElement(finishMessage).getText();
    }

}
