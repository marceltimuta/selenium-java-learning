package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingPage {

    private WebDriver driver;

    private By dynamicLinkExample1 = By.cssSelector(".example a[href='/dynamic_loading/1']");
    private By dynamicLinkExample2 = By.cssSelector(".example a[href='/dynamic_loading/2']");

    public DynamicLoadingPage(WebDriver driver) {
        this.driver = driver;
    }

    public DynamicLinkExampleOnePage clickOnExampleOneLink() {
        driver.findElement(dynamicLinkExample1).click();
        return new DynamicLinkExampleOnePage(driver);
    }

    public DynamicLinkExampleTwoPage clickOnExampleTwoLink() {
        driver.findElement(dynamicLinkExample2).click();
        return new DynamicLinkExampleTwoPage(driver);
    }

    public DynamicLinkExampleTwoPage openPageInNewTab() {
        driver.findElement(dynamicLinkExample2).sendKeys(Keys.CONTROL, Keys.RETURN);
        return new DynamicLinkExampleTwoPage(driver);
    }
}
