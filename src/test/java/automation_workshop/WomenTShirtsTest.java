package automation_workshop;

import hooks.BeforeAfterTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import pages.WomenMenu;
import pages.HomePage;

import static utils.CommonFuntions.driver;
import static utils.CommonFuntions.*;

public class WomenTShirtsTest {

    @Before
    public void before() throws InterruptedException {
        BeforeAfterTest.beforeTest() ;
    }

    @Test
    public void testTShirtMenuItemName() throws Exception {
        HomePage myHomepage = PageFactory.initElements(driver, HomePage.class);
        WomenMenu womenMenu = PageFactory.initElements(driver, WomenMenu.class);
        myHomepage.getWomenMenu();
        waitForElementsToBeVisible(driver, womenMenu.getWomenMenuList(), 10);
        Assert.assertEquals("T-shirts",womenMenu.getWomenMenuItemNameByIndex(0));
        womenMenu.clickOnWomenMenuItem(0);
    }

    @After
    public void after() throws InterruptedException {
        BeforeAfterTest.afterTest();
    }

}
