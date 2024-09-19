package Steps;

import pages.*;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CO_01_Steps {

    WebDriver driver;
    LoginPage login;
    HomePage home;
    CartPage cart;
    CheckoutOverviewPage checkoutOverviewPage;
    DetailsProductPage detailsProductPage;
    CheckoutInformationPage checkoutInformationPage;
    CheckoutCompletePage checkoutCompletePage;

    @Given("The user is on the login page and login with valid data")
    public void the_user_is_on_the_login_page_and_login() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        login = new LoginPage(driver);
        home = new HomePage(driver);
        checkoutOverviewPage = new CheckoutOverviewPage(driver);
        checkoutInformationPage = new CheckoutInformationPage(driver);
        checkoutCompletePage = new CheckoutCompletePage(driver);
        detailsProductPage = new DetailsProductPage(driver);
        cart = new CartPage(driver);
        login.InputUsername("standard_user");
        login.InputPassword("secret_sauce");
        login.ClickLoginButton();
    }

    @When("The user click add to cart")
    public void the_user_click_add_to_cart() {
        home.ClickATC1Button();
    }

    @When("The user click cart logo")
    public void the_user_click_cart_logo() {
        home.ClickCartButton();
    }

    @When("The user click the checkout button")
    public void the_user_click_the_checkout_button() {
        cart.ClickCheckoutButton();
    }

    @When("The user click the continue shopping button")
    public void the_user_click_the_continue_shopping_button() {
        cart.ClickContinueShoppingButton();
    }

    @When("The user filling first name {string}")
    public void the_user_filling_first_name(String firstname) {
        checkoutInformationPage.InputFirstName(firstname);
    }

    @When("The user filling last name {string}")
    public void the_user_filling_last_name(String lastname) {
        checkoutInformationPage.InputLastName(lastname);
    }

    @When("The user filling invalid postal code {string}")
    public void the_user_filling_valid_postal_code(String invpostalcode) {
        checkoutInformationPage.InputInvalidPostalCode(invpostalcode);
    }

    @When("The user filling valid postal code {int}")
    public void the_user_filling_valid_postal_code(Integer postalcode) {
        checkoutInformationPage.InputPostalCode(postalcode);
    }

    @When("The user click the continue button")
    public void the_user_click_the_continue_button() {
        checkoutInformationPage.ClickContinueButton();
    }

    @When("The user click the cancel button on the checkout information page")
    public void the_user_click_the_cancel_button_on_the_checkout_information_page() {
        checkoutInformationPage.ClickCancelButton();
    }

    @When("The user click the cancel button on the checkout overview page")
    public void the_user_click_the_cancel_button_on_the_checkout_overview_page() {
        checkoutOverviewPage.ClickCancelButton();
    }

    @When("The user click the finish button")
    public void the_user_click_the_finish_button() {
        checkoutOverviewPage.ClickFinishButton();
    }

    @Then("the success message should be displayed")
    public void the_success_message_should_be_displayed() {
        assert true; checkoutCompletePage.CheckOutTitleDisplayed();
        driver.quit();
    }

    @Then("The user still on the cart page")
    public void the_user_still_on_the_cart_page() {
        Assert.assertEquals(cart.getTitlePage(),"Your Cart");
        driver.quit();
    }

    @Then("The user back to the home page")
    public void the_user_back_to_the_home_page() {
        Assert.assertEquals(home.getTitlePage(),"Products");
        driver.quit();
    }

    @Then("the error first name message should be displayed")
    public void the_error_fisrt_name_message_should_be_displayed() {
        assert true; checkoutInformationPage.ErrorFirstNameFieldDisplayed();
        driver.quit();
    }

    @Then("the error last name message should be displayed")
    public void the_error_last_name_message_should_be_displayed() {
        assert true; checkoutInformationPage.ErrorlastNameFieldDisplayed();
        driver.quit();
    }

    @Then("the error postal code message should be displayed")
    public void the_error_postal_code_message_should_be_displayed() {
        assert true; checkoutInformationPage.ErrorPostalCodeFieldDisplayed();
        driver.quit();
    }

    @Then("the error message should be displayed")
    public void the_error_message_should_be_displayed() {
        assert true; checkoutInformationPage.ErrorMessageDisplayed();
        driver.quit();
    }

    @Then("The user still on the checkout information page")
    public void the_user_still_on_the_checkout_information_page() {
        Assert.assertEquals(checkoutInformationPage.getTitlePage(),"Checkout: Your Information");
        driver.quit();
    }

    @Then("The user back to the cart page")
    public void the_user_back_to_the_cart_page() {
        Assert.assertEquals(cart.getTitlePage(),"Your Cart");
        driver.quit();
    }

}
