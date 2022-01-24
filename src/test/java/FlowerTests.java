import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import java.util.List;

public class FlowerTests extends BaseUi {


    @Test
    public void testFlower() {
        flowersPage.flowerSection();
    }


    @Test
    public void testFlower2() {
        driver.findElement(Locators.LINK_GIFT).click();
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Locators.LINK_BUSKET_FLOWERS)));
        driver.findElements(Locators.LINK_BUSKET_FLOWERS).get(flowersPage.indexLinkFlower).click();
        List<WebElement> flowerLink = driver.findElements(By.xpath("//div[@class='similar-products pt20']//ul"));
        System.out.println(flowerLink.size());
        for (int i = 0; i < flowerLink.size(); i++) {
            String flowerInfo = flowerLink.get(i).getText();
            System.out.println(flowerInfo);
            flowerLink.get(i).click();
        }
    }

    /*@Test
    public void flowersCondition() {
         String expectedTitleTeddyBear = "Teddy bear";
        List<WebElement> flCondition = driver.findElements(Locators.LINK_GIFT );
        System.out.println(flCondition.size());

        for (int i = 0; i < flCondition.size(); i++) {
            String teddyBearInfo = flCondition.get(i).getText();
            System.out.println(teddyBearInfo);
            flCondition.get(i).click();

            if(flCondition.contains("Teddy")){
                String actualTitle = driver.findElement(By.xpath("//h1[@class='title']")).getText();
                Assert.assertEquals(expectedTitleTeddyBear, actualTitle);
            }

            if()
        }
    }*/


}

