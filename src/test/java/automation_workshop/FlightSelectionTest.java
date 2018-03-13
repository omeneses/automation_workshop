package automation_workshop;

import chunks.SiteHeader;
import data.Constant;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import pages.HomePageTravelocity;
import utils.CommonFuntions;

public class FlightSelectionTest extends CommonFuntions implements Constant {

/*
    @Before
    public void before(){

        createDriver(driverType.chrome);
        driver.get(Constant.URL_TRAVELOCITY);
        driver.manage().window().maximize();
    }

    @Test
    public void scenario_two() throws Exception {

        System.out.println("Abriendo el browser");
        HomePageTravelocity myhomepage = PageFactory.initElements(driver, HomePageTravelocity.class);
        SiteHeader mysiteheader = PageFactory.initElements(driver, SiteHeader.class);

        myhomepage.goFlights();
        myhomepage.goHotels();
        myhomepage.goFlightAndHotel();
        myhomepage.goCars();
        myhomepage.goCruises();
        myhomepage.goActivities();
        myhomepage.goDiscover();
        mysiteheader.selectAccountOption();
        mysiteheader.selectMyListLink();
        mysiteheader.selectMyTripsLink();



    }


    @After
    public void after() throws InterruptedException {
         driver.quit();
    }*/

}
