package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DetailsProductPage {
    WebDriver driver;
    WebDriverWait wait;

    By DetailProduct = By.className("inventory_details");
    By ATCButton = By.id("add-to-cart");
    By RemoveButton = By.id("remove");
    By CartButton = By.id("shopping_cart_container");
    By BackToProductButton = By.className("left_component");


    public DetailsProductPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }
    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }
    public boolean DetailProductDisplayed() {
        return driver.findElement(DetailProduct).isDisplayed();
    }
    public void ClickATCButton () {
        wait.until(ExpectedConditions.elementToBeClickable(ATCButton));
        driver.findElement(ATCButton).click();
    }
    public void ClickBackToProductButton () {
        wait.until(ExpectedConditions.elementToBeClickable(BackToProductButton));
        driver.findElement(BackToProductButton).click();
    }
    public void ClickRemoveButton () {
        wait.until(ExpectedConditions.elementToBeClickable(RemoveButton));
        driver.findElement(RemoveButton).click();
    }
}
