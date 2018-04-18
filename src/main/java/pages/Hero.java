package pages;

import chunks.GalleryOverlay;
import data.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.CommonFuntions;

public class Hero {
    //Methods to interact on all page's elements
    public GalleryOverlay openGalleryOverlay(WebDriver driver) throws Exception {
        CommonFuntions.clickOnAnyElement(driver,heroGalleryLink,Constant.TIME_OUT);
        return new GalleryOverlay();
    }

    public String getGalleryLinkText(WebDriver driver) throws Exception {
        return CommonFuntions.getTextOfAnyElement(driver,heroGalleryLink,Constant.TIME_OUT);
    }

    public String getHeroEyebrowText(WebDriver driver) throws Exception {
        return CommonFuntions.getTextOfAnyElement(driver,heroEyebrow,Constant.TIME_OUT);
    }

    public String getHeroTitleText(WebDriver driver) throws Exception {
        return CommonFuntions.getTextOfAnyElement(driver,heroTitle,Constant.TIME_OUT);
    }

    public String getHeroDescriptionText(WebDriver driver) throws Exception {
        return CommonFuntions.getTextOfAnyElement(driver,heroDescription,Constant.TIME_OUT);
    }

     //Locating all private page's elements
    @FindBy(xpath = "//div[@class='Gallery Hero-gallery']/button[@class='Button--underlined--dark Gallery-button']/span[@class='Button-label']")
    private WebElement heroGalleryLink;

    @FindBy(css = "span.Heading-eyebrow")
    private WebElement heroEyebrow;

    @FindBy(css = "h1.Heading-title")
    private WebElement heroTitle;

    @FindBy(css = "span.Heading-subtitle")
    private WebElement heroDescription;
}
