package automation_workshop;

import hooks.BeforeAfterTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import pages.ContactUs;
import pages.HeaderPage;
import pages.HomePage;

import static utils.CommonFuntions.driver;

public class ContactUsTest {

    @Before
    public void before(){
        BeforeAfterTest.beforeTest() ;
    }


    /*@Test
    public void checkClickFuntion() throws Exception {
        HomePage myHomepage = PageFactory.initElements(driver, HomePage.class);
        myHomepage.clickOnContactUs();
        Thread.sleep(5000);
       // Assert.assertEquals(Constant.LOCATION_BAR_ADDRESS_TEXT,myLocation.getAddressText(driver));
    }

    @Test
    public void checkLinkText() throws Exception {
        HomePage myHomepage = PageFactory.initElements(driver, HomePage.class);
        Thread.sleep(5000);
        Assert.assertEquals("Contact us", myHomepage.getContactUsText());
    }*/

    @Test
    public void enlazarContactUsPage() throws Exception {
        HomePage myHomepage = PageFactory.initElements(driver, HomePage.class);
        ContactUs myContactUsPage = PageFactory.initElements(driver, ContactUs.class);
        myHomepage.getContactUsPage();
        Thread.sleep(2000);
        myContactUsPage.clickLogo();


    }

    @Test
    public void enlazarSignInPage() throws Exception{
        HeaderPage myHeaderPage = PageFactory.initElements(driver, HeaderPage.class);
        Thread.sleep(2000);
        myHeaderPage.clickOnSignIn();
    }

    @After
    public void after() throws InterruptedException {
        BeforeAfterTest.afterTest();
    }


}
