package automation_workshop;

import data.Constant;
import hooks.BeforeAfterTest;
import org.junit.*;
import org.openqa.selenium.support.PageFactory;
import pages.CampaignsLanding;
import pages.FiltersLayout;

public class CampaignFiltersLogicComponentTest extends BeforeAfterTest implements Constant {

    @Before
    public void before(){
        BeforeAfterTest.beforeTest() ;
    }

    @After
    public void after() throws InterruptedException {
        BeforeAfterTest.afterTest();
    }

   @Test
    public void checkDefaultStatusAllCheckboxes() throws InterruptedException {
        CampaignsLanding mycampaignlanding = PageFactory.initElements(driver, CampaignsLanding.class);
        FiltersLayout myfilterslayout = mycampaignlanding.goFiltersLayout();
        myfilterslayout = PageFactory.initElements(driver, FiltersLayout.class);


        //Validate that all checkboxes are unselected by default
        myfilterslayout.validateAllElementsOfCategory(driver, "marketing-campaigns", false);
        myfilterslayout.validateAllElementsOfCategory(driver, "regions", false);
        myfilterslayout.validateAllElementsOfCategory(driver, "property-types", false);
    }


   @Test
    public void checkBehaviorOnExperiencesColumn() throws Exception {
        CampaignsLanding mycampaignlanding = PageFactory.initElements(driver, CampaignsLanding.class);
        FiltersLayout myfilterslayout = mycampaignlanding.goFiltersLayout();
        myfilterslayout = PageFactory.initElements(driver, FiltersLayout.class);

        //Selecting all checkboxes on Experiences category
        myfilterslayout.selectAllElementsOfCategory(driver,"marketing-campaigns");

        //Asserting all checkboxes on Experiences category are selected
        myfilterslayout.validateAllElementsOfCategory(driver, "marketing-campaigns", true);


        //Deselecting all checkboxes on Experiences category
        myfilterslayout.selectAllElementsOfCategory(driver,"marketing-campaigns");


        //Asserting all checkboxes on Experiences category are unselect
        myfilterslayout.validateAllElementsOfCategory(driver, "marketing-campaigns", false);
   }

    @Test
    public void checkBehaviorOnRegionsColumn() throws Exception {
        CampaignsLanding mycampaignlanding = PageFactory.initElements(driver, CampaignsLanding.class);
        FiltersLayout myfilterslayout = mycampaignlanding.goFiltersLayout();
        myfilterslayout = PageFactory.initElements(driver, FiltersLayout.class);

        //Selecting all checkboxes on Regions category
        myfilterslayout.selectAllElementsOfCategory(driver,"regions");

        //Asserting all checkboxes on Regions category are selected
        myfilterslayout.validateAllElementsOfCategory(driver, "regions", true);


        //Unselecting all checkboxes on Regions category
        myfilterslayout.selectAllElementsOfCategory(driver,"regions");


        //Asserting all checkboxes on Regions category are unselect
        myfilterslayout.validateAllElementsOfCategory(driver, "regions", false);
    }

    @Test
    public void checkBehaviorOnPropertyTypeColumn() throws Exception {
        CampaignsLanding mycampaignlanding = PageFactory.initElements(driver, CampaignsLanding.class);
        FiltersLayout myfilterslayout = mycampaignlanding.goFiltersLayout();
        myfilterslayout = PageFactory.initElements(driver, FiltersLayout.class);

        //Selecting all checkboxes on Regions category
        myfilterslayout.selectAllElementsOfCategory(driver,"property-types");

        //Asserting all checkboxes on Regions category are selected
        myfilterslayout.validateAllElementsOfCategory(driver, "property-types", true);


        //Unselecting all checkboxes on Regions category
        myfilterslayout.selectAllElementsOfCategory(driver,"property-types");


        //Asserting all checkboxes on Regions category are unselect
        myfilterslayout.validateAllElementsOfCategory(driver, "property-types", false);
    }

/*    @Test
    public void scenario_one() throws Exception {
        CampaignsLanding mycampaignlanding = PageFactory.initElements(driver, CampaignsLanding.class);
        FiltersLayout myfilterslayout = mycampaignlanding.goFiltersLayout();
        myfilterslayout = PageFactory.initElements(driver, FiltersLayout.class);

        //Selecting checkbox  Caleb Party  on Experiences column
        myfilterslayout.selectExperienceCalebParty(driver);

        //Selecting checkboxes  on Regions column
        myfilterslayout.selectAllElementsOfCategory(driver,"region");

        //Selecting checkboxes  on Property Types column
        myfilterslayout.selectAllElementsOfCategory(driver,"propertyType");


        //Validate checkboxes status for all regions
        Assert.assertFalse(myfilterslayout.statusRegionRegionAsiaPacificCheckbox());
        Assert.assertFalse(myfilterslayout.statusRegionMiddleEastAndAfricaCheckbox());
        Assert.assertTrue(myfilterslayout.statusRegionNorthAmericaCheckbox());

        //Validate checkboxes status for all Property Types
        Assert.assertFalse(myfilterslayout.statusPropertyTypeUrbanCheckbox());
        Assert.assertFalse(myfilterslayout.statusPropertyTypeHotelCheckbox());
        Assert.assertTrue(myfilterslayout.statusPropertyTypeResortCheckbox());

    }

    @Test
    public void scenario_two() throws Exception {
        CampaignsLanding mycampaignlanding = PageFactory.initElements(driver, CampaignsLanding.class);
        FiltersLayout myfilterslayout = mycampaignlanding.goFiltersLayout();
        myfilterslayout = PageFactory.initElements(driver, FiltersLayout.class);

        //Selecting checkbox  Caleb Party  on Experiences column
        myfilterslayout.selectExperienceCalebParty(driver);

        //Selecting checkboxes  on Regions column
        myfilterslayout.selectAllElementsOfCategory(driver,"region");

        //Selecting checkboxes  on Property Types column
        myfilterslayout.selectAllElementsOfCategory(driver,"propertyType");


        //Validate checkboxes status for all regions
        Assert.assertFalse(myfilterslayout.statusRegionRegionAsiaPacificCheckbox());
        Assert.assertFalse(myfilterslayout.statusRegionMiddleEastAndAfricaCheckbox());
        Assert.assertTrue(myfilterslayout.statusRegionNorthAmericaCheckbox());

        //Validate checkboxes status for all Property Types
        Assert.assertFalse(myfilterslayout.statusPropertyTypeUrbanCheckbox());
        Assert.assertFalse(myfilterslayout.statusPropertyTypeHotelCheckbox());
        Assert.assertTrue(myfilterslayout.statusPropertyTypeResortCheckbox());

    }*/

}
