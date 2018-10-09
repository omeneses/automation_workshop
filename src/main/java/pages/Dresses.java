package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by jramirez on 8/29/18.
 */
public class Dresses {
    public void clickDresses() throws Exception {
        dresses.click();
    }

    @FindBy(xpath = "//*[@id=\'block_top_menu\']/ul/li[2]/a")
    private WebElement dresses;
}