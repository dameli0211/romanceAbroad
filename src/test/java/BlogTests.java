import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BlogTests extends BaseUi {

    String currentUrlBlog;

    @Test
    public void testBlogPage(){
     blogPage.blogSection();
    currentUrlBlog = driver.getCurrentUrl();
    System.out.println(currentUrlBlog);
    Assert.assertEquals(currentUrlBlog, Data.expectedUrlBlog);
    }

    @Test
    public void blogList(){
         driver.findElement(Locators.LINK_BLOG).click();
        List<String> ele = new ArrayList<>(Arrays.asList("Advertising", "Term of use", "Privacy Policy", "How it works", "Shipping terms", "Travel to Ukraine", "Blog"));
        for(int i=0; i<ele.size(); i++) {
        if(driver.findElement(By.xpath("//ul//a[@href='https://romanceabroad.com/content/view/advertising']")).getText().contains(ele.get(i))){
            driver.findElement(By.xpath("//ul//a[@href='https://romanceabroad.com/content/view/advertising']")).click();
        }
    }
   }
}
