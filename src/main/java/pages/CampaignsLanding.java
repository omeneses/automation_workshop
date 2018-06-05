package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.CommonFuntions;

public class CampaignsLanding {
    //Methods to interact on all page's elements
    public FiltersLayout goFiltersLayout(){
        filters_link.click();
        return new FiltersLayout();

    }

    //Locate elements on the page
    @FindBy(xpath = "//div[@class='DestinationCardGrid-filterBarContent']/button[contains(@class,'CTA--underlined--light')]")
    private WebElement filters_link;

}
