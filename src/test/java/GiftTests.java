import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


public class GiftTests extends BaseUi {

    @Test
    public void giftPage1() {
        giftPage.giftSection();
    }

    @Test
    public void listOfGifts() {


        String expectedTitleFlowerBusket = "Flower basket";
        String expectedTitleSpa = "Spa";
        String expectedTitleTeddyBear = "Teddy bear";
        driver.findElement(Locators.LINK_GIFT).click();
        WebElement gifts =  driver.findElement(Locators.LIST_OF_GIFTS);

           if (gifts.getText().contains(expectedTitleFlowerBusket)) {
            Assert.assertTrue(driver.findElement(Locators.GIFTS_TEXT_BUSKET).isDisplayed());
            }

             else if  (gifts.getText().contains(expectedTitleSpa)) {
                Assert.assertTrue(driver.findElement(Locators.GIFTS_TEXT_SPA).isDisplayed());

            }
             else if(gifts.getText().contains(expectedTitleTeddyBear)){
                 Assert.assertTrue(driver.findElement(Locators.GIFTS_TEXT_TEDDY).isDisplayed());

            }  else {
                Assert.fail("Gifts are not displayed");
            }
        }
    }

