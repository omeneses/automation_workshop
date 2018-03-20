package chunks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class GalleryOverlay {

    //Methods to interact on all page's elements
    public String getCurrentPageNumber(){
        return currentPageNumer.getText();

    }

    public String getTotalNumberImages(){
        return totalPageNumer.getText();
    }

    public String getSizeGalleryItems(WebDriver driver){
        List<WebElement> categoryList = new ArrayList<WebElement>();
        String locator = "//figure[@class='GalleryItem GalleryItem--image Gallery-slide']";
        categoryList = driver.findElements(By.xpath(locator));
        return Integer.toString(categoryList.size());
    }

    public void moveToPreviousImage(){
        nextPreviousButton.click();
    }

    public void moveToNextImage(){
        nextImageButton.click();
    }

    public void closeGalleryOverlay() throws Exception {
          closeOverlayButton.click();
          Thread.sleep(2000);
    }

    public Boolean closeButtonIsDisplayed(){
        return closeOverlayButton.isDisplayed();
    }


    //Locating all Private Elements
    @FindBy(xpath = "//span[@class='Gallery-currentPageNumber']")
    private WebElement currentPageNumer;

    @FindBy(xpath = "//span[@class='Gallery-totalPages']")
    private WebElement totalPageNumer;

    @FindBy(xpath = "//button[@class='Gallery-prevButton Gallery-navigationButton Button--prevIcon--light']")
    private WebElement nextPreviousButton;

    @FindBy(xpath = "//button[@class='Gallery-nextButton Gallery-navigationButton Button--nextIcon--light']")
    private WebElement nextImageButton;

    @FindBy(xpath = "//button[@class='Button--close--light Gallery-closeButton']")
    private WebElement closeOverlayButton;


}
