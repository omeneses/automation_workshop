package pages;

import chunks.GalleryOverlay;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageFS {

    @FindBy(xpath = "//div[@class='Gallery Hero-gallery']/button[@class='Button--underlined--dark Gallery-button']/span[@class='Button-label']")
    private WebElement gallery_link;


    //Methods to interact on all page's elements
    public GalleryOverlay goGalleryOverlay(){
        gallery_link.click();
        return new GalleryOverlay();

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
