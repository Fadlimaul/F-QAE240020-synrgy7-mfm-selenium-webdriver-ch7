package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class LoginPage {
    WebDriver driver;
    WebDriverWait wait;

    By UsernameField = By.id("user-name");
    By PasswordField = By.id("password");
    By LoginButton =  By.id("login-button");
    By ErrorMessage = By.xpath("//div[contains(@class, 'error')]");
    By WrongLogo = By.xpath("//*[@fill='currentColor']");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }
    public void InputUsername(String username) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(UsernameField));
        driver.findElement(UsernameField).sendKeys(username);
    }
    public void InputPassword(String password) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PasswordField));
        driver.findElement(PasswordField).sendKeys(password);
    }
    public void ClickLoginButton () {
        wait.until(ExpectedConditions.elementToBeClickable(LoginButton));
        driver.findElement(LoginButton).click();
    }
    public boolean ErrorMessageDisplayed() {
        return driver.findElement(ErrorMessage).isDisplayed();
    }
    public boolean WrongLogoDisplayed() {
        return driver.findElement(WrongLogo).isDisplayed();
    }
}
