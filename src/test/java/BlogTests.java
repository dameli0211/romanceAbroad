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
     }


