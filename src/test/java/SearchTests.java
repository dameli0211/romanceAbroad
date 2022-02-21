import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

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
    public void checkLinks(){
        driver.findElement(Locators.LINK_SEARCH).click();
        searchPage.checkLinksOnWebPage("//a", "//href");
    }

    @Test
    public void checkActiveLinks(){
        driver.findElement(Locators.LINK_SEARCH).click();
        searchPage.verifyLinkActive("https://romanceabroad.com/users/view/360/profile");
    }

    @Test
    public void selectRandomDropDownList(){
        driver.findElement(Locators.LINK_SEARCH).click();
        int sizeOfDropDownListSortBy = searchPage.getSizeDropDownList(Locators.DROP_DOWN_LIST_SORT_BY_AGE);
        for (int i = 0; i < sizeOfDropDownListSortBy; i++) {
            searchPage.selectItemDropDownRandomOption(Locators.DROP_DOWN_LIST_SORT_BY_AGE, "Sort by");
            mainIframePage.javaWaitSec(3);
        }



    }




}
