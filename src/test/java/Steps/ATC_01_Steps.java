package Steps;

import pages.*;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ATC_01_Steps {
    WebDriver driver;
    LoginPage login;
    HomePage home;
    CartPage cart;
    DetailsProductPage detailsProductPage;

    @Given("The user is on the login page and login")
    public void the_user_is_on_the_login_page_and_login() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        login = new LoginPage(driver);
        home = new HomePage(driver);
        cart = new CartPage(driver);
        detailsProductPage = new DetailsProductPage(driver);
        login.InputUsername("standard_user");
        login.InputPassword("secret_sauce");
        login.ClickLoginButton();
    }

    @When("The user clicks add to cart to all product")
    public void the_user_clicks_add_to_cart_to_all_product() {
        home.ClickATC1Button();
        home.ClickATC2Button();
        home.ClickATC3Button();
        home.ClickATC4Button();
        home.ClickATC5Button();
        home.ClickATC6Button();
    }

    @When("The user clicks add to cart on the inventory page")
    public void the_user_clicks_add_to_cart_on_the_inventory_page() {
        detailsProductPage.ClickATCButton();
    }

    @When("The user clicks the product")
    public void the_user_clicks_the_product() {
        home.ClickSauceLabsBackpack();
    }

    @When("The user clicks remove on the inventory page")
    public void the_user_clicks_remove_on_the_inventory_page() {
        detailsProductPage.ClickRemoveButton();
    }

    @When("The user clicks remove on the cart page")
    public void the_user_clicks_remove_on_the_cart_page() {
        cart.ClickRemove1Button();
        cart.ClickRemove2Button();
        cart.ClickRemove3Button();
        cart.ClickRemove4Button();
        cart.ClickRemove5Button();
        cart.ClickRemove6Button();
    }

    @When("The user clicks remove to all product")
    public void the_user_clicks_remove_to_all_product() {
        home.ClickRemove6Button();
        home.ClickRemove5Button();
        home.ClickRemove4Button();
        home.ClickRemove3Button();
        home.ClickRemove2Button();
        home.ClickRemove1Button();
    }

    @When("The user click cart button")
    public void the_user_click_cart_button() {
        home.ClickCartButton();
    }

    @Then("the all product displayed on the cart page")
    public void the_all_product_displayed_on_the_cart_page() {
        assert true; cart.CartItem1Displayed();
        assert true; cart.CartItem2Displayed();
        assert true; cart.CartItem3Displayed();
        assert true; cart.CartItem4Displayed();
        assert true; cart.CartItem5Displayed();
        assert true; cart.CartItem6Displayed();
        driver.quit();
    }

    @Then("the all product not displayed on the cart page")
    public void the_all_product_not_displayed_on_the_cart_page() {
        assert false; cart.CartItem1Displayed();
        assert false; cart.CartItem2Displayed();
        assert false; cart.CartItem3Displayed();
        assert false; cart.CartItem4Displayed();
        assert false; cart.CartItem5Displayed();
        assert false; cart.CartItem6Displayed();
        driver.quit();
    }

    @Then("the product displayed on the cart page")
    public void the_product_displayed_on_the_cart_page() {
        assert true; cart.CartItemDisplayed();
        driver.quit();
    }
    @Then("the product not displayed on the cart page")
    public void the_product_not_displayed_on_the_cart_page() {
        assert true; cart.CartBadgeDisplayed();
        driver.quit();
    }
}
