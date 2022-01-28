import org.testng.Assert;
import org.testng.annotations.Test;

public class RequestTourTests extends BaseUi{

    String currentTourRequest;



    @Test
    public void testRequestTour(){
        requestTourPage.RequestTourSection();
        currentTourRequest = driver.getCurrentUrl();
        System.out.println(currentTourRequest);
        Assert.assertEquals(currentTourRequest, Data.expectedTourRequest);
    }
}

