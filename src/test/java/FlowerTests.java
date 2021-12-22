
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class FlowerTests extends BaseUi {

    int indexLinkFlower = 2;

    @Test
    public void testFlower(){
        driver.findElement(Locators.LINK_GIFT).click();
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Locators.LINK_BUSKET_FLOWERS)));
        driver.findElements(Locators.LINK_BUSKET_FLOWERS).get(indexLinkFlower).click();

    }
}
