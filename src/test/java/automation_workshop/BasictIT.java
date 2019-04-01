package automation_workshop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import utils.CommonFuntions;

public class BasictIT extends DriverBase {

    private ExpectedCondition<Boolean> pageTitleStartsWith(final String searchString){
        return driver -> driver.getTitle().toLowerCase().startsWith(searchString.toLowerCase());
    }

    private void googleExamplethatSearchesFor (final String searchString){
        WebDriver driver = DriverBase.getDriver();
        driver.get("http://www.google.com");
        WebElement searField = driver.findElement(By.name("q"));

        searField.clear();
        searField.sendKeys(searchString);
        System.out.println("Page title is: "+ driver.getTitle());

        searField.submit();

        WebDriverWait wait = new WebDriverWait(driver,20, 100);
        wait.until(pageTitleStartsWith(searchString));
        System.out.println("Page title is: "+ driver.getTitle());
    }

    @Test
    public void googleCheeseExample(){
        googleExamplethatSearchesFor("Cheese!");
    }


    @Test
    public void googleMilkExample(){
        googleExamplethatSearchesFor("Milk!");
    }

    @Test
    public void googleCheeseExample2(){
        googleExamplethatSearchesFor("Cheese!");
    }


    @Test
    public void googleMilkExample2(){
        googleExamplethatSearchesFor("Milk!");
    }

    @Test
    public void googleCheeseExample3(){
        googleExamplethatSearchesFor("Cheese!");
    }


    @Test
    public void googleMilkExample3(){
        googleExamplethatSearchesFor("Milk!");
    }

    @Test
    public void googleCheeseExample4(){
        googleExamplethatSearchesFor("Cheese!");
    }


    @Test
    public void googleMilkExample4(){
        googleExamplethatSearchesFor("Milk!");
    }

    @Test
    public void googleCheeseExample5(){
        googleExamplethatSearchesFor("Cheese!");
    }


    @Test
    public void googleMilkExample5(){
        googleExamplethatSearchesFor("Milk!");
    }

    @Test
    public void googleCheeseExample6(){
        googleExamplethatSearchesFor("Cheese!");
    }


    @Test
    public void googleMilkExample6(){
        googleExamplethatSearchesFor("Milk!");
    }

    @Test
    public void googleCheeseExample7(){
        googleExamplethatSearchesFor("Cheese!");
    }


    @Test
    public void googleMilkExample7(){
        googleExamplethatSearchesFor("Milk!");
    }

    @Test
    public void googleCheeseExample8(){
        googleExamplethatSearchesFor("Cheese!");
    }


    @Test
    public void googleMilkExample8(){
        googleExamplethatSearchesFor("Milk!");
    }

    @Test
    public void googleCheeseExample9(){
        googleExamplethatSearchesFor("Cheese!");
    }


    @Test
    public void googleMilkExample9(){
        googleExamplethatSearchesFor("Milk!");
    }
}
