package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;
    private By formAuthenticationLink = By.linkText("Form Authentication");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public Loginpage clickFormAuthentication() {
        driver.findElement(formAuthenticationLink).click();
        return new Loginpage(driver);
    }
}