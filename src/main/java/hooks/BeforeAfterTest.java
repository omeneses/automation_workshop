package hooks;

import data.Constant;
import utils.CommonFuntions;


public class BeforeAfterTest extends CommonFuntions implements Constant {

    public static void beforeTest(){
        createDriver(driverType.chrome);
        driver.get(Constant.URL);
        //driver.manage().window().maximize();
        //in.Visual.setAccessKey("9eRQ89VzO64P5kb4t004jmI");
        //in.Visual.setAccessKey("2ZTApW5hczroCY7evfkPvXd");

    }

    public static void afterTest() throws InterruptedException {
        driver.quit();
    }
}
