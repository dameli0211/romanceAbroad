import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RequestTourTests extends BaseUi{



    @Test
    public void testRequestTour(){
        String tourAssertions = requestTourPage.RequestTourSection();
        Assert.assertEquals(tourAssertions, Data.expectedTourRequest);
    }

    @Test
    public void verifyRequestTour(){
        WebElement scrollToRequestTour = driver.findElement(Locators.LINK_REQUEST_TOUR);
        requestTourPage.ajaxScroll(scrollToRequestTour);
    }
}

