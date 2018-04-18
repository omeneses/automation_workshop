package automation_workshop;

import data.Constant;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import pages.Hero;
import utils.CommonFuntions;

public class HeroComponentTest extends CommonFuntions implements Constant {


    @Before
    public void before(){
        createDriver(driverType.chrome);
        driver.get(Constant.URL_FS);
        driver.manage().window().maximize();
    }

    @After
    public void after() throws InterruptedException {
        driver.quit();
    }

    @Test
    public void checkHeroEyebrowText() throws Exception {
        Hero myhomepage = PageFactory.initElements(driver, Hero.class);
        Assert.assertEquals(Constant.HERO_EYEBROW_TEXT,myhomepage.getHeroEyebrowText(driver));
    }

    @Test
    public void checkHeroTitleText() throws Exception {
        Hero myhomepage = PageFactory.initElements(driver, Hero.class);
        Assert.assertEquals(Constant.HERO_TITLE_TEXT,myhomepage.getHeroTitleText(driver));
    }

    @Test
    public void checkHeroDescriptionText() throws Exception {
        Hero myhomepage = PageFactory.initElements(driver, Hero.class);
        Assert.assertEquals(Constant.HERO_DESCRIPTION_TEXT,myhomepage.getHeroDescriptionText(driver));
    }
}
