package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonFuntions {
    //public static WebDriver driver;
    public static WebDriver driver;


    public enum driverType{
        firefox, chrome
    }

    public static void goToUrl (WebDriver driver, String url, String property){
        driver.get(url + property);
    }

    public static void createDriver (driverType type){
        switch(type)
        {
            case chrome:
                System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver");
                driver = new ChromeDriver();

            case firefox:
                System.setProperty("webdriver.gecko.driver","src/test/resources/drivers/geckodriver");
                DesiredCapabilities capabilities = DesiredCapabilities.firefox();
                capabilities.setCapability("marionette", true);
                driver = new FirefoxDriver(capabilities);
        }
    }

    public static WebDriver getChromeDriver() {
        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver");
        return new ChromeDriver();
    }

    public static void click(WebDriver driver, By by, int timeout) throws Exception {
        WebElement myDynamicElement = (new WebDriverWait(driver, timeout )).until(ExpectedConditions.elementToBeClickable(by));
        myDynamicElement.click();
    }

    public static void jsClick(WebDriver driver, WebElement element){
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", element);
    }


}
