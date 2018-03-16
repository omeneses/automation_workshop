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
        Thread.sleep(2000);
        Assert.assertEquals("1",mygalleryoverlay.getCurrentPageNumber());

    }

    @Test
    public void validateTotalNumberImages() throws Exception {

        HomePageFS myhomepage = PageFactory.initElements(driver, HomePageFS.class);
        GalleryOverlay mygalleryoverlay = PageFactory.initElements(driver, GalleryOverlay.class);

        myhomepage.goGalleryOverlay();
        Thread.sleep(2000);
        Assert.assertEquals(mygalleryoverlay.getTotalNumberImages(),mygalleryoverlay.getSizeGalleryItems(driver));

    }


    @Test
    public void moveToNextImage() throws Exception {

        HomePageFS myhomepage = PageFactory.initElements(driver, HomePageFS.class);
        GalleryOverlay mygalleryoverlay = PageFactory.initElements(driver, GalleryOverlay.class);

        myhomepage.goGalleryOverlay();
        Thread.sleep(2000);
        Assert.assertEquals("1",mygalleryoverlay.getCurrentPageNumber());
        mygalleryoverlay.moveToNextImage();
        Assert.assertEquals("2",mygalleryoverlay.getCurrentPageNumber());
        mygalleryoverlay.moveToNextImage();
        Assert.assertEquals("3",mygalleryoverlay.getCurrentPageNumber());

    }

    @Test
    public void moveToPreviousImage() throws Exception {

        HomePageFS myhomepage = PageFactory.initElements(driver, HomePageFS.class);
        GalleryOverlay mygalleryoverlay = PageFactory.initElements(driver, GalleryOverlay.class);

        myhomepage.goGalleryOverlay();
        Thread.sleep(2000);
        Assert.assertEquals("1",mygalleryoverlay.getCurrentPageNumber());
        mygalleryoverlay.moveToPreviousImage();
        Assert.assertEquals("10",mygalleryoverlay.getCurrentPageNumber());
        mygalleryoverlay.moveToPreviousImage();
        Assert.assertEquals("9",mygalleryoverlay.getCurrentPageNumber());

    }

    @After
    public void after() throws InterruptedException {
         driver.quit();
    }

}
