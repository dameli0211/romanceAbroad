import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class BaseUi {
    WebDriver driver;
    String mainUrl="https://romanceabroad.com/";

    @BeforeMethod
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(mainUrl);
    }

    @AfterMethod
    public void afterActions(){

        //driver.quit();
    }
}
