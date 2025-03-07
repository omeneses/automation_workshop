package utils;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class CommonFuntions {

    public static WebDriver driver;
    protected static Actions actions;

    public enum driverType{
        firefox, chrome
    }

    public static void createDriver (driverType type){
        switch(type)
        {
            case chrome:
                System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver");
                driver = new ChromeDriver();
                break;

            case firefox:
                System.setProperty("webdriver.gecko.driver","src/test/resources/drivers/geckodriver");
                driver = new FirefoxDriver();
                break;

            default:
                System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver");
                driver = new ChromeDriver();
        }
    }

    public static void clickOnAnyElement(WebDriver driver, WebElement element, Integer timeout) throws Exception {
        WebElement myDynamicElement = (new WebDriverWait(driver, timeout )).until(ExpectedConditions.elementToBeClickable(element));
        myDynamicElement.click();
    }

//    public static void clickOnAnyElement(WebDriver driver, WebElement element, Integer timeout, int ind) throws Exception {
//        WebElement myDynamicElement = (new WebDriverWait(driver, timeout )).until(ExpectedConditions.elementToBeClickable(element));
//        myDynamicElement.click();
//    }

    public static String getTextOfAnyElement(WebDriver driver, WebElement element, Integer timeout) throws Exception {
        WebElement myDynamicElement = (new WebDriverWait(driver, timeout )).until(ExpectedConditions.elementToBeClickable(element));
        return myDynamicElement.getText();
    }
    public static void waitInvisibilityOfAnyElement(WebDriver driver, WebElement element, Integer timeout) throws Exception {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        wait.until(ExpectedConditions.invisibilityOf(element));
    }

    public static void jsClick(WebDriver driver, WebElement element) throws InterruptedException {
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", element);
        Thread.sleep(500);
    }

    public static void waitForElementsToBeVisible(WebDriver driver, List<WebElement> webElements, Integer timeout) throws TimeoutException {
        try {
            WebDriverWait wait = new WebDriverWait(driver, timeout);
            wait.until(ExpectedConditions.visibilityOfAllElements(webElements));
        } catch (TimeoutException e) {
            Assert.fail("TimeoutException: Element(s) " + webElements.subList(0, webElements.size()) + " not visible on page.");
        }
    }

    public static void mousePointerHoverOnListElement(List<WebElement> webElements, int menuItemIndex)
    {
        actions = new Actions(driver);
        actions.moveToElement(webElements.get(menuItemIndex)).build().perform();
    }
}
