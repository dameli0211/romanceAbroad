
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class FlowerTests extends BaseUi {

    int indexLinkFlower = 2;

    @Test
    public void testFlower(){
        driver.findElement(Locators.LINK_GIFT).click();
        driver.findElements(Locators.LINK_BUSKET_FLOWERS).get(indexLinkFlower).click();

    }
}
