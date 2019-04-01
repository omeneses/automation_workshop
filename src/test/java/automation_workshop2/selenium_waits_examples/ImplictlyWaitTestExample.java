package automation_workshop2.selenium_waits_examples;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ImplictlyWaitTestExample {

    public static WebDriver driver;

    @Before
    public void before() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
    }

    @Test
    public void testWomenPageName() throws Exception {
        WebElement womenOptionMenu = driver.findElement(By.cssSelector("div[id*=block_top_menu] ul[class*=menu-content] > li > a"));
        womenOptionMenu.click();
        Assert.assertEquals("Women - My Store", driver.getTitle());
    }

    @Test
    public void testWomenPageCategoryName() throws Exception {
        WebElement womenOptionMenu = driver.findElement(By.cssSelector("div[id*=block_top_menu] ul[class*=menu-content] > li > a"));
        womenOptionMenu.click();
        WebElement categoryName = driver.findElement(By.cssSelector("#center_column > div.content_scene_cat > div.content_scene_cat_bg > div.cat_desc > span.category-name"));
        Assert.assertEquals("Women", categoryName.getText());
    }

    @After
    public void after() throws InterruptedException {
        driver.quit();
    }

}
