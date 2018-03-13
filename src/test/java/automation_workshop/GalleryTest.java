package automation_workshop;

import chunks.GalleryOverlay;

import data.Constant;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import pages.HomePageFS;

import utils.CommonFuntions;

public class GalleryTest extends CommonFuntions implements Constant {


    @Before
    public void before(){

        createDriver(driverType.chrome);
        driver.get(Constant.URL_FS);
        driver.manage().window().maximize();
    }

    @Test
    public void openFirstImage() throws Exception {

        HomePageFS myhomepage = PageFactory.initElements(driver, HomePageFS.class);
        GalleryOverlay mygalleryoverlay = PageFactory.initElements(driver, GalleryOverlay.class);

        myhomepage.goGalleryOverlay();
        Assert.assertEquals("1",mygalleryoverlay.getCurrentPageNumber());

    }

    /*@Test
    public void validateNumberImages() throws Exception {

        HomePageFS myhomepage = PageFactory.initElements(driver, HomePageFS.class);
        GalleryOverlay mygalleryoverlay = PageFactory.initElements(driver, GalleryOverlay.class);

        myhomepage.goGalleryOverlay();
        Assert.assertEquals("1",mygalleryoverlay.getCurrentPageNumber());

    }*/


    @After
    public void after() throws InterruptedException {
         driver.quit();
    }

}
