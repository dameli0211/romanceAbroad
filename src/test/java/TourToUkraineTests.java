import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class TourToUkraineTests extends BaseUi{
    @Test
    public void tourToUkraine(){
        driver.findElement(Locators.LINK_TOUR_UKRAIN).click();
        driver.findElement(By.cssSelector("input#search_product")).sendKeys("restaurant");
        driver.findElement(By.xpath("//button[@id='search_friend']")).click();
    }

}
