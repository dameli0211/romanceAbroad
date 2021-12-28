import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchTests extends BaseUi{

     String currentUrlSearch;

    @Test
    public void testSearchPage(){
        searchPage.searchSection();
        currentUrlSearch = driver.getCurrentUrl();
        System.out.println(currentUrlSearch);
        Assert.assertEquals(currentUrlSearch, Data.expectedUrlSearch);

        WebElement dropDownListSortBy = driver.findElement(Locators.DROP_DOWN_LIST_SORT_BY);
        /*getDropDownListByIndex(dropDownListSortBy, 3);*/
        /*getDropDownListByText(Locators.DROP_DOWN_LIST_SORT_BY, "Views");*/
        searchPage.getDropDownListByValue(dropDownListSortBy, "date_created");
    }
}
