import org.openqa.selenium.By;
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

        String expectedTitleTermsOfUse = "Terms of use";
        String expectedTitleAdvertising = "Advertising";
        String expectedTitleShippingTerm = "Shipping terms";
        String expectedUrl = "https://romanceabroad.com/content/view/advertising";
               // "https://romanceabroad.com/content/view/how-it-works";


        driver.findElement(Locators.LINK_HOW_WE_WORK).click();
        List<WebElement> tabs = driver.findElements(By.xpath("//div[@class='row row-content']//ul//li"));
        System.out.println(tabs.size());

        for (int i = 0; i < tabs.size(); i++) {
            String varTabs = tabs.get(i).getText();
            System.out.println(varTabs);
            tabs.get(i).click();

            if(varTabs.contains("Advertising")) {
                String actualTitle = driver.findElement(By.xpath("//div[text()='Advertising']")).getText();
                String actualUrl = driver.getCurrentUrl();
                Assert.assertEquals(expectedTitleAdvertising, actualTitle);
                Assert.assertEquals(expectedUrl, actualUrl);
            }

           else if (varTabs.contains("Terms of use")) {
                String actualTitle = driver.findElement(By.xpath("//div[text()='Terms of use']")).getText();
                Assert.assertEquals(expectedTitleTermsOfUse, actualTitle);
            }

           else if(varTabs.contains("Shipping terms")) {
                String actualTitle = driver.findElement(By.xpath("//div[text()='Shipping terms']")).getText();
                Assert.assertEquals(expectedTitleShippingTerm, actualTitle);
                driver.findElement(By.xpath("//div[@class='fleft'][text()='Shipping terms']")).isDisplayed();
            }

            driver.get(Data.howWeWorkUrl);
            tabs = driver.findElements(By.xpath("//div[@class='row row-content']//ul//li"));
        }
    }
}
