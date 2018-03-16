package pages;

import chunks.GalleryOverlay;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageFS {

    //Methods to interact on all page's elements
    public GalleryOverlay goGalleryOverlay(){
        gallery_link.click();
        return new GalleryOverlay();

    }
    //Locating all private page's elements
    @FindBy(xpath = "//div[@class='Gallery Hero-gallery']/button[@class='Button--underlined--dark Gallery-button']/span[@class='Button-label']")
    private WebElement gallery_link;



}
