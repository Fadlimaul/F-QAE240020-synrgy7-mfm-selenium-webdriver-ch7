package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class COS2Page {
    WebDriver driver;
    WebDriverWait wait;

    By FinishButton = By.id("finish");

    public COS2Page(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }
    public void ClickFinishButton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(FinishButton));
        driver.findElement(FinishButton).click();
    }
}
