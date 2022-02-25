import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class FlowerTests extends BaseUi {

    @Test
    public void testFlower(){

        flowersPage.flowerSection();
    }

@Test
public void testClickFlower(){
    driver.findElement(Locators.LINK_GIFT).click();
    flowersPage.perfomClick(By.xpath("//img[@src='https://romanceabroad.com/uploads/store/0/0/0/2/big-c907aa3b7e.jpg']"), 0);
    }
}


