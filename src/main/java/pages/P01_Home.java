package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class P01_Home extends  BasePage{


    public P01_Home(WebDriver Driver) {
        super(Driver);
    }

    By RegisterButton = By.xpath("//a[@href='/register?returnUrl=%2F']");

    public void ClickOnRegisterButton(){
        ClickOnElement(RegisterButton);
    }

    By LoginButton = By.xpath("//a[@href='/login?returnUrl=%2F']");
    public void ClickOnLoginButton(){
        ClickOnElement(LoginButton);
    }

    By CurrencyDropdownList = By.id("customerCurrency");
    public void SelectEuroCurrency(String text){
        Select CurrencyDropdown = new Select(driver.findElement(CurrencyDropdownList));
        CurrencyDropdown.selectByVisibleText(text);
    }
    By FacebookFollowButton = By.xpath("//a[@href='http://www.facebook.com/nopCommerce']");
    public void ClickOnFacebookFollowButton(){
        ClickOnElement(FacebookFollowButton);
    }
    By TwitterFollowButton = By.xpath("//a[@href='https://twitter.com/nopCommerce']");
    public void ClickOnTwitterFollowButton(){
        ClickOnElement(TwitterFollowButton);
    }
    By RSSFollowButton = By.xpath("//a[@href='/news/rss/1']");
    public void ClickOnRSSFollowButton(){
        ClickOnElement(RSSFollowButton);
    }
    By YoutubeFollowButton = By.xpath("//a[@href='http://www.youtube.com/user/nopCommerce']");
    public void ClickOnYouTubeFollowButton(){
        ClickOnElement(YoutubeFollowButton);
    }
    By HTCWishListButton =By.xpath("//button[@class='button-2 add-to-wishlist-button']");
    public void ClickOnHTCWishListButton(){
        (driver.findElements(HTCWishListButton).get(2)).click();
    }
    By WishListButton = By.xpath("//span[@class='wishlist-label']");
    public void ClickOnWishListButton(){
        ClickOnElement(WishListButton);
    }
}
