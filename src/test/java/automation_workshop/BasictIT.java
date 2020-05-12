package automation_workshop;


import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utils.CommonFuntions;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class BasictIT extends DriverBase {

//    private ExpectedCondition<Boolean> pageTitleStartsWith(final String searchString){
//        return driver -> driver.getTitle().toLowerCase().startsWith(searchString.toLowerCase());
//    }

//    private void googleExamplethatSearchesFor (final String searchString){
//        WebDriver driver = DriverBase.getDriver();
//        driver.get("http://www.google.com");
//        WebElement searField = driver.findElement(By.name("q"));
//
//        searField.clear();
//        searField.sendKeys(searchString);
//        System.out.println("Page title is: "+ driver.getTitle());
//
//        searField.submit();
//
//        WebDriverWait wait = new WebDriverWait(driver,20, 100);
//        wait.until(pageTitleStartsWith(searchString));
//        System.out.println("Page title is: "+ driver.getTitle());
//    }

//    public void getIframe(String urlUnit) throws InterruptedException {
//        WebDriver driver = DriverBase.getDriver();
//        driver.get(urlUnit);
//        Thread.sleep(10000);
//        final List<WebElement> iframes = driver.findElements(By.tagName("iframe"));
//        System.out.println("numero de Frames es :" + iframes.size());
//        for (WebElement iframe : iframes) {
//            System.out.println("Frame id :" + iframe.getAttribute("id"));
//        }
//    }

    public List<WebElement> getIframes(WebDriver driver) throws InterruptedException {
        List<WebElement> iframesTotal = driver.findElements(By.tagName("iframe"));
        for(WebElement elem:iframesTotal){
            System.out.println("El valor del frame id:" + elem.getAttribute("id"));
        }
        return  iframesTotal;
    }

    private void clickinAllCTAs (String urlUnit) throws InterruptedException {
        WebDriver driver = DriverBase.getDriver();
        driver.get(urlUnit);
        Thread.sleep(15000);

        String firstWinHandle = driver.getWindowHandle();
        List<WebElement> totalUnits = getIframes(driver);
        System.out.println("Total de iframes son:" + totalUnits.size());

        for (int i = 1; i <= totalUnits.size(); i++) {
            String currentFrame = String.format("safe-frame-%d", i);
            driver.switchTo().frame(currentFrame);
            driver.switchTo().frame(0);
            //Check how many CTAs has the unit
            List<WebElement> ctaS = driver.findElements(By.cssSelector("button.cta"));
            System.out.println("El numero de CTAs dentro de la unidad son:" + ctaS.size());
            for (int ind = 1; ind <= ctaS.size(); ind++) {
                String locator = String.format("button.cta.cta-%d", ind);
                WebElement element = driver.findElement(By.cssSelector(locator));
                System.out.println("El valor del CTA al que se la da click es:" + element.getText());
                //JavascriptExecutor jse = (JavascriptExecutor)driver;
                //jse.executeScript("arguments[0].scrollIntoView()", element);
                //jse.executeScript("arguments[0].click()", element);
                //WebDriverWait wait = new WebDriverWait(driver,30, 500);
                //wait.until(ExpectedConditions.elementToBeClickable(element));
                element.sendKeys(Keys.RETURN);//Equivale a hacer click
                //Actions actions = new Actions(driver);
                //actions.moveToElement(element).click().perform();
                String parent = driver.getWindowHandle();
                Set<String> allWindows = driver.getWindowHandles();
                for (String child : allWindows) {
                    if (!parent.equalsIgnoreCase(child)) {
                        driver.switchTo().window(child);
                        Thread.sleep(3000);
                        System.out.println("El title de la pagina abierta es: " + driver.getTitle());
                        System.out.println("La URL de la pagina abierta es: " + driver.getCurrentUrl());
                        driver.close();
                    }
                }
                driver.switchTo().window(firstWinHandle);
                driver.switchTo().frame(currentFrame);
                driver.switchTo().frame(0);
                Thread.sleep(3000);
            }
            driver.switchTo().defaultContent();
        }
        Thread.sleep(5000);
    }

        /*for(int i=0;i<cta_link_list.size();i++){
                System.out.println("la sesion id de la current window es:" +((RemoteWebDriver) driver).getSessionId());
                System.out.println("El valor del indice i es:" +i);

                System.out.println("La URL es: " + driver.getCurrentUrl());

                System.out.println("El valor del CTA en el ciclo es:" +cta_link_list.get(i).getText());

                //WebDriverWait wait = new WebDriverWait(driver,20, 100);
                //wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("span.cta__content")));
                //wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("span.cta__content")));
                cta_link_list.get(i).click();
                System.out.println("Dando click al CTA con texto:" +cta_link_list.get(i).getText());
                Thread.sleep(6000);



                String parent = driver.getWindowHandle();

                Set<String> allWindows = driver.getWindowHandles();

                System.out.println("El numero de windows es:" +allWindows);
                System.out.println("la window parent es:" +parent);
                //handles.remove(firstWinHandle);

                //String winHandle=handles.iterator().next();
                for(String child:allWindows){
                    System.out.println("el hash de la window padre es:" +parent.hashCode());
                    System.out.println("el hash de la child page es:" +child.hashCode());

                    if(!parent.equalsIgnoreCase(child)){
                        driver.switchTo().window(child);
                        System.out.println("El title de la pagina abierta es: " + driver.getTitle());
                        System.out.println("La URL hija es: " + driver.getCurrentUrl());

                        //driver.close();
                    }

                }
                driver.switchTo().window(firstWinHandle);
                System.out.println("la sesion id de la current window es:" +((RemoteWebDriver) driver).getSessionId());

            //cta_link_list = driver.findElements(By.cssSelector("span.cta__content"));


          /*if (winHandle!=firstWinHandle) {

                    //To retrieve the handle of second window, extracting the handle which does not match to first window handle

                    String secondWinHandle = winHandle; //Storing handle of second window handle

                    //Switch control to new window

                    driver.switchTo().window(secondWinHandle);
                    System.out.println("El title de la pagina es: " + driver.getTitle());
                    //handles.remove(secondWinHandle);
                    //driver.close();
                    driver.switchTo().window(firstWinHandle);

                    Thread.sleep(6000);
                    System.out.println("El title de la pagina despues de cambiarse a la primera pagina: " + driver.getTitle());

                }*/
         //driver.switchTo().defaultContent();







    /*@Test
    public void googleCheeseExample(){
        googleExamplethatSearchesFor("Cheese!");
    }*/

    @DataProvider(name = "Urls")

    public static Object[][] urls() throws IOException {

        return new Object[][] { { "https://www.google.com/doubleclick/preview/dynamic/previewsheet/CO_q-gQQkcDjBBjUp9IcIIbhCQ", "Test@123" }, { "https://www.google.com/doubleclick/preview/dynamic/previewsheet/CO_q-gQQkcDjBBjUp9IcIIbhCQ", "Test@123" }};

    }

    // Here we are calling the Data Provider object with its Name
    @Test(dataProvider = "Urls")
    public void clickCTAs(String sUrl, String sPassword) throws InterruptedException {
       // clickinAllCTAs("https://www.google.com/doubleclick/preview/dynamic/previewsheet/CO_q-gQQkcDjBBjUp9IcIIbhCQ");
          clickinAllCTAs(sUrl);
    }

   /* @Test
    public void getIframe() throws InterruptedException {
        getIframe("https://www.google.com/doubleclick/preview/dynamic/previewsheet/CNHo_AQQwMbjBBiVsdIcIJLtCw");
    }*/



}
