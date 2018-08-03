package pages;

//Locating all private page's elements

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class ContactUs {

    public void clickLogo() throws Exception {
        logo.click();
    }



    @FindBy(css = "img.logo.img-responsive")
    private WebElement logo;

}
