import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class FlowersPage extends BaseActions {
    public FlowersPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    int indexLinkFlower = 2;

    public void flowerSection(){
        driver.findElement(Locators.LINK_GIFT).click();
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Locators.LINK_BUSKET_FLOWERS)));
        driver.findElements(Locators.LINK_BUSKET_FLOWERS).get(indexLinkFlower).click();
    }


}
