import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class HowWeWorkTests extends BaseUi{
    @Test
    public void testHowWeWork(){

        howWeWorkPage.howWeWorkSection();
    }

    @Test
    public void listOfTabs(){
        driver.findElement(Locators.LINK_HOW_WE_WORK).click();
        List<WebElement> tabs = driver.findElements(Locators.LINK_INFORMATION_LIST);
        System.out.println(tabs.size());


        for (int i = 0; i < tabs.size(); i++) {
            String varTabs = tabs.get(i).getText();
            System.out.println(varTabs);
            tabs.get(i).click();

            if(varTabs.contains("Advertising")) {
                String actualTitle = driver.findElement(Locators.LINK_TEXT_ADVERTISING).getText();
                String actualUrl = driver.getCurrentUrl();
                Assert.assertEquals(Data.expectedTitleAdvertising, actualTitle);
                Assert.assertEquals(Data.expectedUrl, actualUrl);
            }

           else if (varTabs.contains("Terms of use")) {
                String actualTitle = driver.findElement(Locators.LINK_TEXT_TERMS_OF_USE).getText();
                Assert.assertEquals(Data.expectedTitleTermsOfUse, actualTitle);
            }

           else if(varTabs.contains("Shipping terms")) {
                String actualTitle = driver.findElement(Locators.LINK_TEXT_SHIPPING_TERMS).getText();
                Assert.assertEquals(Data.expectedTitleShippingTerm, actualTitle);
                driver.findElement(Locators.LINK_TEXT_SHIPPING_TERMS_1).isDisplayed();
            }

            driver.get(Data.howWeWorkUrl);
            tabs = driver.findElements(Locators.LINK_INFORMATION_LIST);
        }
    }

    @Test
   public void valueListElement(){
       driver.findElement(Locators.LINK_HOW_WE_WORK).click();
       howWeWorkPage.clickValueOfList(Locators.LINK_TEXT_SHIPPING_TERMS, "Shipping terms");
        howWeWorkPage.javaWaitSec(3);
   }
}
