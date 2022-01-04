import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;




public class RegistrationTests extends BaseUi {

    @Test
    public void testRegistration(){
        registrationPage.clickJoinButton();
        registrationPage.completeFirstPartOfRegistration();
        registrationPage.completeSecondPartOfRegistration();

        WebElement checkbox = driver.findElement(Locators.CHECKBOX_LIST);

        if(!checkbox.isSelected()){
            checkbox.click();
            System.out.println("Checkbox is selected");
        }
    }
}












