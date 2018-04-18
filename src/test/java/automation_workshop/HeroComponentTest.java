package automation_workshop;

import data.Constant;
import hooks.BeforeAfterTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import pages.Hero;

public class HeroComponentTest extends BeforeAfterTest implements Constant {

    @Before
    public void before(){
        BeforeAfterTest.beforeTest() ;
    }

    @After
    public void after() throws InterruptedException {
        BeforeAfterTest.afterTest();
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
