package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    WebDriver driver;
    public BasePage(WebDriver Driver){
        this.driver = Driver;
    }
    public void scrollToElementView(By ElementLocator){
        WebElement element = driver.findElement(ElementLocator);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }
    public void ClickOnElement(By ElementLocator){
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.presenceOfElementLocated(ElementLocator));
        scrollToElementView(ElementLocator);
        driver.findElement(ElementLocator).click();
    }
    public void SetElementText (By ElementLocator , String text){
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.presenceOfElementLocated(ElementLocator));
        scrollToElementView(ElementLocator);
        driver.findElement(ElementLocator).sendKeys(text);
    }

}