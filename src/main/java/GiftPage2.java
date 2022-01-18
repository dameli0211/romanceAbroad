import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GiftPage2 extends BaseActions {
    public GiftPage2(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }
   public void giftPageSection(){
       driver.findElement(Locators.LINK_GIFT).click();
       wait.until(ExpectedConditions.elementToBeClickable(Locators.SEARCH_GIFT));
       driver.findElement(Locators.SEARCH_GIFT).sendKeys("//a[@href='https://romanceabroad.com/store/sweets/11-teddy_bear']");
       wait.until(ExpectedConditions.elementToBeClickable(Locators.SEARCH_FRIEND));
       driver.findElement(Locators.SEARCH_FRIEND).click();
   }

}
