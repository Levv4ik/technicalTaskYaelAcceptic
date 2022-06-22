import Utils.ValueProvider;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import pages.BaseSeleniumPage;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public abstract class BaseTest {
    protected WebDriver driver;
    static ValueProvider valueProvider;
    @BeforeSuite
    public void beforeSuit() throws IOException {
        WebDriverManager.chromedriver().setup();
        valueProvider = new ValueProvider();
    }
    @BeforeMethod
    public void setup(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        BaseSeleniumPage.baseSeleniumPage(driver);
        driver.get(valueProvider.getUrlFromProperties());
    }
    @AfterMethod
    public void tearDown(){
        driver.close();
        driver.quit();
    }
}
