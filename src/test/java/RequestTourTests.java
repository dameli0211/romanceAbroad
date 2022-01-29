import org.testng.Assert;
import org.testng.annotations.Test;

public class RequestTourTests extends BaseUi{

    String currentTourRequest;

    @Test
    public void testRequestTour(){
        String tourAssertions = requestTourPage.RequestTourSection();
        Assert.assertEquals(tourAssertions, Data.expectedTourRequest);
    }
}

