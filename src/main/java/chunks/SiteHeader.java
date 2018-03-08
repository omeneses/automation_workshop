package chunks;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SiteHeader {

    @FindBy(xpath = "//button[@id='header-account-menu']")
    private WebElement account_link;

    @FindBy(xpath = "//a[@id='header-history']")
    private WebElement my_list_link;

    @FindBy(xpath = "//a[@id='header-itineraries']")
    private WebElement my_trips_link;

    @FindBy(xpath = "//button[@id='header-support-menu']")
    private WebElement support_link;



    //Methods to interact on all page's elements
    public void selectAccountOption(){
        account_link.click();

    }

    public void selectMyListLink(){
        my_list_link.click();

    }

    public void selectMyTripsLink(){
        my_trips_link.click();

    }
    public void selectSupportLink(){
        support_link.click();

    }

}
