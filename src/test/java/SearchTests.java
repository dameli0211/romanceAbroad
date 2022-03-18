import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchTests extends BaseUi{

    public static final boolean testCase11 = true;
    public static final boolean testCase12 = true;
    public static final boolean testCase13 = true;
    public static final boolean testCase14 = false;


    @Test(priority = 1, enabled = testCase11, groups = {"ie"})
    public void testSearchPageTestCase11(){
        String searchAssertion = searchPage.searchSection();
        Assert.assertEquals(searchAssertion, Data.expectedUrlSearch);

        WebElement dropDownListSortBy = driver.findElement(Locators.DROP_DOWN_LIST_SORT_BY);
        /*getDropDownListByIndex(dropDownListSortBy, 3);*/
        /*getDropDownListByText(Locators.DROP_DOWN_LIST_SORT_BY, "Views");*/
        searchPage.getDropDownListByValue(dropDownListSortBy, "date_created");
    }


    @Test(priority = 2, enabled = testCase12, groups = {"user", "admin"})
    public void checkLinksTestCase12(){
        driver.findElement(Locators.LINK_SEARCH).click();
        searchPage.checkLinksOnWebPage("//a", "//href");
    }

    @Test(priority = 3, enabled = testCase13, groups = {"user", "admin"})
    public void checkActiveLinkstestCase13(){
        driver.findElement(Locators.LINK_SEARCH).click();
        searchPage.verifyLinkActive("https://romanceabroad.com/users/view/360/profile");
    }

    @Test(priority = 3, enabled = testCase14, groups = {"user", "admin"})
    public void selectRandomDropDownListTestCase14(){
        driver.findElement(Locators.LINK_SEARCH).click();
        int sizeOfDropDownListSortBy = searchPage.getSizeDropDownList(Locators.DROP_DOWN_LIST_SORT_BY_AGE);
        for (int i = 0; i < sizeOfDropDownListSortBy; i++) {
            searchPage.selectItemDropDownRandomOption(Locators.DROP_DOWN_LIST_SORT_BY_AGE, "Sort by");
            mainIframePage.javaWaitSec(3);
        }
    }
}
