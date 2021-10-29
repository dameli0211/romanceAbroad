import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestGiftPage extends BaseUi{


    @Test
    public void testGift2Page(){
        driver.findElement(Locators.LINK_GIFT).click();
        driver.findElement(Locators.SEARCH_GIFT).sendKeys("//a[@href='https://romanceabroad.com/store/sweets/11-teddy_bear']");
        driver.findElement(Locators.SEARCH_FRIEND).click();
    }
}
