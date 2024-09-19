package Steps;

import pages.*;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class INV_01_Steps {

    WebDriver driver;
    LoginPage login;
    HomePage home;
    CartPage cart;
    CheckoutOverviewPage checkoutOverviewPage;
    DetailsProductPage detailsProductPage;
    CheckoutInformationPage checkoutInformationPage;

    @Given("The user on the login page and login")
    public void the_user_on_the_login_page_and_login() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        login = new LoginPage(driver);
        home = new HomePage(driver);
        cart = new CartPage(driver);
        checkoutOverviewPage = new CheckoutOverviewPage(driver);
        detailsProductPage = new DetailsProductPage(driver);
        checkoutInformationPage = new CheckoutInformationPage(driver);
        login.InputUsername("standard_user");
        login.InputPassword("secret_sauce");
        login.ClickLoginButton();
    }

    @When("The user clicks add to cart")
    public void the_user_clicks_add_to_cart() {
        home.ClickATC1Button();
    }

    @When("The user clicks cart button")
    public void the_user_clicks_cart_button() {
        home.ClickCartButton();
    }

    @When("The user clicks the product name")
    public void the_user_clicks_the_product_name() {
        home.ClickSauceLabsBackpack();
    }

    @When("The user clicks the product name on the cart page")
    public void the_user_clicks_the_product_name_on_the_cart_page() {
        cart.ClickSauceLabsBackpack();
    }

    @When("The user clicks the checkout button")
    public void the_user_clicks_the_checkout_button() {
        cart.ClickCheckoutButton();
    }

    @When("The user filling valid data on the checkout information page")
    public void the_user_filling_valid_data_on_the_checkout_information_page() {
        checkoutInformationPage.InputFirstName("ilham");
        checkoutInformationPage.InputLastName("ahmad");
        checkoutInformationPage.InputPostalCode(16452);
        checkoutInformationPage.ClickContinueButton();
    }

    @When("The user clicks the product name on the checkout overview page")
    public void the_user_clicks_the_product_name_on_the_checkout_overview_page() {
        cart.ClickSauceLabsBackpack();
    }

    @Then("the user directed to inventory item page")
    public void the_user_directed_to_inventory_item_page() {
        assert true; detailsProductPage.DetailProductDisplayed();
        driver.quit();
    }
}
