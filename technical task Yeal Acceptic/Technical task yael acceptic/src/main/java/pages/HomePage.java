package pages;

import Utils.ValueProvider;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseSeleniumPage {
    @FindBy(tagName = "input")
    private WebElement createToDoListButton;
    @FindBy(xpath = "//img[@alt='Daily Todo Screenshot']")
    private WebElement homepageScreenshot;

    public CreateToDoListPage clickOnCreateToDoListButton() {
        createToDoListButton.click();
        return new CreateToDoListPage();
    }

    public boolean pageCheck() {
        return homepageScreenshot.isEnabled();
    }

    public HomePage() {
        PageFactory.initElements(driver, this);
    }
}
