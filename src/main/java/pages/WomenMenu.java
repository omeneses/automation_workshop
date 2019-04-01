package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import java.util.List;

public class WomenMenu {

    @FindBy(css = "ul[class*=menu-content] li > ul[class*=submenu-container] li > ul > li > a")
    private List<WebElement> WomenMenuList;

    public List<WebElement> getWomenMenuList() throws Exception {
        return WomenMenuList;
    }

    public  WebElement getWomenMenuListItemByIndex(int index) throws Exception {
        return WomenMenuList.get(index);
    }

    public void clickOnWomenMenuItem(int index) throws Exception{
        WomenMenuList.get(index).click();
    }

    public String getWomenMenuItemNameByIndex(int index) throws Exception{
        return WomenMenuList.get(index).getText();
    }

}
