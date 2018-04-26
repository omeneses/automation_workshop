package automation_workshop;

import data.Constant;
import hooks.BeforeAfterTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import pages.LocationBar;

public class LocationBarComponentTest extends BeforeAfterTest implements Constant {

    @Before
    public void before(){
        BeforeAfterTest.beforeTest() ;
    }

    @After
    public void after() throws InterruptedException {
        BeforeAfterTest.afterTest();
    }

    @Test
    public void checkLocationBarAddresText() throws Exception {
        LocationBar myLocation = PageFactory.initElements(driver, LocationBar.class);
        Assert.assertEquals(Constant.LOCATION_BAR_ADDRESS_TEXT,myLocation.getAddressText(driver));
    }

    @Test
    public void checkLocationBarPhoneNumberText() throws Exception {
        LocationBar myLocation = PageFactory.initElements(driver, LocationBar.class);
        Assert.assertEquals(Constant.LOCATION_BAR_PHONE_NUMBER_TEXT,myLocation.getPhoneNUmberText(driver));
    }

    @Test
    public void checkLocationBarCtaText() throws Exception {
        LocationBar myLocation = PageFactory.initElements(driver, LocationBar.class);
        Assert.assertEquals(Constant.LOCATION_BAR_CTA_TEXT,myLocation.getCtaText(driver));
    }

    @Test
    public void checkPageTitleGettingHerePage() throws Exception {
        LocationBar myLocation = PageFactory.initElements(driver, LocationBar.class);
        String propertyLandingPageTitle = driver.getTitle();
        myLocation.clickOnCta(driver);
        Assert.assertEquals(Constant.GETTING_HERE_PAGE_TITLE,driver.getTitle());
        Assert.assertNotEquals(propertyLandingPageTitle,driver.getTitle());
    }

}
