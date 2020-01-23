package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTests {
    private WebDriver driver;

    public static void main(String[] args) {
        BaseTests test = new BaseTests();
        test.setUp();
    }

    public void setUp() {
        System.setProperty("webdriver.gecko.driver", "src//main//resources//geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("https://google.com");
        System.out.println(driver.getTitle());
    }
}