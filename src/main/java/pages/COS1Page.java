package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class COS1Page {
    WebDriver driver;
    WebDriverWait wait;

    By FirstNameField = By.id("first-name");
    By LastNameField = By.id("last-name");
    By ZipField = By.id("postal-code");
    By ContinueButton = By.id("continue");

    public COS1Page(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }
    public void InputFirstName(String firstname) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(FirstNameField));
        driver.findElement(FirstNameField).sendKeys(firstname);
    }
    public void InputLastName(String lastname) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(LastNameField));
        driver.findElement(LastNameField).sendKeys(lastname);
    }
    public void InputPostalCode(String postalcode) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(ZipField));
        driver.findElement(ZipField).sendKeys(postalcode);
    }
    public void ClickContinueButton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(ContinueButton));
        driver.findElement(ContinueButton).click();
    }
}