package pages;

import data.Constant;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.CommonFuntions;

public class InLineCarousel {

    //Methods to interact on all page's elements
    public void clickOnPrevButton(WebDriver driver) throws Exception {
        CommonFuntions.clickOnAnyElement(driver, inLineCarouselPrevButton,Constant.TIME_OUT);
    }

    public void clickOnNextButton(WebDriver driver) throws Exception {
        CommonFuntions.clickOnAnyElement(driver, inLineCarouselNextButton,Constant.TIME_OUT);
    }

    public void clickOnCtaButton(WebDriver driver) throws Exception {
        CommonFuntions.clickOnAnyElement(driver, inLineCarouselCta,Constant.TIME_OUT);
    }

    public AccommodationLanding clickOnRoomCta(WebDriver driver) throws Exception {
        CommonFuntions.clickOnAnyElement(driver, inLineCarouselRoomCTA,Constant.TIME_OUT);
        return new AccommodationLanding();
    }

    public AccommodationLanding clickOnRoomCta(WebDriver driver, int ind) throws Exception {
         CommonFuntions.jsClick(driver,inLineCarouselRoomCTA);
         return new AccommodationLanding();
    }

    public String getHeadingTitleText(WebDriver driver) throws Exception {
        return CommonFuntions.getTextOfAnyElement(driver,inLineCarouselHeadingTitle,Constant.TIME_OUT);
    }

    public String getRoomNameText(WebDriver driver) throws Exception {
        return CommonFuntions.getTextOfAnyElement(driver,inLineCarouselRoomNameTitle,Constant.TIME_OUT);
    }

    public String getRoomDescriptionText(WebDriver driver) throws Exception {
        return CommonFuntions.getTextOfAnyElement(driver,inLineCarouselRoomDescription,Constant.TIME_OUT);
    }

    public String getRoomCTAText(WebDriver driver) throws Exception {
        return CommonFuntions.getTextOfAnyElement(driver,inLineCarouselRoomCTA,Constant.TIME_OUT);
    }

    //Locating all private page's elements
    @FindBy(css = "h2.Heading-title")
    private WebElement inLineCarouselHeadingTitle;

    @FindBy(css = "button.InlineCarousel-prevButton.InlineCarousel-button.Button--prevIcon--light")
    private WebElement inLineCarouselPrevButton;

    @FindBy(css = "button.InlineCarousel-nextButton.InlineCarousel-button.Button--nextIcon--light")
    private WebElement inLineCarouselNextButton;

    @FindBy(css = "a.CTA.CTA--primary--light.InlineCarousel-cta")
    private WebElement inLineCarouselCta;

    @FindBy(xpath = "//li[@class='CarouselSlide is-selected']//div[@class='CtaBlock-title']")
    private WebElement inLineCarouselRoomNameTitle;

    @FindBy(xpath = "//li[@class='CarouselSlide is-selected']//p[@class='CtaBlock-text']")
    private WebElement inLineCarouselRoomDescription;

    @FindBy(xpath = "//li[@class='CarouselSlide is-selected']//div[@class='CtaBlock ImageAndCta-cta']/a")
    private WebElement inLineCarouselRoomCTA;
}
