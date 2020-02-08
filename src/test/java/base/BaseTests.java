package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;


public class BaseTests {
    private WebDriver driver;
    protected HomePage homePage;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.gecko.driver", "src//main//resources//geckodriver.exe");
        driver = new FirefoxDriver();
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://the-internet.herokuapp.com/");
        homePage = new HomePage(driver);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}