package automation_workshop;

import data.Constant;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import utils.CommonFuntions;

public class FlightSelectionTest extends CommonFuntions implements Constant {


    @Before
    public void before(){

        createDriver(driverType.chrome);
        driver.get(Constant.URL_TRAVELOCITY);
        driver.manage().window().maximize();
    }

    @Test
    public void scenario_two() throws Exception {

        System.out.println("Abriendo el browser");

    }


    @After
    public void after() throws InterruptedException {
         driver.quit();
    }

}
