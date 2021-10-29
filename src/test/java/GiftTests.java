import org.testng.annotations.Test;

public class GiftTests extends BaseUi {

    @Test
    public void testGiftPage() {
        driver.findElement(Locators.LINK_GIFT).click();
        driver.findElement(Locators.LINK_FLOWER_IMG).click();
        driver.findElement(Locators.LINK_SPA).click();
        driver.findElement(Locators.LINK_BEAR_TOY).click();
        driver.findElement(Locators.LINK_TOUR_UKRAIN).click();
    }
}
