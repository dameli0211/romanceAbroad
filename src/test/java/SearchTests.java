import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class SearchTests extends BaseUi{



    @Test
    public void testSearchPage(){
        String searchAssertion = searchPage.searchSection();
        Assert.assertEquals(searchAssertion, Data.expectedUrlSearch);

        WebElement dropDownListSortBy = driver.findElement(Locators.DROP_DOWN_LIST_SORT_BY);
        /*getDropDownListByIndex(dropDownListSortBy, 3);*/
        /*getDropDownListByText(Locators.DROP_DOWN_LIST_SORT_BY, "Views");*/
        searchPage.getDropDownListByValue(dropDownListSortBy, "date_created");
    }

    @Test
    public void testListPhoto(){
        searchPage.searchSection();
        List<WebElement> listOfPhotos = driver.findElements(Locators.LIST_OF_PHOTOS);
        System.out.println(listOfPhotos.size());
        for (int i = 0; i <listOfPhotos.size(); i++) {
            listOfPhotos.get(i).click();
            System.out.println(listOfPhotos);
        }
    }
}
