import org.testng.Assert;
import org.testng.annotations.Test;

public class TestGiftPage extends BaseUi {

    @Test
    public void assertionOfURL() {
        String giftAssert = giftPage2.giftAssertions();
        Assert.assertTrue(driver.findElement(Locators.LINK_GIFT).isDisplayed(), "Element is not displayed");
        Assert.assertEquals(giftAssert, Data.expectedUrlGift);
    }

    @Test
    public void testGift2Page() {

        giftPage2.giftPageSection();
    }
}


