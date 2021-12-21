import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class MainPageTest extends BaseUi {


@Test
public void test2() {

    WebElement ele = driver.findElement(By.xpath("//iframe[@src='https://www.youtube.com/embed/RRECuJzm3IY?start=85']"));
    driver.switchTo().frame(ele);
    driver.findElement(By.xpath("//button[@class='ytp-large-play-button ytp-button']")).click();
}

}
