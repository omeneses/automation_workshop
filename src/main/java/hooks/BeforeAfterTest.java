package hooks;

import data.Constant;
import utils.CommonFuntions;

public class BeforeAfterTest extends CommonFuntions implements Constant {

    public static void beforeTest(){
        createDriver(driverType.chrome);
        driver.get(Constant.URL_FS);
        driver.manage().window().maximize();
    }

    public static void afterTest() throws InterruptedException {
        driver.quit();
    }
}
