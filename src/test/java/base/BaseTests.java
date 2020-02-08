package base;

import com.google.common.io.Files;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;
import utils.WindowManager;

import java.io.File;
import java.io.IOException;


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
    public void tearDown(ITestResult testResult) {
        if (ITestResult.FAILURE == testResult.getStatus()) {
            var camera = (TakesScreenshot) driver;
            File screenshot = camera.getScreenshotAs(OutputType.FILE);
            try {
                Files.move(screenshot, new File("C:\\Users\\markp\\IdeaProjects\\com.testAutomationU\\src\\main\\resources\\screenshots\\" + testResult.getName() + ".png"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        driver.quit();
    }

    public WindowManager getWindowManager() {
        return new WindowManager(driver);
    }
}