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

    @After
    public void after() throws InterruptedException {
        driver.quit();
    }

    @Test
    public void openFirstImage() throws Exception {
        HomePageFS myhomepage = PageFactory.initElements(driver, HomePageFS.class);
        GalleryOverlay mygalleryoverlay = PageFactory.initElements(driver, GalleryOverlay.class);
        myhomepage.goGalleryOverlay(driver);
        Assert.assertEquals(Constant.FIRST_IMAGE,mygalleryoverlay.getCurrentPageNumber());
    }

    @Test
    public void validateTotalNumberImages() throws Exception {
        HomePageFS myhomepage = PageFactory.initElements(driver, HomePageFS.class);
        GalleryOverlay mygalleryoverlay = PageFactory.initElements(driver, GalleryOverlay.class);
        myhomepage.goGalleryOverlay(driver);
        Assert.assertEquals(mygalleryoverlay.getTotalNumberImages(),mygalleryoverlay.getSizeGalleryItems(driver));
    }

    @Test
    public void moveToNextImage() throws Exception {
        HomePageFS myhomepage = PageFactory.initElements(driver, HomePageFS.class);
        GalleryOverlay mygalleryoverlay = PageFactory.initElements(driver, GalleryOverlay.class);
        myhomepage.goGalleryOverlay(driver);
        Assert.assertEquals(Constant.FIRST_IMAGE,mygalleryoverlay.getCurrentPageNumber());
        mygalleryoverlay.moveToNextImage();
        Assert.assertEquals(Constant.SECOND_IMAGE,mygalleryoverlay.getCurrentPageNumber());
        mygalleryoverlay.moveToNextImage();
        Assert.assertEquals(Constant.THIRD_IMAGE,mygalleryoverlay.getCurrentPageNumber());
    }

    @Test
    public void moveToPreviousImage() throws Exception {
        HomePageFS myhomepage = PageFactory.initElements(driver, HomePageFS.class);
        GalleryOverlay mygalleryoverlay = PageFactory.initElements(driver, GalleryOverlay.class);
        myhomepage.goGalleryOverlay(driver);
        Assert.assertEquals(Constant.FIRST_IMAGE,mygalleryoverlay.getCurrentPageNumber());
        mygalleryoverlay.moveToPreviousImage();
        Assert.assertEquals(Constant.LAST_IMAGE,mygalleryoverlay.getCurrentPageNumber());
        mygalleryoverlay.moveToPreviousImage();
        Assert.assertEquals(Constant.ONE_BEFORE_LAST_IMAGE,mygalleryoverlay.getCurrentPageNumber());
    }

    @Test
    public void closeOverlay() throws Exception {
        HomePageFS myhomepage = PageFactory.initElements(driver, HomePageFS.class);
        GalleryOverlay mygalleryoverlay = PageFactory.initElements(driver, GalleryOverlay.class);
        myhomepage.goGalleryOverlay(driver);
        mygalleryoverlay.closeGalleryOverlay(driver);
        Assert.assertFalse(mygalleryoverlay.closeButtonIsDisplayed());
        Assert.assertEquals(Constant.GALLERY_LINK_TEXT, myhomepage.getGalleryLinkText(driver));
    }
}
