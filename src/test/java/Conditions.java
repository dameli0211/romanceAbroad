import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Conditions extends BaseUi {
    @Test
    public void test1(){
        String fruit1 = "kiwi";
        String fruit2 = "kiwi";

        if(fruit1.contains("kiwi") || fruit2.contains("orange")){
            System.out.println("We can find our fruit!");
        }

        else {
            Assert.fail("We can't find fruit");
        }
    }
    @Test
    public void test2(){
        int number = 10;
        int sum;
        if(number==10+5){
            sum = 95+100;
        } else {
            sum = 100 - 95;
        }
        System.out.println(sum);
    }

   /* @Test
    public void test3(){
        boolean requirement = true;

        if(!requirement){
            System.out.println("Boolean is true");
        }
        else {
            Assert.fail("Boolean is false");
        }
    }*/

    /*@Test
    public void test4(){
        WebElement tabSearch = driver.findElement(Locators.LINK_SEARCH);

        if(tabSearch.getText().contains("PRETTY WOMEN")) {
            tabSearch.click();
        } else {
            Assert.fail("We can't find Pretty Woman tab");
        }
    }*/

    /*@Test
    public void test5(){
        WebElement tabSearch = driver.findElement(Locators.LINK_SEARCH);

        if (tabSearch.isDisplayed()){
            tabSearch.click();
        } else {
            Assert.fail("We can't find Pretty Woman tab");
        }
    }*/

    /*@Test
    public void test6(){
        List<String> crunchifyList1 = new ArrayList<>(Arrays.asList("kiwi", "orange", "melon"));
        String element = crunchifyList1.get(0);
        System.out.println(element);
    }*/
    /*@Test
    public void test7(){
        List<String> crunchifyList1 = new ArrayList<>(Arrays.asList("kiwi", "orange", "melon"));

        if(crunchifyList1.contains("orange")){
            System.out.println(crunchifyList1);
        }
    }*/

    /*@Test
    public void test7(){
        List<Integer> crunchifyList1 = new ArrayList<>(Arrays.asList(5, 10, 19));
        int sum = crunchifyList1.get(1)+crunchifyList1.get(2);
        System.out.println(sum);
    }*/
    @Test
    public void test8(){
        List<WebElement> links = driver.findElements(By.xpath("//ul[@class='navbar-nav']//li"));
        System.out.println(links.size());
        for (int i = 0; i < links.size() ; i++) {
        String info = links.get(i).getText();
            System.out.println(info);
            links.get(i).click();
            driver.get(Data.mainUrl);
            links = driver.findElements(By.xpath("//ul[@class='navbar-nav']//li"));
        }
    }

}
