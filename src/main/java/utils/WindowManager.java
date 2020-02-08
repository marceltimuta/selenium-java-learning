package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WindowManager {
    private WebDriver driver;
    private WebDriver.Navigation navigate;

    public WindowManager(WebDriver driver) {
        this.driver = driver;
        navigate = driver.navigate();
    }

    public void goBack() {
        navigate.back();
    }

    public void goForward() {
        navigate.forward();
    }

    public void refreshPage() {
        navigate.refresh();
    }

    public void goTo(String url) {
        navigate.to(url);
    }

    public void switchTab(String tabTitle) {
        var windows = driver.getWindowHandles();

        System.out.println("Number of tabs: " + windows.size());
        windows.forEach(System.out::println);

        for (String window : windows) {
            System.out.println("Switching to window: " + window);
            driver.switchTo().window(window);

            if (tabTitle.equals(driver.getTitle())) {
                break;
            }
        }
        System.out.println("Current window title: " + driver.getTitle());
    }

    public void switchToNewTab() {
        var windows = driver.getWindowHandles();
        System.out.println("Number of tabs: " + windows.size());
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));

        for (String window : windows) {
            driver.switchTo().window(window);
        }
    }
}
