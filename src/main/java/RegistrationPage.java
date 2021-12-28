import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RegistrationPage extends BaseActions {
        public RegistrationPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void clickJoinButton(){
        driver.findElement(Locators.BUTTTON_REGISTRATION).click();
    }

    public void completeFirstPartOfRegistration(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.findElement(Locators.TEXT_FIELD_EMAIL).sendKeys(Data.email);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(Locators.TEXT_FIELD_PASSWORD)));
        driver.findElement(Locators.TEXT_FIELD_PASSWORD).sendKeys(Data.password);
        wait.until(ExpectedConditions.elementToBeClickable(Locators.BUTTON_NEXT));
        }

    public void completeSecondPartOfRegistration(){
        driver.findElement(Locators.BUTTON_NEXT).click();
        driver.findElement(Locators.TEXT_FIELD_NICKNAME).sendKeys(generateNewNumber(Data.nickname, 10));
        driver.findElement(Locators.RADIO_BUTTON_DAY).click();
        driver.findElement(Locators.RADIO_BUTTON_DAY_1).click();
        driver.findElement(Locators.RADIO_BUTTON_MONTH).click();
        driver.findElement(Locators.RADIO_BUTTON_MONTH_1).click();
        driver.findElement(Locators.RADIO_BUTTON_YEAR).click();
        driver.findElement(Locators.RADIO_BUTTON_YEAR_1).click();
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(Locators.TEXT_FIELD_NICKNAME)));
        driver.findElement(Locators.TEXT_PHONE).sendKeys(Data.phone);

        WebElement checkboxConfirmation = driver.findElement(Locators.CHECKBOX_LIST);
        boolean selectedCheckbox = checkboxConfirmation.isSelected();
        System.out.println(selectedCheckbox + " !!!!!!!!!");
        checkboxConfirmation.click();
    }
}


