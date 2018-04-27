package automation_workshop;

import data.Constant;
import hooks.BeforeAfterTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import pages.AccommodationLanding;
import pages.InLineCarousel;

public class InLineCarouselComponentTest extends BeforeAfterTest implements Constant {

    @Before
    public void before(){
        BeforeAfterTest.beforeTest() ;
    }

    @After
    public void after() throws InterruptedException {
        BeforeAfterTest.afterTest();
    }

    @Test
    public void checkCarouselTitleText() throws Exception {
        InLineCarousel myCarousel = PageFactory.initElements(driver, InLineCarousel.class);
        Assert.assertEquals(Constant.INLINECAROUSEL_TITLE,myCarousel.getHeadingTitleText(driver));
    }

    @Test
    public void checkNextButton() throws Exception {
        InLineCarousel myCarousel = PageFactory.initElements(driver, InLineCarousel.class);
        Assert.assertEquals(Constant.INLINECAROUSEL_FIRST_SLIDE_TITLE,myCarousel.getRoomNameText(driver));
        Assert.assertEquals(Constant.INLINECAROUSEL_FIRST_SLIDE_DESC,myCarousel.getRoomDescriptionText(driver));
        myCarousel.clickOnNextButton(driver);
        Assert.assertEquals(Constant.INLINECAROUSEL_SECOND_SLIDE_TITLE,myCarousel.getRoomNameText(driver));
        Assert.assertEquals(Constant.INLINECAROUSEL_SECOND_SLIDE_DESC,myCarousel.getRoomDescriptionText(driver));
        myCarousel.clickOnNextButton(driver);
        Assert.assertEquals(Constant.INLINECAROUSEL_THIRD_SLIDE_TITLE,myCarousel.getRoomNameText(driver));
        Assert.assertEquals(Constant.INLINECAROUSEL_THIRD_SLIDE_DESC,myCarousel.getRoomDescriptionText(driver));
        myCarousel.clickOnNextButton(driver);
        Assert.assertEquals(Constant.INLINECAROUSEL_FIRST_SLIDE_TITLE,myCarousel.getRoomNameText(driver));
        Assert.assertEquals(Constant.INLINECAROUSEL_FIRST_SLIDE_DESC,myCarousel.getRoomDescriptionText(driver));
    }

    @Test
    public void checkPreviousButton() throws Exception {
        InLineCarousel myCarousel = PageFactory.initElements(driver, InLineCarousel.class);
        Assert.assertEquals(Constant.INLINECAROUSEL_FIRST_SLIDE_TITLE,myCarousel.getRoomNameText(driver));
        Assert.assertEquals(Constant.INLINECAROUSEL_FIRST_SLIDE_DESC,myCarousel.getRoomDescriptionText(driver));
        myCarousel.clickOnPrevButton(driver);
        Assert.assertEquals(Constant.INLINECAROUSEL_THIRD_SLIDE_TITLE,myCarousel.getRoomNameText(driver));
        Assert.assertEquals(Constant.INLINECAROUSEL_THIRD_SLIDE_DESC,myCarousel.getRoomDescriptionText(driver));
        myCarousel.clickOnPrevButton(driver);
        Assert.assertEquals(Constant.INLINECAROUSEL_SECOND_SLIDE_TITLE,myCarousel.getRoomNameText(driver));
        Assert.assertEquals(Constant.INLINECAROUSEL_SECOND_SLIDE_DESC,myCarousel.getRoomDescriptionText(driver));
        myCarousel.clickOnPrevButton(driver);
        Assert.assertEquals(Constant.INLINECAROUSEL_FIRST_SLIDE_TITLE,myCarousel.getRoomNameText(driver));
        Assert.assertEquals(Constant.INLINECAROUSEL_FIRST_SLIDE_DESC,myCarousel.getRoomDescriptionText(driver));
    }

    @Test
    public void checkRoomCtaSlide1() throws Exception {
        InLineCarousel myCarousel = PageFactory.initElements(driver, InLineCarousel.class);
        AccommodationLanding myAccommodationLanding = PageFactory.initElements(driver, AccommodationLanding.class);
        Assert.assertEquals(Constant.INLINECAROUSEL_FIRST_SLIDE_TITLE,myCarousel.getRoomNameText(driver));
        Assert.assertEquals(Constant.INLINECAROUSEL_FIRST_SLIDE_DESC,myCarousel.getRoomDescriptionText(driver));
        Assert.assertEquals(Constant.PLP_PAGE_TITLE,driver.getTitle());
        myCarousel.clickOnRoomCta(driver,1);
        Assert.assertEquals(Constant.INLINECAROUSEL_FIRST_SLIDE_PAGE_TITLE,driver.getTitle());
    }

    @Test
    public void checkRoomCtaSlide2() throws Exception {
        InLineCarousel myCarousel = PageFactory.initElements(driver, InLineCarousel.class);
        AccommodationLanding myAccommodationLanding = PageFactory.initElements(driver, AccommodationLanding.class);
        Assert.assertEquals(Constant.PLP_PAGE_TITLE,driver.getTitle());
        myCarousel.clickOnNextButton(driver);
        myCarousel.clickOnRoomCta(driver,1);
        Assert.assertEquals(Constant.INLINECAROUSEL_SECOND_SLIDE_PAGE_TITLE,driver.getTitle());
    }

    @Test
    public void checkRoomCtaSlide3() throws Exception {
        InLineCarousel myCarousel = PageFactory.initElements(driver, InLineCarousel.class);
        AccommodationLanding myAccommodationLanding = PageFactory.initElements(driver, AccommodationLanding.class);
        Assert.assertEquals(Constant.PLP_PAGE_TITLE,driver.getTitle());
        myCarousel.clickOnNextButton(driver);
        myCarousel.clickOnNextButton(driver);
        myCarousel.clickOnRoomCta(driver,1);
        Assert.assertEquals(Constant.INLINECAROUSEL_THIRD_SLIDE_PAGE_TITLE,driver.getTitle());
    }
}
