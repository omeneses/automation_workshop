package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageTravelocity {

    @FindBy(xpath = "//li[@class='tab']/button[@data-route='/Flights']")
    private WebElement flights_icon;

    @FindBy(xpath = "//li[@class='tab']/button[@data-route='/Hotels']")
    private WebElement hotels_icon;


    @FindBy(xpath = "//li[@class='tab']/button[@data-route='/Vacation-Packages']")
    private WebElement package_icon;

    @FindBy(xpath = "//li[@class='tab']/button[@data-route='/Cars']")
    private WebElement cars_icon;

    @FindBy(xpath = "//li[@class='tab']/button[@data-route='/Cruises']")
    private WebElement cruises_icon;

    @FindBy(xpath = "//li[@class='tab']/button[@data-route='/Activities']")
    private WebElement activities_icon;

    @FindBy(xpath = "//li[@class='tab gcw-disabled-mobile-350']/button[@data-lob='openSearch']")
    private WebElement discover_icon;




    //Methods to interact on all page's elements
    public void goFlights(){
        flights_icon.click();

    }

    public void goHotels(){
        hotels_icon.click();

    }

    public void goFlightAndHotel(){
        package_icon.click();

    }

    public void goCars(){
        cars_icon.click();

    }

    public void goCruises(){
        cruises_icon.click();

    }

    public void goActivities(){
        activities_icon.click();

    }

    public void goDiscover(){
        discover_icon.click();

    }


   /* public void closeOverlay(WebDriver driver) throws Exception {
        CommonFuntions.click(driver, By.xpath("//button[@class='Button--close--dark Overlay-closeButton']"), 20);


        //nav_overlay_close_button.click();

    }


    public String get_eyebrow_text(){
        //String eyebrowtext = nav_overlay_eyebrow.getText();
        //return eyebrowtext;
        return nav_overlay_eyebrow.getText();

    }

    public String get_name_text(){
        return nav_overlay_name.getText();

    }*/


}
