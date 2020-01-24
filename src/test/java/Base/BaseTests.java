package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class BaseTests {
    private WebDriver driver;

    public static void main(String[] args) {
        BaseTests test = new BaseTests();
        test.setUp();
        test.exerciseChapter3();
        test.tearDown();
    }

    public void setUp() {
        System.setProperty("webdriver.gecko.driver", "src//main//resources//geckodriver.exe");
        driver = new FirefoxDriver();
    }

    public void exerciseChapter3() {
        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[38]/a")).click();
        driver.findElement(By.linkText("Example 1: Menu Element")).click();
        List<WebElement> elements = driver.findElements(By.tagName("li"));
        System.out.println("There are: " + elements.size() + " elements on the page");
    }

    public void tearDown() {
        driver.quit();
    }
}