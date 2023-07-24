package steps;

import base.TestBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import pages.P01_Home;
import pages.P02_Register;

public class D01_registerStepDef extends TestBase {

    P01_Home HomePage = new P01_Home(driver);
    P02_Register RegisterPage = new P02_Register(driver);

    @Given("user go to register page")
    public void userGoToRegisterPage() {
        HomePage.ClickOnRegisterButton();
    }

    @When("user select gender type")
    public void userSelectGenderType() {
        RegisterPage.SelectMaleGender();
    }

    @And("user enter first name automation and last name tester")
    public void userEnterFirstNameAutomationAndLastNameTester() {
        RegisterPage.SetFirstName("automation");
        RegisterPage.SetLastName("tester");

    }

    @And("user enter date of birth")
    public void userEnterDateOfBirth() {
        RegisterPage.SetDayOfBirth("5");
        RegisterPage.SetMonthOfBirth("May");
        RegisterPage.SetYearOfBirth("1996");

    }

    @And("user enter email test@example.com field")
    public void userEnterEmailTestExampleComField() {
        RegisterPage.SetEmail("test@example12345678.com");
    }

    @And("user fills Password fields Password")
    public void userFillsPasswordFieldsPassword() {
        RegisterPage.SetPassword("P@ssw0rd");
        RegisterPage.SetConfirmPassword("P@ssw0rd");
    }

    @And("user clicks on register button")
    public void userClicksOnRegisterButton() {
        RegisterPage.ClickOnRegister();
    }

    @Then("success message is displayed")
    public void successMessageIsDisplayed() {
        Assert.assertEquals(driver.findElement(By.xpath("//div[@class='result']")).getText(),"Your registration completed");
    }
}
