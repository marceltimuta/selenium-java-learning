package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SliderPage {

    private WebDriver driver;
    private By slider = By.cssSelector(".sliderContainer input");
    private By range = By.id("range");

    public SliderPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement findSlider(By by) {
        return driver.findElement(by);
    }

    public void clickOnSlider() {
        findSlider(slider).click();
    }

    public void moveSlider(String position) {
        while (!getRange().equals(position))
            findSlider(slider).sendKeys(Keys.ARROW_RIGHT);
    }

    public String getRange() {
        return driver.findElement(range).getText();
    }

}
