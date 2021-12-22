import org.openqa.selenium.By;
import org.testng.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class MediaTests extends BaseUi {

    String currentUrlMedia;


    @Test
    public void testMediaPage() {
        driver.findElement(Locators.LINK_MEDIA).click();
        currentUrlMedia = driver.getCurrentUrl();
        System.out.println(currentUrlMedia);
        Assert.assertEquals(currentUrlMedia, Data.expectedUrlMedia);


        WebElement dropDownListMedia = driver.findElement(Locators.DROP_DOWN_LIST_MEDIA);
        /*getDropDownMediaByIndex(dropDownListMedia, 2);*/
        /*getDropDownMediaByText(dropDownListMedia, "Travel(0)");*/
        getDropDownMediaByValue(dropDownListMedia, "1");
    }

    /*public void getDropDownMediaByIndex(WebElement element, int index) {
        Select select = new Select(element);
        select.selectByIndex(index);
    }

    public void getDropDownMediaByText(WebElement element, String text) {
      Select select = new  Select(element);
      select.selectByVisibleText(text);
    }*/

    public void getDropDownMediaByValue(WebElement element, String value) {
        Select select = new Select(element);
        select.selectByValue(value);
    }

}


