package automation_workshop2.selenium_waits_examples;

import com.google.common.base.Function;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

import javax.annotation.Nullable;
import java.util.concurrent.TimeUnit;

public class FluentWaitTestExample {

    public static WebDriver driver;
    public static FluentWait wait;

    @Before
    public void before () throws Exception {
        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
        wait = new FluentWait(driver)
                .withTimeout(30, TimeUnit.SECONDS)
                .pollingEvery(5, TimeUnit.SECONDS)
                .ignoring(NoSuchElementException.class);
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
    }

    @Test
    public void testWomenPageName() throws Exception {

        WebElement womenOptionMenu = (WebElement) wait.until(new Function() {
            @Nullable
            public Object apply(@Nullable Object o) {
                return driver.findElement(By.cssSelector("div[id*=block_top_menu] ul[class*=menu-content] > li > a"));
            }
        });
        womenOptionMenu.click();
        Assert.assertEquals("Women - My Store", driver.getTitle());
    }

    @Test
    public void testWomenPageCategoryName() throws Exception {

        WebElement womenOptionMenu = driver.findElement(By.cssSelector("div[id*=block_top_menu] ul[class*=menu-content] > li > a"));
        womenOptionMenu.click();
        String womenPageCategoryName = (String) wait.until(new Function() {
            @Nullable
            public Object apply(@Nullable Object o) {
                WebElement womenPageCategory = driver.findElement(By.cssSelector("#center_column > div.content_scene_cat > div.content_scene_cat_bg > div.cat_desc > span.category-name"));
                return womenPageCategory.getText();
            }
        });
        Assert.assertEquals("Women", womenPageCategoryName);
    }

    @After
    public void after() throws InterruptedException {
        driver.quit();
    }



}
