package automation_workshop;

import hooks.BeforeAfterTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import pages.ContactUs;
import pages.HeaderPage;
import pages.HomePage;


import static utils.CommonFuntions.driver;

public class ExperitestTest {

    @Before
    public void before(){
        BeforeAfterTest.beforeTest() ;

    }


    @Test
    public void checkClickFuntion() throws Exception {
        HomePage myHomepage = PageFactory.initElements(driver, HomePage.class);
        //myHomepage.clickOnContactUs();
        Thread.sleep(5000);
        Assert.assertEquals("My Store", driver.getTitle());

        boolean result  = in.Visual.verify(driver,"fashiontest");
        if(!result) {
           System.out.println(in.Visual.getLastResultUrl());
        }
    }




    @After
    public void after() throws InterruptedException {
        BeforeAfterTest.afterTest();
    }


}
