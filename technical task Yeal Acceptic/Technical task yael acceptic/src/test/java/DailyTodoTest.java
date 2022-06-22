import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

public class DailyTodoTest extends BaseTest {

    @Test
    public void taskCreateTest() {
        String expectedTaskValue = "task1";
        String actualTaskValue = new HomePage()
                .clickOnCreateToDoListButton()
                .setTaskInput(expectedTaskValue)
                .clickOnSaveTaskButton()
                .getTaskText(0);
        Assert.assertEquals(expectedTaskValue, actualTaskValue);
    }

    @Test
    public void taskCreationCancelTest() {
        String taskValue = "task1";
        boolean isPresent = new HomePage()
                .clickOnCreateToDoListButton()
                .setTaskInput(taskValue)
                .clickOnCancelButton()
                .pageCheck();
        Assert.assertTrue(isPresent);
    }

    @Test
    public void listNameTest() {
        String TaskValue = "task1";
        String expectedListName = "list 1";
        String actualListName = new HomePage()
                .clickOnCreateToDoListButton()
                .setTaskInput(TaskValue)
                .clickOnSaveTaskButton()
                .clickEditButton()
                .setTaskListName(expectedListName)
                .clickOnSaveTaskButton()
                .getListName();
        Assert.assertEquals(actualListName.replaceAll(" Edit",""),expectedListName);
    }
}
