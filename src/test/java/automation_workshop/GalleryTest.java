package automation_workshop;

import chunks.GalleryOverlay;

import data.Constant;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import pages.hero;

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
        hero myhomepage = PageFactory.initElements(driver, hero.class);
        GalleryOverlay mygalleryoverlay = PageFactory.initElements(driver, GalleryOverlay.class);
        myhomepage.openGalleryOverlay(driver);
        Assert.assertEquals(Constant.FIRST_IMAGE,mygalleryoverlay.getCurrentPageNumber());
    }

    @Test
    public void validateTotalNumberImages() throws Exception {
        hero myhomepage = PageFactory.initElements(driver, hero.class);
        GalleryOverlay mygalleryoverlay = PageFactory.initElements(driver, GalleryOverlay.class);
        myhomepage.openGalleryOverlay(driver);
        Assert.assertEquals(mygalleryoverlay.getTotalNumberImages(),mygalleryoverlay.getSizeGalleryItems(driver));
    }

    @Test
    public void moveToNextImage() throws Exception {
        hero myhomepage = PageFactory.initElements(driver, hero.class);
        GalleryOverlay mygalleryoverlay = PageFactory.initElements(driver, GalleryOverlay.class);
        myhomepage.openGalleryOverlay(driver);
        Assert.assertEquals(Constant.FIRST_IMAGE,mygalleryoverlay.getCurrentPageNumber());
        mygalleryoverlay.moveToNextImage();
        Assert.assertEquals(Constant.SECOND_IMAGE,mygalleryoverlay.getCurrentPageNumber());
        mygalleryoverlay.moveToNextImage();
        Assert.assertEquals(Constant.THIRD_IMAGE,mygalleryoverlay.getCurrentPageNumber());
    }

    @Test
    public void moveToPreviousImage() throws Exception {
        hero myhomepage = PageFactory.initElements(driver, hero.class);
        GalleryOverlay mygalleryoverlay = PageFactory.initElements(driver, GalleryOverlay.class);
        myhomepage.openGalleryOverlay(driver);
        Assert.assertEquals(Constant.FIRST_IMAGE,mygalleryoverlay.getCurrentPageNumber());
        mygalleryoverlay.moveToPreviousImage();
        Assert.assertEquals(Constant.LAST_IMAGE,mygalleryoverlay.getCurrentPageNumber());
        mygalleryoverlay.moveToPreviousImage();
        Assert.assertEquals(Constant.ONE_BEFORE_LAST_IMAGE,mygalleryoverlay.getCurrentPageNumber());
    }

    @Test
    public void closeOverlay() throws Exception {
        hero myhomepage = PageFactory.initElements(driver, hero.class);
        GalleryOverlay mygalleryoverlay = PageFactory.initElements(driver, GalleryOverlay.class);
        myhomepage.openGalleryOverlay(driver);
        mygalleryoverlay.closeGalleryOverlay(driver);
        Assert.assertFalse(mygalleryoverlay.closeButtonIsDisplayed());
        Assert.assertEquals(Constant.GALLERY_LINK_TEXT, myhomepage.getGalleryLinkText(driver));
    }
}
