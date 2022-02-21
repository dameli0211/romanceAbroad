import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BlogTests extends BaseUi {



    @Test
    public void testBlogPage(){
     String blogLink = blogPage.blogSection();
    Assert.assertEquals(blogLink, Data.expectedUrlBlog, "Url is wrong");
    }

    @Test
    public void blogList(){
        blogPage.blogLists();
        }

    @Test
    public void getIndexOfBlogList(){
        driver.findElement(Locators.LINK_BLOG).click();
        for (int i = 0; i < 21; i++) {
             //driver.findElement(By.xpath("//ul[@class='nav nav-pills nav-stacked content-pages-tree']//li"));
        }
        blogPage.performClick(By.xpath("//ul[@class='nav nav-pills nav-stacked content-pages-tree']//li"), 3);
    }
}


