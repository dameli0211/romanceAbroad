import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import java.time.Duration;

public class GiftTests extends BaseUi {

    @Test
    public void testGiftPage() {
        driver.findElement(Locators.LINK_GIFT).click();
        wait.until(ExpectedConditions.elementToBeClickable(Locators.LINK_FLOWER_IMG));
        driver.findElement(Locators.LINK_FLOWER_IMG).click();
        wait.until(ExpectedConditions.elementToBeClickable(Locators.LINK_SPA));
        driver.findElement(Locators.LINK_SPA).click();
        wait.until(ExpectedConditions.elementToBeClickable(Locators.LINK_BEAR_TOY));
        driver.findElement(Locators.LINK_BEAR_TOY).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
        driver.findElement(Locators.LINK_TOUR_UKRAIN).click();
    }
}
