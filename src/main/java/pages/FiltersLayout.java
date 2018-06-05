package pages;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.CommonFuntions;

import java.util.ArrayList;
import java.util.List;
import static utils.CommonFuntions.jsClick;

public class FiltersLayout {

    //Methods to interact with Experiences
    public void selectExperienceCalebParty(WebDriver driver) throws Exception {
        CommonFuntions.clickOnAnyElement(driver, checkbox_caleb_party, 20);
    //  text_caleb_party.click();
    }

    public boolean statusExperienceCalebPartyCheckbox() throws InterruptedException {
        return  checkbox_caleb_party.isSelected();
    }

    public void selectExperienceCosmopolitanPlayground() throws InterruptedException {
        text_experience_cosmopolitan_playground.click();
    }

    public boolean statusExperienceCosmopolitanPlaygroundCheckbox() throws InterruptedException {
        return  checkbox_cosmopolitan_playground.isSelected();
    }

    public void selectExperienceCulturalAndCulinaryHeavens() throws InterruptedException {
        text_cultural_and_culinary_heavens.click();
    }

    public boolean statusExperienceCulturalAndCulinaryHeavensCheckbox() throws InterruptedException {
        return  checkbox_cultural_and_culinary_heavens.isSelected();
    }

    public void selectExperienceAmericanCharm() throws InterruptedException {
        text_experience_american_charm.click();
    }

    public boolean statusExperienceAmericanCharmCheckbox() throws InterruptedException {
        return  checkbox_experience_american_charm.isSelected();
    }

    public void selectExperienceAdventureAwaits() throws InterruptedException {
        text_experience_adventure_awaits.click();
    }

    public boolean statusExperienceAdventureAwaitsCheckbox() throws InterruptedException {
        return  checkbox_experience_adventure_awaits.isSelected();
    }
    public void selectExperienceRevealInThePast() throws InterruptedException {
        text_experience_revel_past_journey_present.click();
    }

    public boolean statusExperienceRevealInThePastCheckbox() throws InterruptedException {
        return  checkbox_experience_revel_past_journey_present.isSelected();
    }
    public void selectExperienceExoticScapes() throws InterruptedException {
        text_experience_exotic_scapes.click();
    }

    public boolean statusExperienceExoticScapesCheckbox() throws InterruptedException {
        return  checkbox_experience_exotic_scapes.isSelected();
    }
    public void selectExperienceIconicCities() throws InterruptedException {
        text_experience_iconic_cities.click();
    }

    public boolean statusExperienceIconicCitiesCheckbox() throws InterruptedException {
        return  checkbox_experience_iconic_cities.isSelected();
    }


    //Methods to interact with Regions
    public void selectRegionNorthAmerica() throws InterruptedException {
        text_region_north_america.click();
    }

    public boolean statusRegionNorthAmericaCheckbox() throws InterruptedException {
        return  checkbox_region_north_america.isSelected();
    }

    public void selectRegionMiddleEastAndAfrica() throws InterruptedException {
        text_region_middle_east_and_africa.click();
    }

    public boolean statusRegionMiddleEastAndAfricaCheckbox() throws InterruptedException {
        return  checkbox_region_middle_east_and_africa.isSelected();
    }

    public void selectRegionAsiaPacific() throws InterruptedException {
        text_region_asia_pacific.click();
    }

    public boolean statusRegionRegionAsiaPacificCheckbox() throws InterruptedException {
        return  checkbox_region_asia_pacific.isSelected();
    }


    //Methods to interact with Property Types
    public void selectPropertyTypeHotel() throws InterruptedException {
        text_property_type_hotel.click();
    }

    public boolean statusPropertyTypeHotelCheckbox() throws InterruptedException {
        return  checkbox_property_type_hotel.isSelected();
    }

    public void selectPropertyTypeResort() throws InterruptedException {
        text_property_type_resort.click();
    }

    public boolean statusPropertyTypeResortCheckbox() throws InterruptedException {
        return  checkbox_property_type_resort.isSelected();
    }

    public void selectPropertyTypeResidenceRental() throws InterruptedException {
        text_property_type_rental.click();
    }

    public boolean statusPropertyTypeResidenceRentalCheckbox() throws InterruptedException {
        return  checkbox_property_type_rental.isSelected();
    }

    public void selectPropertyTypeUrban() throws InterruptedException {
        text_property_type_urban.click();
    }

    public boolean statusPropertyTypeUrbanCheckbox() throws InterruptedException {
        return  checkbox_property_type_urban.isSelected();
    }



    //Method to select all elements on Regions category
    public void selectAllElementsOfCategory(WebDriver driver, String category) throws InterruptedException {
        //Thread.sleep(2000);
        //WebDriverWait wait = new WebDriverWait(driver, 10);
        //wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@data-category='propertyType'][@data-filter='hotel']//label[@class='Checkbox-label']")));

        List<WebElement> category_list = new ArrayList<WebElement>();
        String locator = "label[class = 'Checkbox-decoration'][for *= 'fourseasons:global-data/"+category + "']";
//        String locator = "//div[@data-category='"+category + "']";
        category_list = driver.findElements(By.cssSelector(locator));
        System.out.println("el tamaño de la categoria es:"+category_list.size());
        System.out.println("expath es:"+locator);
        //category_list = driver.findElements(By.locator("//div[@data-category='region']"));

        for(int i=0;i<category_list.size();i++) {
            Thread.sleep(500);
            System.out.println("el valor de la category es:"+category_list.get(i).getText());
            //category_list = driver.findElements(By.locator("//div[@data-category='region']"));
            jsClick(driver, category_list.get(i));
            //CommonFuntions.clickOnAnyElement(driver, category_list.get(i),20000);
            System.out.println("el checkbox esta seleccionado despues de darle click?" +category_list.get(i).isSelected());

        }
    }


    public void validateAllElementsOfCategory(WebDriver driver, String category, boolean ExpectedBooleanValue) throws InterruptedException {
        //Thread.sleep(2000);
        //WebDriverWait wait = new WebDriverWait(driver, 10);
        //wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@data-category='propertyType'][@data-filter='hotel']//label[@class='Checkbox-label']")));
        boolean status = ExpectedBooleanValue;
        List<WebElement> category_list2 = new ArrayList<WebElement>();
        String locator = "label[class = 'Checkbox-decoration'][for *= 'fourseasons:global-data/"+category + "']";
        //        String locator = "//div[@data-category='"+category + "']";
        category_list2 = driver.findElements(By.cssSelector(locator));
        System.out.println("el tamaño de la categoria es:"+category_list2.size());
        System.out.println("expath es:"+locator);
        //category_list = driver.findElements(By.locator("//div[@data-category='region']"));

        for(int i=0;i<category_list2.size();i++) {
            //Thread.sleep(1000);
            System.out.println("el valor de status antes de validar es:" +status);
            System.out.println("el checkbox esta seleccionado antes de validar?" +category_list2.get(i).isSelected());
            Assert.assertEquals(status,category_list2.get(i).isSelected());
            System.out.println("el valor de la category es:"+category_list2.get(i).getText());
            System.out.println("el checkbox esta seleccionado?" +category_list2.get(i).isSelected());
            System.out.println("el valor de status es:" +status);


            //category_list = driver.findElements(By.locator("//div[@data-category='region']"));
            //jsClick(driver, category_list.get(i));

        }
    }


    //locate all checkboxes for Experiences
    @FindBy(xpath = "//label[@class='Checkbox-label'][@for='fourseasons:global-data/marketing-campaigns/caleb-party']")
    private WebElement text_caleb_party;

    @FindBy(xpath = "//label[@class='Checkbox-decoration'][@for='fourseasons:global-data/marketing-campaigns/caleb-party']")
    private WebElement checkbox_caleb_party;

    @FindBy(xpath = "//label[@class='Checkbox-label'][@for='fourseasons:global-data/marketing-campaigns/cosmopolitan-playground']")
    private WebElement text_experience_cosmopolitan_playground;

    @FindBy(xpath = "//label[@class='Checkbox-decoration'][@for='fourseasons:global-data/marketing-campaigns/cosmopolitan-playground']")
    private WebElement checkbox_cosmopolitan_playground;


    @FindBy(xpath = "//label[@class='Checkbox-label'][@for='fourseasons:global-data/marketing-campaigns/cultural-culinary-heaves")
    private WebElement text_cultural_and_culinary_heavens;

    @FindBy(xpath = "//label[@class='Checkbox-decoration'][@for='fourseasons:global-data/marketing-campaigns/cultural-culinary-heaves']")
    private WebElement checkbox_cultural_and_culinary_heavens;

    @FindBy(xpath = "//label[@class='Checkbox-label'][@for='fourseasons:global-data/marketing-campaigns/american-charm")
    private WebElement text_experience_american_charm;

    @FindBy(xpath = "//label[@class='Checkbox-decoration'][@for='fourseasons:global-data/marketing-campaigns/american-charm']")
    private WebElement checkbox_experience_american_charm;

    @FindBy(xpath = "//label[@class='Checkbox-label'][@for='fourseasons:global-data/marketing-campaigns/american-charm")
    private WebElement text_experience_adventure_awaits;

    @FindBy(xpath = "//label[@class='Checkbox-decoration'][@for='fourseasons:global-data/marketing-campaigns/american-charm']")
    private WebElement checkbox_experience_adventure_awaits;

    @FindBy(xpath = "//label[@class='Checkbox-label'][@for='fourseasons:global-data/marketing-campaigns/revel-past-journey-present")
    private WebElement text_experience_revel_past_journey_present;

    @FindBy(xpath = "//label[@class='Checkbox-decoration'][@for='fourseasons:global-data/marketing-campaigns/revel-past-journey-present']")
    private WebElement checkbox_experience_revel_past_journey_present;

    @FindBy(xpath = "//label[@class='Checkbox-label'][@for='fourseasons:global-data/marketing-campaigns/exotic-scapes")
    private WebElement text_experience_exotic_scapes;

    @FindBy(xpath = "//label[@class='Checkbox-decoration'][@for='fourseasons:global-data/marketing-campaigns/exotic-scapes']")
    private WebElement checkbox_experience_exotic_scapes;

    @FindBy(xpath = "//label[@class='Checkbox-label'][@for='fourseasons:global-data/marketing-campaigns/iconic-cities")
    private WebElement text_experience_iconic_cities;

    @FindBy(xpath = "//label[@class='Checkbox-decoration'][@for='fourseasons:global-data/marketing-campaigns/iconic-cities']")
    private WebElement checkbox_experience_iconic_cities;


    //locate all checkboxes for Regions
    @FindBy(xpath = "//label[@class='Checkbox-label'][@for='fourseasons:global-data/regions/north-america")
    private WebElement text_region_north_america;

    @FindBy(xpath = "//label[@class='Checkbox-decoration'][@for='fourseasons:global-data/regions/north-america']")
    private WebElement checkbox_region_north_america;

    @FindBy(xpath = "//label[@class='Checkbox-label'][@for='fourseasons:global-data/regions/middle-east-africa")
    private WebElement text_region_middle_east_and_africa;

    @FindBy(xpath = "//label[@class='Checkbox-decoration'][@for='fourseasons:global-data/regions/middle-east-africa']")
    private WebElement checkbox_region_middle_east_and_africa;

    @FindBy(xpath = "//label[@class='Checkbox-label'][@for='fourseasons:global-data/regions/asia-pacific")
    private WebElement text_region_asia_pacific;

    @FindBy(xpath = "//label[@class='Checkbox-decoration'][@for='fourseasons:global-data/regions/asia-pacific']")
    private WebElement checkbox_region_asia_pacific;


    //locate all checkboxes for Property Types
    @FindBy(xpath = "//label[@class='Checkbox-label'][@for='fourseasons:global-data/property-types/hotel")
    private WebElement text_property_type_hotel;

    @FindBy(xpath = "//label[@class='Checkbox-decoration'][@for='fourseasons:global-data/property-types/hotel']")
    private WebElement checkbox_property_type_hotel;

    @FindBy(xpath = "//label[@class='Checkbox-label'][@for='fourseasons:global-data/property-types/resort")
    private WebElement text_property_type_resort;

    @FindBy(xpath = "//label[@class='Checkbox-decoration'][@for='fourseasons:global-data/property-types/resort']")
    private WebElement checkbox_property_type_resort;

    @FindBy(xpath = "//label[@class='Checkbox-label'][@for='fourseasons:global-data/property-types/rental")
    private WebElement text_property_type_rental;

    @FindBy(xpath = "//label[@class='Checkbox-decoration'][@for='fourseasons:global-data/property-types/rental']")
    private WebElement checkbox_property_type_rental;

    @FindBy(xpath = "//label[@class='Checkbox-label'][@for='fourseasons:global-data/property-types/urban")
    private WebElement text_property_type_urban;

    @FindBy(xpath = "//label[@class='Checkbox-decoration'][@for='fourseasons:global-data/property-types/urban']")
    private WebElement checkbox_property_type_urban;
}


