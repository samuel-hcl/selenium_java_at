package setup;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Setup {

    public static WebDriver driver;
    public static WebDriverWait wait;

    @Before
    public void initializeWebdriver() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");

        System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");
        driver = new ChromeDriver(options);
        wait = new WebDriverWait(driver, 10);

        driver.get("https://google.com.br/");
        driver.manage().window().maximize();
    }

    @After
    public void after() { driver.quit(); }
}
