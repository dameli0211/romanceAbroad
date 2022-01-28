import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

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

    @Test
    public void testListPhoto(){
        driver.findElement(Locators.LINK_SEARCH).click();
        List<WebElement> listOfPhotos = driver.findElements(By.xpath("//div[@class='row g-users-gallery']"));
        System.out.println(listOfPhotos.size());
        for (int i = 0; i <listOfPhotos.size(); i++) {
            listOfPhotos.get(i).click();
            System.out.println(listOfPhotos);
        }
    }

    @Test
    public void mainPage(){
        List<WebElement> mainP = driver.findElements(By.xpath("//nav[@id='mainNav']"));
        for (int i = 0; i <mainP.size(); i++) {
            if(mainP.get(i).getText().contains("PRETTY WOMEN")){
            searchPage.searchSection();
            }
        }

    }
}
