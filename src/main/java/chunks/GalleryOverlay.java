package chunks;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GalleryOverlay {


    //Methods to interact on all page's elements
    public String getCurrentPageNumber(){
        return currentPageNumer.getText();

    }

    public String getNumberImages(){

        return currentPageNumer.getText();

    }


    //Private Elements

    @FindBy(xpath = "//span[@class='Gallery-currentPageNumber']")
    private WebElement currentPageNumer;





}
