import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.time.Duration;


   public class BaseUi {
    WebDriver driver;
    WebDriverWait wait;
    String mainUrl="https://romanceabroad.com/";
    SearchPage searchPage;
    RegistrationPage registrationPage;
    FlowersPage flowersPage;
    GiftPage giftPage;
    HowWeWorkPage howWeWorkPage;
    MainIframePage mainIframePage;
    GiftPage2 giftPage2;
    TourToUkrainePage tourToUkrainePage;
    BlogPage blogPage;
    MediaPage mediaPage;
    RequestTourPage requestTourPage;

    @BeforeMethod
    public void setUp(){

        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        searchPage = new SearchPage(driver, wait);
        registrationPage = new RegistrationPage(driver, wait);
        flowersPage = new FlowersPage(driver, wait);
        giftPage = new GiftPage(driver, wait);
        howWeWorkPage = new HowWeWorkPage(driver, wait);
        mainIframePage = new MainIframePage(driver, wait);
        giftPage2 = new GiftPage2(driver, wait);
        tourToUkrainePage = new TourToUkrainePage(driver, wait);
        requestTourPage = new RequestTourPage(driver, wait);
        blogPage = new BlogPage(driver, wait);
        mediaPage = new MediaPage(driver, wait);

        driver.manage().window().maximize();
        driver.get(mainUrl);
    }

    @AfterMethod
    public void afterActions() {

        //driver.quit();


    /*try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        /*Select select = new Select(driver.findElement(By.xpath("//div[@class='form-inline']//select")));
        select.selectByVisibleText("Views");*/
    }
}
