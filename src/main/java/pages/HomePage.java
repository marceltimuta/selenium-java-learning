package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public Loginpage clickFormAuthentication() {
        clickLink("Form Authentication");
        return new Loginpage(driver);
    }

    public DropDownPage clickDropDown() {
        clickLink("Dropdown");
        return new DropDownPage(driver);
    }

    public ForgotPasswordPage clickForgotPassword() {
        clickLink("Forgot Password");
        return new ForgotPasswordPage(driver);
    }

    public HoversPage clickHovers() {
        clickLink("Hovers");
        return new HoversPage(driver);
    }

    public KeyPressesPage clickKeyPresses() {
        clickLink("Key Presses");
        return new KeyPressesPage(driver);
    }

    public SliderPage clickHorizontalSlider() {
        clickLink("Horizontal Slider");
        return new SliderPage(driver);
    }

    public AlertsPage clickJavaScriptAlerts() {
        clickLink("JavaScript Alerts");
        return new AlertsPage(driver);
    }

    public ContextMenuPage clickContextMenu() {
        clickLink("Context Menu");
        return new ContextMenuPage(driver);
    }

    public IFramePage clickOnWYSIWYGLink() {
        clickLink("WYSIWYG Editor");
        return new IFramePage(driver);
    }

    public NestedFramesPage clickOnNestedFramesLink() {
        clickLink("Nested Frames");
        return new NestedFramesPage(driver);
    }

    private void clickLink(String link) {
        driver.findElement(By.linkText(link)).click();
    }
}
