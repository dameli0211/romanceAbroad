import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class RegistrationTests extends BaseUi {

    @Test
    public void testRegistration(){
        driver.findElement(Locators.BUTTTON_REGISTRATION).click();
        driver.findElement(Locators.TEXT_FIELD_EMAIL).sendKeys(Data.email);
        driver.findElement(Locators.TEXT_FIELD_PASSWORD).sendKeys(Data.password);
        driver.findElement(Locators.BUTTON_NEXT).click();
    }
}












