import org.openqa.selenium.By;

public class Locators {

    //registration page
    public static final By BUTTON_NEXT = By.xpath("//button[@data-action='next-page'][text()='Next']");
    public static final By BUTTTON_REGISTRATION = By.xpath("//button[@id='show-registration-block']");
    public static final By TEXT_FIELD_EMAIL= By.cssSelector("input#email");
    public static final By TEXT_FIELD_PASSWORD = By.cssSelector("input#password");
    public static final By TEXT_FIELD_NICKNAME = By.cssSelector("#nickname");
    public static final By TEXT_PHONE = By.cssSelector("input[name='data[phone]']");

    //media page
    public static final By LINK_MEDIA = By.cssSelector("a[href='https://romanceabroad.com/media/index']");

    //flower/gift page
    public static final By LINK_GIFT = By.xpath("//a[@href='https://romanceabroad.com/store/category-sweets']");

    //request tour
    public static final By LINK_REQUEST_TOUR = By.cssSelector("a[href='https://romanceabroad.com/REQUEST_TOUR_INFO+Application_Form.doc']");

    // search page
    public static final By LINK_SEARCH = By.xpath("//a[@href='https://romanceabroad.com/users/search']");

    // gifts page
    public static final By LINK_FLOWER_IMG = By.xpath("//a[@href='https://romanceabroad.com/store/sweets/12-flower_basket']");
    public static final By LINK_SPA = By.xpath("//a[@href='https://romanceabroad.com/store/sweets/2-massage_spa']");
    public static final By LINK_BEAR_TOY = By.xpath("//a[@href='https://romanceabroad.com/store/sweets/11-teddy_bear']");
    public static final By LINK_TOUR_UKRAIN = By.xpath("//a[@href='https://romanceabroad.com/store/sweets/20-tour_to_ukraine']");

    //blog page
    public static final By LINK_BLOG = By.xpath("//a[@href='https://romanceabroad.com/content/view/blog']");

    // search gifts page
    public static final By SEARCH_GIFT = By.cssSelector("input#search_product");
    public static final By SEARCH_FRIEND = By.xpath("//button[@id='search_friend'][text()='Search']");
    public static final By LINK_BUSKET_FLOWERS = By.xpath("//a[@href='https://romanceabroad.com/store/sweets/12-flower_basket']");

    //how we work page
    public static final By LINK_HOW_WE_WORK = By.xpath("//ul//a[@href='https://romanceabroad.com/content/view/how-it-works']");

}
