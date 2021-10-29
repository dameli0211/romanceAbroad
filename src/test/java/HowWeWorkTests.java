import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class HowWeWorkTests extends BaseUi{
    @Test
    public void testHowWeWork(){
        driver.findElement(Locators.LINK_HOW_WE_WORK).click();
        driver.findElement(By.xpath("//a[@href='https://romanceabroad.com/content/view/how-it-works']")).click();
        driver.findElement(By.xpath("//a[@href='https://romanceabroad.com/content/view/shipping_terms']")).click();
    }

}
