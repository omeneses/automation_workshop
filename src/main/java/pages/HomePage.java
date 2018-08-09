package pages;

//Locating all private page's elements

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomePage {

    public void clickOnContactUs() throws Exception {
        contactUsLink.click();
    }

    public String getContactUsText() throws Exception {
        return contactUsLink.getText();
    }

    public ContactUs getContactUsPage() throws Exception {
        contactUsLink.click();
        return new ContactUs();
    }

    @FindBy(id = "contact-link")
    private WebElement contactUsLink;

}
