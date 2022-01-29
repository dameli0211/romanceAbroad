import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RequestTourPage extends BaseActions {
      public RequestTourPage(WebDriver driver, WebDriverWait wait) {
          super(driver, wait);
      }

      String currentTourRequest;
     public String RequestTourSection(){
         driver.findElement(Locators.LINK_REQUEST_TOUR).click();
         currentTourRequest = driver.getCurrentUrl();
         System.out.println(currentTourRequest);
         return currentTourRequest;
     }
}
