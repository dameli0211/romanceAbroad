import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class GiftTests extends BaseUi {

    @Test
    public void giftPage1() {
        giftPage.giftSection();
    }

    @Test
    public void listOfGifts() {

        String actualTitle;
        String expectedTitleFlowerBusket = "Flower basket";
        String expectedTitleSpa = "Spa";
        String expectedTitleTeddyBear = "Teddy bear";
        driver.findElement(Locators.LINK_GIFT).click();
        List<WebElement> gifts = driver.findElements(By.xpath("//div[@class='contrasting-block row g-bestsellers-gallery']"));
        System.out.println(gifts.size());


        for (int i = 0; i < gifts.size(); i++) {
            String listG = gifts.get(i).getText();
            System.out.println(listG);
            gifts.get(i).click();


            if (listG.contains("Flower basket")) {
            actualTitle = driver.findElement(By.xpath("//div[text()='Flower basket']")).getText();
            Assert.assertEquals(expectedTitleFlowerBusket, actualTitle);

            }

            if (listG.contains("Spa")) {
                actualTitle = driver.findElement(By.xpath("//div[text()='Spa']")).getText();
                Assert.assertEquals(expectedTitleSpa, actualTitle);
            }

            if(listG.contains("Teddy")){
                 actualTitle = driver.findElement(By.xpath("//div[text()='Teddy bear']")).getText();
                Assert.assertEquals(expectedTitleTeddyBear, actualTitle);
            }
            driver.get(Data.mainUrl);
            gifts = driver.findElements(By.xpath("//div[@class='contrasting-block row g-bestsellers-gallery']"));
        }
    }
}
