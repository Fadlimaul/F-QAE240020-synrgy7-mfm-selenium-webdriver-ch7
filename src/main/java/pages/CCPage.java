package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class CCPage {
    WebDriver driver;
    WebDriverWait wait;

    By CheckOutTitle = By.className("title");
    By CompleteHeader = By.className("complete-header");

    public CCPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }
    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }
    public String getCheckOutTitle() {
        return driver.findElement(CheckOutTitle).getText();
    }
    public String getCompleteHeader() {
        return driver.findElement(CompleteHeader).getText();
    }
}
