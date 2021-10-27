import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MainPage {
    String mainUrl="https://romanceabroad.com/";
    WebDriver driver;
    String currentUrlSearch;
    String currentUrlMedia;
    String currentUrlBlog;
    String currentTourRequest;
    String expectedTourRequest = "https://romanceabroad.com/";
    String expectedUrlSearch = "https://romanceabroad.com/users/search";
    String expectedUrlMedia = "https://romanceabroad.com/media/index";
    String expectedCurrentBlog = "https://romanceabroad.com/content/view/blog";
    By LINK_BLOG = By.xpath("//a[@href='https://romanceabroad.com/content/view/blog']");
    By LINK_SEARCH = By.xpath("//a[@href='https://romanceabroad.com/users/search']");
    By LINK_MEDIA = By.cssSelector("a[href='https://romanceabroad.com/media/index']");
    By LINK_SIGN_IN = By.xpath("//a[@href='https://romanceabroad.com/users/login_form']");
    By BUTTTON_REGISTRATION = By.xpath("//button[@id='show-registration-block']");
    By LINK_GIFT = By.xpath("//a[@href='https://romanceabroad.com/store/category-sweets']");
    By LINK_FLOWER_IMG = By.xpath("//a[@href='https://romanceabroad.com/store/sweets/12-flower_basket']");
    By LINK_SPA = By.xpath("//a[@href='https://romanceabroad.com/store/sweets/2-massage_spa']");
    By LINK_BEAR_TOY = By.xpath("//a[@href='https://romanceabroad.com/store/sweets/11-teddy_bear']");
    By LINK_TOUR_UKRAIN = By.xpath("//a[@href='https://romanceabroad.com/store/sweets/20-tour_to_ukraine']");
    By LINK_HOW_WE_WORK = By.xpath("//ul//a[@href='https://romanceabroad.com/content/view/how-it-works']");
    By LINK_REQUEST_TOUR = By.cssSelector("a[href='https://romanceabroad.com/REQUEST_TOUR_INFO+Application_Form.doc']");

    int indexLinkSignIn = 0;
    int indexLinkFlower = 2;



    @BeforeMethod
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(mainUrl);
    }

    @Test
    public void testSearchPage(){
    driver.findElement(LINK_SEARCH).click();
    currentUrlSearch = driver.getCurrentUrl();
    System.out.println(currentUrlSearch);
    Assert.assertEquals(currentUrlSearch, expectedUrlSearch);
    }

    @Test
    public void testMediaPage(){
        driver.findElement(LINK_MEDIA).click();
        currentUrlMedia = driver.getCurrentUrl();
        System.out.println(currentUrlMedia);
        Assert.assertEquals(currentUrlMedia, expectedUrlMedia);
    }

    @Test
    public void testBlogPage(){
        driver.findElement(LINK_BLOG).click();
        currentUrlBlog = driver.getCurrentUrl();
        System.out.println(currentUrlBlog);
        Assert.assertEquals(currentUrlBlog,expectedCurrentBlog);
    }

    @Test
    public void testRequestTour(){
        driver.findElement(LINK_REQUEST_TOUR).click();
        currentTourRequest = driver.getCurrentUrl();
        System.out.println(currentTourRequest);
        Assert.assertEquals(currentTourRequest, expectedTourRequest);
    }



    @Test
    public void testSignIn(){
        driver.findElements(LINK_SIGN_IN).get(indexLinkSignIn).click();
    }
    @Test
    public void testFlower(){
        driver.findElement(LINK_GIFT).click();
        driver.findElements(By.xpath("//a[@href='https://romanceabroad.com/store/sweets/12-flower_basket']")).get(indexLinkFlower).click();

    }
     @Test
    public void testRegistration(){
        driver.findElement(BUTTTON_REGISTRATION).click();
        driver.findElement(By.cssSelector("input#email")).sendKeys("11@gmail.com");
        driver.findElement(By.cssSelector("input#password")).sendKeys("11@gmail.com");
        //driver.findElement(By.xpath("//button[@data-action='next-page'][text()='Next']")).click();
    }

    @Test
    public void testGiftPage(){
        driver.findElement(LINK_GIFT).click();
        driver.findElement(LINK_FLOWER_IMG).click();
        driver.findElement(LINK_SPA).click();
        driver.findElement(LINK_BEAR_TOY).click();
        driver.findElement(LINK_TOUR_UKRAIN).click();

    }

    @Test
    public void testGift2Page(){
        driver.findElement(LINK_GIFT).click();
        driver.findElement(By.cssSelector("input#search_product")).sendKeys("//a[@href='https://romanceabroad.com/store/sweets/11-teddy_bear']");
        driver.findElement(By.xpath("//button[@id='search_friend'][text()='Search']")).click();
    }

    @Test
    public void testHowWeWork(){
        driver.findElement(LINK_HOW_WE_WORK).click();
        driver.findElement(By.xpath("//a[@href='https://romanceabroad.com/content/view/how-it-works']")).click();
        driver.findElement(By.xpath("//a[@href='https://romanceabroad.com/content/view/shipping_terms']")).click();
    }

    @Test
    public void testPhotos(){
        driver.findElement(LINK_MEDIA).click();
        driver.findElement(By.xpath("//a[@href='https://romanceabroad.com/store/category-sweets']")).click();
    }

    @Test
    public void tourToUkraine(){
        driver.findElement(LINK_TOUR_UKRAIN).click();
        driver.findElement(By.cssSelector("input#search_product")).sendKeys("restaurant");
        driver.findElement(By.xpath("//button[@id='search_friend']")).click();
     }




    @AfterMethod
    public void afterActions(){
        driver.quit();
    }
}
