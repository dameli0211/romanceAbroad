import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;


public class RegistrationTests extends BaseUi {

    @Test
    public void testRegistration() {
        registrationPage.clickJoinButton();
        registrationPage.completeFirstPartOfRegistration();
        registrationPage.completeSecondPartOfRegistration();


        WebElement checkbox = driver.findElement(Locators.CHECKBOX_LIST);
        softAssert.assertEquals(!checkbox.isSelected(), "Element is displayed");
        checkbox.click();
    }

    @Test
    public void performClickList(){
        List<WebElement> clickList = driver.findElements(By.xpath("//div[@id='navbarResponsive']//ul"));
        for (int i = 0; i < clickList.size(); i++) {
            registrationPage.performClick(By.xpath("//div[@id='navbarResponsive']//ul"), 2);
        }
    }

    @Test
    public void linkVerification(){
        registrationPage.checkLinksOnWebPage("//a[@class='nav-link']", "//href='https://romanceabroad.com/media/index" );
        registrationPage.javaWaitSec(3);
        registrationPage.checkLinksOnWebPage("//a", "//href='https://romanceabroad.com/store/sweets/20-tour_to_ukraine");
        registrationPage.checkLinksOnWebPage("//a", "//https://romanceabroad.com/img/logo.jpg");
        driver.findElement(Locators.LINK_SEARCH).click();
        registrationPage.checkLinksOnWebPage("//img", "//src='https://romanceabroad.com/uploads/user-logo/0/0/3/360/great-faaf99d041.jpg?1645415750'");
        registrationPage.checkLinksOnWebPage("//a", "//href='https://romanceabroad.com/store/sweets/20-tour_to_ukraine");
        driver.findElement(Locators.LINK_GIFT).click();
        registrationPage.checkLinksOnWebPage("//img", "//src='https://romanceabroad.com/uploads/user-logo/0/0/3/360/great-faaf99d041.jpg?1645415750'");
        registrationPage.javaWaitSec(3);
        registrationPage.checkLinksOnWebPage("//img", "//src=https://romanceabroad.com/uploads/store/0/0/0/11/big-ffd05e6dee.jpg");
        registrationPage.checkLinksOnWebPage("//a", "//href=https://romanceabroad.com/store/sweets/20-tour_to_ukraine");

    }

}












