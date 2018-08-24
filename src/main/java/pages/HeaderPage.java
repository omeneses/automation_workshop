package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HeaderPage {

    @FindBy (className = "login")
    private WebElement signInLink;

    @FindBy (className = "shop-phone")
    private WebElement shopPhone;

    @FindBy (className = "banner")
    private WebElement headerBanner;

    public void clickOnSignIn() throws Exception{
        signInLink.click();
    }

    public void clickOnBanner() throws Exception{
        headerBanner.click();
    }

    public String getPhoneNumber() throws Exception{
        return shopPhone.getText();
    }


}
