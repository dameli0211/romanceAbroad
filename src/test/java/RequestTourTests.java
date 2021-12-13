import org.testng.Assert;
import org.testng.annotations.Test;

public class RequestTourTests extends BaseUi{

    String currentTourRequest;
    String expectedTourRequest = "https://romanceabroad.com/";


    @Test
    public void testRequestTour(){
        driver.findElement(Locators.LINK_REQUEST_TOUR).click();
        currentTourRequest = driver.getCurrentUrl();
        System.out.println(currentTourRequest);
        Assert.assertEquals(currentTourRequest, expectedTourRequest);
    }

}