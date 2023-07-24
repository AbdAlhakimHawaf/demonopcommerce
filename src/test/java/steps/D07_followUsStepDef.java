package steps;

import base.TestBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.P01_Home;

import java.util.ArrayList;

public class D07_followUsStepDef extends TestBase {
    P01_Home HomePage = new P01_Home(driver);
    ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());



    @When("user opens facebook link")
    public void userOpensFacebookLink() {
        HomePage.ClickOnFacebookFollowButton();
    }

    @And("https:\\/\\/www.facebook.com\\/nopCommerce is opened in new tab")
    public void httpsWwwFacebookComNopCommerceIsOpenedInNewTab() {
        driver.switchTo().window(tabs.get(1));
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.facebook.com/nopCommerce");
        driver.switchTo().window(tabs.get(0));
    }

    @When("user opens twitter link")
    public void userOpensTwitterLink() {
        HomePage.ClickOnTwitterFollowButton();
    }

    @And("https:\\/\\/twitter.com\\/nopCommerce is opened in new tab")
    public void httpsTwitterComNopCommerceIsOpenedInNewTab() {
        driver.switchTo().window(tabs.get(2));
        Assert.assertEquals(driver.getCurrentUrl(),"https://twitter.com/nopCommerce");
        driver.switchTo().window(tabs.get(0));
    }

    @When("user opens rss link")
    public void userOpensRssLink() {
       // HomePage.ClickOnRSSFollowButton();
        //driver.navigate().to("https://demo.nopcommerce.com/");
    }

    @And("https:\\/\\/demo.nopcommerce.com\\/new-online-store-is-open is opened in new tab")
    public void httpsDemoNopcommerceComNewOnlineStoreIsOpenIsOpenedInNewTab() {

        //Assert.assertEquals(driver.getCurrentUrl(),"https://demo.nopcommerce.com/");


    }

    @When("user opens youtube link")
    public void userOpensYoutubeLink() {
        HomePage.ClickOnYouTubeFollowButton();
    }

    @And("https:\\/\\/www.youtube.com\\/user\\/nopCommerce is opened in new tab")
    public void httpsWwwYoutubeComUserNopCommerceIsOpenedInNewTab() {
        driver.switchTo().window(tabs.get(3));
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.youtube.com/user/nopCommerce");
        driver.switchTo().window(tabs.get(0));
        driver.navigate().to("https://demo.nopcommerce.com/");
    }
}
