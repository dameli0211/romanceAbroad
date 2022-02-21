import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class MediaTests extends BaseUi {

    String currentUrlMedia;


    @Test
    public void testMediaPage() {
        String mediaAssertions = mediaPage.mediaSection();
        //Assert.assertEquals(currentUrlMedia, Data.expectedUrlMedia, "It's wrong");
        softAssert.assertEquals(mediaAssertions, Data.expectedUrlMedia, "It's wrong");

        WebElement dropDownListMedia = driver.findElement(Locators.DROP_DOWN_LIST_MEDIA);
        /*getDropDownMediaByIndex(dropDownListMedia, 2);*/
        /*getDropDownMediaByText(dropDownListMedia, "Travel(0)");*/
        searchPage.getDropDownListByValue(dropDownListMedia, "1");
        softAssert.assertAll();
    }


    @Test
    public void getSizeOfDropDown(){
        driver.findElement(Locators.LINK_MEDIA).click();
        int sizeOfDropDownListSortByMedia = mediaPage.getSizeDropDownList(Locators.DROP_DOWN_LIST_MEDIA);
        for (int i = 0; i < sizeOfDropDownListSortByMedia; i++) {
            mediaPage.getSizeDropDownList(Locators.DROP_DOWN_LIST_MEDIA);
            searchPage.javaWaitSec(3);
        }
    }
}



