import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class MediaTests extends BaseUi {

    String currentUrlMedia;


    @Test
    public void testMediaPage() {
        mediaPage.mediaSection();
        currentUrlMedia = driver.getCurrentUrl();
        System.out.println(currentUrlMedia);
        //Assert.assertEquals(currentUrlMedia, Data.expectedUrlMedia, "It's wrong");
        softAssert.assertEquals(currentUrlMedia, Data.expectedUrlMedia, "It's wrong");

        WebElement dropDownListMedia = driver.findElement(Locators.DROP_DOWN_LIST_MEDIA);
        /*getDropDownMediaByIndex(dropDownListMedia, 2);*/
        /*getDropDownMediaByText(dropDownListMedia, "Travel(0)");*/
        searchPage.getDropDownListByValue(dropDownListMedia, "1");
    }


}



