package steps;

import base.TestBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import pages.P01_Home;
import pages.P03_Login;

public class D02_loginStepDef extends TestBase {
    P01_Home HomePage = new P01_Home(driver);
    P03_Login LoginPage = new P03_Login(driver);

    @Given("user go to login page")
    public void userGoToLoginPage() {
        HomePage.ClickOnLoginButton();
    }

    @When("user login with valid test@example.com and P@ssw{int}rd")
    public void userLoginWithValidTestExampleComAndPSswRd(int arg0) {
        LoginPage.SetLoginEmailField("test@example12345678.com");
        LoginPage.SetLoginPasswordField("P@ssw0rd");

    }

    @And("user press on login button")
    public void userPressOnLoginButton() {
        LoginPage.ClickOnLoginButton();
    }

    @Then("user login to the system successfully")
    public void userLoginToTheSystemSuccessfully() {
       // Assert.assertEquals(driver.findElement(By.xpath("//div[@class='page-title']")).getText(),"Wishlist");
        LoginPage.ClickOnLogoutButton();
    }

    @When("user login with invalid wrong@example.com and Password")
    public void userLoginWithInvalidWrongExampleComAndPassword() {
        LoginPage.SetLoginEmailField("wrong@example.com");
        LoginPage.SetLoginPasswordField("Password");
        LoginPage.ClickOnLoginButton();

    }

    @Then("user could not login to the system    And user press on login button")
    public void userCouldNotLoginToTheSystemAndUserPressOnLoginButton() {
        Assert.assertEquals(driver.findElement(By.xpath("//div[@class='message-error validation-summary-errors']")).getText(),"Login was unsuccessful. Please correct the errors and try again.");
    }
}
