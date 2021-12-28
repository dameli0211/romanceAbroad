import org.testng.Assert;
import org.testng.annotations.Test;

public class BlogTests extends BaseUi {

    String currentUrlBlog;

    @Test
    public void testBlogPage(){
    currentUrlBlog = driver.getCurrentUrl();
    System.out.println(currentUrlBlog);
    Assert.assertEquals(currentUrlBlog, Data.expectedUrlBlog);
    blogPage.blogSection();
    }
}
