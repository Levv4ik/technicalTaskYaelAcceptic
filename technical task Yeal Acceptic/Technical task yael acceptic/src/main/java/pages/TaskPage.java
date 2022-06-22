package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class TaskPage extends BaseSeleniumPage {
    @FindBy(xpath = "//td[contains(@id,'t')]")
    private List<WebElement> taskFields;
    @FindBy(xpath = "//td[@id='headline']")
    private WebElement listName;
    @FindBy(xpath = "//a[text()='Edit']")
    private WebElement editButton;
    @FindBy(tagName = "input")
    private List<WebElement> taskCheckBoxes;

    public TaskPage() {
        PageFactory.initElements(driver, this);
    }

    public String getTaskText(int index) {
        return taskFields.get(index).getText();
    }
    public String getListName(){
        return listName.getText();
    }

    public EditPage clickEditButton() {
        editButton.click();
        return new EditPage();
    }

    public TaskPage clickTaskCheckBox(int index) {
        taskCheckBoxes.get(index).click();
        return new TaskPage();
    }
}
