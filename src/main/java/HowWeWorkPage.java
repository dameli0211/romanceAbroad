import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HowWeWorkPage extends BaseActions {
    public HowWeWorkPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }
    public void howWeWorkSection(){
        driver.findElement(Locators.LINK_HOW_WE_WORK).click();
        driver.findElement(Locators.LINK_HOW_WE_WORK_1).click();
        driver.findElement(Locators.LINK_HOW_WE_WORK_2).click();
    }
}
