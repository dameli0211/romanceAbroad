import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TourToUkrainePage extends BaseActions {
    public TourToUkrainePage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }
   public void TourToUkraineSection(){
       driver.findElement(Locators.LINK_TOUR_UKRAIN).click();
       driver.findElement(Locators.SEARCH_PRODUCT).sendKeys("restaurant");
       driver.findElement(Locators.SEARCH_FRIEND_1).click();
   }

}
