import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class RegistrationTests extends BaseUi {

    @Test
    public void testRegistration() {
        registrationPage.clickJoinButton();
        registrationPage.completeFirstPartOfRegistration();
        registrationPage.completeSecondPartOfRegistration();

        WebElement checkbox = driver.findElement(Locators.CHECKBOX_LIST);
        softAssert.assertEquals(!checkbox.isSelected(), "Element is displayed");
        checkbox.click();
    }


}












