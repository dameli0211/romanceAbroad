import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BlogTests extends BaseUi {

    String currentUrlBlog;

    @Test
    public void testBlogPage(){
    driver.findElement(Locators.LINK_BLOG).click();
    currentUrlBlog = driver.getCurrentUrl();
    System.out.println(currentUrlBlog);
    Assert.assertEquals(currentUrlBlog, Data.expectedUrlBlog);
    }
}
