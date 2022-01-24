import org.testng.Assert;
import org.testng.annotations.Test;

public class TestGiftPage extends BaseUi {

    String currentUrlGift;

    @Test
    public void assertionOfURL() {
        Assert.assertTrue(driver.findElement(Locators.LINK_GIFT).isDisplayed(), "Element is not displayed");
        driver.findElement(Locators.LINK_GIFT).click();
        currentUrlGift = driver.getCurrentUrl();
        System.out.println(currentUrlGift);
        Assert.assertEquals(currentUrlGift, Data.expectedUrlGift);


    }

    @Test
    public void testGift2Page() {

        giftPage2.giftPageSection();
    }
}


