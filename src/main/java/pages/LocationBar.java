package pages;

import data.Constant;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.CommonFuntions;

public class LocationBar {

    //Methods to interact on all page's elements
    public void dialPhoneNumber(WebDriver driver) throws Exception {
        CommonFuntions.clickOnAnyElement(driver, locationBarPhone,Constant.TIME_OUT);
    }

    public void clickOnCta(WebDriver driver) throws Exception {
        CommonFuntions.clickOnAnyElement(driver, locationBarCta,Constant.TIME_OUT);
    }

    public String getAddressText(WebDriver driver) throws Exception {
        return CommonFuntions.getTextOfAnyElement(driver, locationBarAddress,Constant.TIME_OUT);
    }

    public String getPhoneNUmberText(WebDriver driver) throws Exception {
        return CommonFuntions.getTextOfAnyElement(driver, locationBarPhone,Constant.TIME_OUT);
    }

    public String getCtaText(WebDriver driver) throws Exception {
        return CommonFuntions.getTextOfAnyElement(driver, locationBarCta,Constant.TIME_OUT);
    }

    //Locating all private page's elements
    @FindBy(css = "address.LocationBar-address")
    private WebElement locationBarAddress;

    @FindBy(css = "a.phone.LocationBar-phone")
    private WebElement locationBarPhone;

    @FindBy(css = "a.CTA.CTA--underlined--light.LocationBar-cta")
    private WebElement locationBarCta;
}
