package pages;

import org.openqa.selenium.WebDriver;

public class BaseSeleniumPage {
    protected static WebDriver driver;
    public static void baseSeleniumPage(WebDriver webDriver){
        driver = webDriver;
    }
}
