import org.openqa.selenium.By;

public class Locators {

    //registration page
    public static final By BUTTON_NEXT = By.xpath("//button[@data-action='next-page'][text()='Next']");
    public static final By BUTTTON_REGISTRATION = By.xpath("//button[@id='show-registration-block']");
    public static final By TEXT_FIELD_EMAIL= By.cssSelector("input#email");
    public static final By TEXT_FIELD_PASSWORD = By.cssSelector("input#password");
    public static final By TEXT_FIELD_NICKNAME = By.cssSelector("#nickname");
    public static final By TEXT_PHONE = By.cssSelector("input[name='data[phone]']");
    public static final By CHECKBOX_LIST = By.cssSelector("input#confirmation");
    public static final By RADIO_BUTTON_DAY = By.cssSelector("#daySelect");
    public static final By RADIO_BUTTON_DAY_1 = By.xpath("//li[@data-handler='selectDay']//a[text()='2']");
    public static final By RADIO_BUTTON_MONTH = By.cssSelector("#monthSelect");
    public static final By RADIO_BUTTON_MONTH_1 = By.xpath("//li[@data-handler='selectMonth']//a[text()='May']");
    public static final By RADIO_BUTTON_YEAR = By.cssSelector("#yearSelect");
    public static final By RADIO_BUTTON_YEAR_1 = By.xpath("//li[@data-handler='selectYear']//a[text()='2001']");


    //media page
    public static final By LINK_MEDIA = By.cssSelector("a[href='https://romanceabroad.com/media/index']");
    public static final By DROP_DOWN_LIST_MEDIA = By.xpath("//select[@id='album_id']");
    //flower/gift page
    public static final By LINK_GIFT = By.xpath("//a[@href='https://romanceabroad.com/store/category-sweets']");


    //request tour
    public static final By LINK_REQUEST_TOUR = By.cssSelector("a[href='https://romanceabroad.com/REQUEST_TOUR_INFO+Application_Form.doc']");
    public static final By SEARCH_PRODUCT = By.cssSelector("input#search_product");
    public static final By SEARCH_FRIEND_1= By.xpath("//button[@id='search_friend']");
    // search page
    public static final By LINK_SEARCH = By.xpath("//a[@href='https://romanceabroad.com/users/search']");
    public static final By DROP_DOWN_LIST_SORT_BY= By.xpath("//div[@class='form-inline']//select");
    public static final By LIST_OF_PHOTOS = By.xpath("//div[@class='row g-users-gallery']");
    // gifts page
    public static final By LINK_FLOWER_IMG = By.xpath("//a[@href='https://romanceabroad.com/store/sweets/12-flower_basket']");
    public static final By LINK_SPA = By.xpath("//a[@href='https://romanceabroad.com/store/sweets/2-massage_spa']");
    public static final By LINK_BEAR_TOY = By.xpath("//a[@href='https://romanceabroad.com/store/sweets/11-teddy_bear']");
    public static final By LINK_TOUR_UKRAIN = By.xpath("//a[@href='https://romanceabroad.com/store/sweets/20-tour_to_ukraine']");
    public static final By SEARCH_GIFT = By.cssSelector("input#search_product");
    public static final By SEARCH_FRIEND = By.xpath("//button[@id='search_friend'][text()='Search']");
    public static final By LINK_BUSKET_FLOWERS = By.xpath("//a[@href='https://romanceabroad.com/store/sweets/12-flower_basket']");
    public static final By LIST_OF_GIFTS = By.xpath("//div[@class='contrasting-block row g-bestsellers-gallery']");
    public static final By GIFTS_TEXT_BUSKET = By.xpath("//div[text()='Flower basket']");
    public static final By GIFTS_TEXT_SPA = By.xpath("//div[text()='Spa']");
    public static final By GIFTS_TEXT_TEDDY = By.xpath("//div[text()='Teddy bear']");
    //blog page
    public static final By LINK_BLOG = By.xpath("//a[@href='https://romanceabroad.com/content/view/blog']");
    public static final By LINK_LIST_ADVERTISING = By.xpath("//ul//a[@href='https://romanceabroad.com/content/view/advertising']");

    //how we work page
    public static final By LINK_HOW_WE_WORK = By.xpath("//ul//a[@href='https://romanceabroad.com/content/view/how-it-works']");
    public static final By LINK_HOW_WE_WORK_1 = By.xpath("//a[@href='https://romanceabroad.com/content/view/how-it-works']");
    public static final By LINK_HOW_WE_WORK_2 = By.xpath("//a[@href='https://romanceabroad.com/content/view/shipping_terms']");
    public static final By LINK_INFORMATION_LIST = By.xpath("//div[@class='row row-content']//ul//li");
    public static final By LINK_TEXT_ADVERTISING = By.xpath("//div[text()='Advertising']");
    public static final By LINK_TEXT_TERMS_OF_USE = By.xpath("//div[text()='Terms of use']");
    public static final By LINK_TEXT_SHIPPING_TERMS = By.xpath("//div[text()='Shipping terms']");
    public static final By LINK_TEXT_SHIPPING_TERMS_1 = By.xpath("//div[@class='fleft'][text()='Shipping terms']");

    //main page framework
    public static final By IFRAME_TEST = By.xpath("//iframe[@src='https://www.youtube.com/embed/RRECuJzm3IY?start=85']");
    public static final By IFRAME_BUTTON = By.xpath("//button[@class='ytp-large-play-button ytp-button']");
}
