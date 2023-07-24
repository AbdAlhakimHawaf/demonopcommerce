package steps;

import base.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import pages.P01_Home;
import pages.P03_Login;

public class D03_currenciesStepDef extends TestBase {
    P01_Home HomePage = new P01_Home(driver);
    P03_Login LoginPage = new P03_Login(driver);

    @Given("user go to home page")
    public void userGoToHomePage() {
        LoginPage.RedirectedtoHomePage();
    }

    @When("user click on currency drop down and choose Euro currency")
    public void userClickOnCurrencyDropDownAndChooseEuroCurrency() {
        HomePage.SelectEuroCurrency("Euro");
    }

    @Then("user can see price in Euro currency")
    public void userCanSeePriceInEuroCurrency() {
        Assert.assertTrue(driver.findElements(By.xpath("//span[@class='price actual-price']")).get(0).getText().contains("€"));
        Assert.assertTrue(driver.findElements(By.xpath("//span[@class='price actual-price']")).get(1).getText().contains("€"));
        Assert.assertTrue(driver.findElements(By.xpath("//span[@class='price actual-price']")).get(2).getText().contains("€"));
        Assert.assertTrue(driver.findElements(By.xpath("//span[@class='price actual-price']")).get(3).getText().contains("€"));

    }
}
