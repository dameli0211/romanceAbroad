import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class GiftPage extends BaseActions {
    public GiftPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

public void giftSection() {
    driver.findElement(Locators.LINK_GIFT).click();
    wait.until(ExpectedConditions.elementToBeClickable(Locators.LINK_FLOWER_IMG));
    driver.findElement(Locators.LINK_FLOWER_IMG).click();
    driver.findElement(Locators.LINK_SPA).click();
    wait.until(ExpectedConditions.elementToBeClickable(Locators.LINK_BEAR_TOY));
    driver.findElement(Locators.LINK_BEAR_TOY).click();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    driver.findElement(Locators.LINK_TOUR_UKRAIN).click();
  }
}
