package pages;

import io.cucumber.java.eo.Se;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class P02_Register extends BasePage {

    public P02_Register(WebDriver Driver) {
        super(Driver);
    }

    By MaleGender = By.id("gender-male");
    public void SelectMaleGender(){
        ClickOnElement(MaleGender);
    }
    By FirstNameField = By.id("FirstName");
    public void SetFirstName(String text){
        SetElementText(FirstNameField,text);
    }
    By LastNameField = By.id("LastName");
    public void SetLastName(String text){
        SetElementText(LastNameField,text);
    }

    By DayOfBirthDropdown = By.xpath(" //select[@name='DateOfBirthDay']");
    public void SetDayOfBirth( String text){
        Select DayOfBirth = new Select(driver.findElement(DayOfBirthDropdown));
        DayOfBirth.selectByVisibleText(text);
    }
    By MonthOfBirthDropdown = By.xpath("//select[@name='DateOfBirthMonth']");
    public void SetMonthOfBirth (String text){
        Select MonthOfBirth = new Select(driver.findElement(MonthOfBirthDropdown));
        MonthOfBirth.selectByVisibleText(text);

    }
    By YearOfBirthDropdown = By.xpath("//select[@name='DateOfBirthYear']");
    public void SetYearOfBirth(String text){
        Select YearOfBirth = new Select(driver.findElement(YearOfBirthDropdown));
        YearOfBirth.selectByVisibleText(text);
    }
    By EmailField = By.id("Email");
    public void SetEmail(String text){
        SetElementText(EmailField, text);
    }
    By PasswordField = By.id("Password");
       public void SetPassword(String text){
        SetElementText(PasswordField ,text);
    }
    By ConfirmPasswordField = By.id("ConfirmPassword");
    public void SetConfirmPassword(String text){
        SetElementText(ConfirmPasswordField ,text);
    }
    By RegisterButton = By.id("register-button");
    public void ClickOnRegister(){
        ClickOnElement(RegisterButton);
    }
    By LoginButton =By.xpath("//a[@href='/login?returnUrl=%2F']");
    public void ClickOnLogInButton(){
        ClickOnElement(LoginButton);
    }


}
