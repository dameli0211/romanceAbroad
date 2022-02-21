import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class MainPageTest extends BaseUi {


@Test
public void test2() {

  mainIframePage.iframeSection();
  }


  @Test
  public void getMainText(){
    mainIframePage.getAnyTitle();

  }

  @Test
  public void verifyIfLinkIsActive(){

  mainIframePage.verifyLinkActive("https://romanceabroad.com/media/index");
}

@Test
  public void verifyJoinTodayClick(){
    WebElement verifyClick = driver.findElement(By.xpath("//a[@data-action = 'show-registration-block'][text()='JOIN TODAY!']"));
  mainIframePage.ajaxClick(verifyClick);
  }

@Test
  public void verifyCarouselLink(){
  //driver.findElement(By.xpath("//ol[@class='carousel-indicators']"));
  mainIframePage.ajaxClick(By.xpath("//ol[@class='carousel-indicators']//li"), 1);
  }


}
