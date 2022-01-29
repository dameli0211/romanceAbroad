import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class HowWeWorkPage extends BaseActions {
    public HowWeWorkPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void howWeWorkSection() {
        driver.findElement(Locators.LINK_HOW_WE_WORK).click();
        driver.findElement(Locators.LINK_HOW_WE_WORK_1).click();
        driver.findElement(Locators.LINK_HOW_WE_WORK_2).click();
    }


    public void tabsSection() {
        driver.findElement(Locators.LINK_HOW_WE_WORK).click();
        List<WebElement> tabs = driver.findElements(Locators.LINK_INFORMATION_LIST);
        System.out.println(tabs.size());
    }
}
