package pages;

//Locating all private page's elements

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static utils.CommonFuntions.*;



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

    public void clickOnMenuItem(int index){

        mainMenuContent.get(index).click();
    }

    public String getMenuItemNameByIndex(int index){

        return mainMenuContent.get(index).getText();
    }

    public WomenMenu getWomenMenu() throws Exception {
        mousePointerHoverOnListElement(mainMenuContent,0);
        return new WomenMenu();
    }

    @FindBy(id = "contact-link")
    private WebElement contactUsLink;

    @FindBy(css = "div[id*=block_top_menu] ul[class*=menu-content] > li > a")
    private List<WebElement> mainMenuContent;


}
