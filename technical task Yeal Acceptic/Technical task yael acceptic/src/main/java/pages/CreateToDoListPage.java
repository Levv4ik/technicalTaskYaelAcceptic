package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateToDoListPage extends BaseSeleniumPage {
    @FindBy(tagName = "textarea")
    private WebElement taskInputField;
    @FindBy(xpath = "//input[@type='submit']")
    private WebElement saveTaskButton;
    @FindBy(xpath = "//a[text()='Cancel']")
    private WebElement cancelButton;


    public CreateToDoListPage setTaskInput(String value) {
        taskInputField.sendKeys(value);
        return new CreateToDoListPage();
    }

    public HomePage clickOnCancelButton() {
        cancelButton.click();
        return new HomePage();
    }
    public TaskPage clickOnSaveTaskButton(){
        saveTaskButton.click();
        return new TaskPage();
    }

    public CreateToDoListPage(){
        PageFactory.initElements(driver, this);
    }
}
