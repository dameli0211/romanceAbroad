import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

     public class MainIframePage extends BaseActions {
     public MainIframePage(WebDriver driver, WebDriverWait wait) {

         super(driver, wait);
    }
     public void iframeSection() {
         WebElement ele = driver.findElement(Locators.IFRAME_TEST);
         driver.switchTo().frame(ele);
         driver.findElement(Locators.IFRAME_BUTTON).click();
      }
     }
