import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BlogPage extends BaseActions {
    public BlogPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    String currentUrlBlog;

    public String  blogSection() {
        driver.findElement(Locators.LINK_BLOG).click();
        currentUrlBlog = driver.getCurrentUrl();
        System.out.println(currentUrlBlog);
        return currentUrlBlog;
    }


    public void blogLists() {
        driver.findElement(Locators.LINK_BLOG).click();
        List<String> ele = new ArrayList<>(Arrays.asList("Advertising", "Term of use", "Privacy Policy", "How it works", "Shipping terms", "Travel to Ukraine", "Blog"));
        for (int i = 0; i < ele.size(); i++) {
            if (driver.findElement(Locators.LINK_LIST_ADVERTISING).getText().contains(ele.get(i))) {
                driver.findElement(Locators.LINK_LIST_ADVERTISING).click();
            }
        }
    }
}