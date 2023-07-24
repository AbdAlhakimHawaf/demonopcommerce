package steps;

import base.TestBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.testng.Assert;
import pages.P01_Home;
import pages.P03_Login;

public class D08_WishlistStepDef extends TestBase {
    P01_Home HomePage = new P01_Home(driver);
    P03_Login LoginPage = new P03_Login(driver);
    @Given("user go to home page for wish list")
    public void userGoToHomePageForWishList() {
        LoginPage.RedirectedtoHomePage();
    }

    @And("click on HTC mobile wishlist")
    public void clickOnHTCMobileWishlist() {
        HomePage.ClickOnHTCWishListButton();
    }

    @Then("Message of The product has been added to your wishlist will appear")
    public void messageOfTheProductHasBeenAddedToYourWishlistWillAppear() {
        Assert.assertEquals(driver.findElement(By.xpath("//p[@class='content']")).getText(),"The product has been added to your wishlist");
    }

    @And("click on Wishlist Button")
    public void clickOnWishlistButton() {
        HomePage.ClickOnWishListButton();
    }

    @Then("he will find that Qty more than zero")
    public void heWillFindThatQtyMoreThanZero() {
        Assert.assertTrue(driver.findElement(By.xpath("//input[@class='qty-input']")).getAttribute("value").contains("1"));
    }


}
