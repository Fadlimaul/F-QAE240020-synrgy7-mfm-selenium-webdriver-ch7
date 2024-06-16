package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;
import org.openqa.selenium.WebElement;

public class HomePage {
    WebDriver driver;
    WebDriverWait wait;

    By DashboardText = By.className("app_logo");
    By FooterText = By.className("footer_copy");
    By SortContainer = By.xpath("//select[@class='product_sort_container']/option[@value='hilo']");
    By itemPrices = By.className("inventory_item_price");
    By ATC1 = By.id("add-to-cart-sauce-labs-backpack");
    By ATC2 = By.id("add-to-cart-sauce-labs-bolt-t-shirt");
    By Cart = By.xpath("//a[@class='shopping_cart_link']");

    public HomePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }
    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }
    public String getTextDashboard() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(DashboardText));
        return driver.findElement(DashboardText).getText();
    }
    public String getTextFooter() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(FooterText));
        return driver.findElement(FooterText).getText();
    }
    public void ClickATC1Button() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(ATC1));
        driver.findElement(ATC1).click();
    }
    public void ClickATC2Button() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(ATC2));
        driver.findElement(ATC2).click();
    }
    public void ClickCartButton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(Cart));
        driver.findElement(Cart).click();
    }
    public void ClickSortContainer() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(SortContainer));
        driver.findElement(SortContainer).click();
    }
    public boolean isSortedByHighToLow() {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(itemPrices));
        List<WebElement> priceElements = driver.findElements(itemPrices);
        List<Double> prices = priceElements.stream()
                .map(e -> Double.parseDouble(e.getText().replace("$", "")))
                .collect(Collectors.toList());

        for (int i = 0; i < prices.size() - 1; i++) {
            if (prices.get(i) < prices.get(i + 1)) {
                return false;
            }
        }
        return true;
    }
}
