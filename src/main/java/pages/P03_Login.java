package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P03_Login extends BasePage{
    public P03_Login(WebDriver Driver) {
        super(Driver);
    }

    By LoginEmailField  = By.id("Email");
    public void SetLoginEmailField(String text){
        SetElementText(LoginEmailField , text);
    }
    By LoginPasswordField  = By.id("Password");
    public void SetLoginPasswordField(String text){
        SetElementText(LoginPasswordField , text);
    }

    By LoginButton = By.xpath("//button[@class='button-1 login-button']");
    public void ClickOnLoginButton(){
        ClickOnElement(LoginButton);
    }
    By LogoutButton = By.xpath("//a[@href='/logout']");
    public void ClickOnLogoutButton(){
        ClickOnElement(LogoutButton);
    }

    By LogoImage = By.xpath("//img[@alt='nopCommerce demo store']");
    public  void RedirectedtoHomePage(){
        ClickOnElement(LogoImage);
    }

}
