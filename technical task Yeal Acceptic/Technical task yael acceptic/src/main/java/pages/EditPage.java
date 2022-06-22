package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditPage extends BaseSeleniumPage{
    @FindBy(tagName = "textarea")
    private WebElement tasksInputField;
    @FindBy(xpath = "//input[@name='title']")
    private WebElement taskListNameInputField;
    @FindBy(xpath = "//input[@type='submit']")
    private WebElement saveTaskButton;
    @FindBy(xpath = "//a[text()='Cancel']")
    private WebElement cancelButton;

    public TaskPage clickOnCancelButton() {
        cancelButton.click();
        return new TaskPage();
    }
    public TaskPage clickOnSaveTaskButton(){
        saveTaskButton.click();
        return new TaskPage();
    }

    public EditPage edit1TaskInputField(String value){
        tasksInputField.sendKeys(value);
        return new EditPage();
    }

    public EditPage addNewTask(String value){
        tasksInputField.sendKeys(Keys.ENTER,value);
        return new EditPage();
    }
    public EditPage setTaskListName(String value){
        taskListNameInputField.clear();
        taskListNameInputField.sendKeys(value);
        return new EditPage();
    }

    public EditPage() {
        PageFactory.initElements(driver,this);
    }


}
