package pages;

import data.Constant;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.CommonFuntions;

public class AccommodationLanding {

    //Methods to interact on all page's elements
    public String getHeadingTitleText(WebDriver driver) throws Exception {
        return CommonFuntions.getTextOfAnyElement(driver, inLineCarouselHeadingTitle, Constant.TIME_OUT);
    }

    //Locating all private page's elements
    @FindBy(css = "h1.Heading-title")
    private WebElement inLineCarouselHeadingTitle;
}
