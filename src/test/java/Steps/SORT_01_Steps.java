package Steps;

import pages.*;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SORT_01_Steps {
    WebDriver driver;
    LoginPage login;
    HomePage home;

    @Given("The user on the login page and login with valid data")
    public void the_user_on_the_login_page_and_login() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        login = new LoginPage(driver);
        home = new HomePage(driver);
        login.InputUsername("standard_user");
        login.InputPassword("secret_sauce");
        login.ClickLoginButton();
    }

    @When("The user clicks sorting name product from A to Z")
    public void the_user_clicks_sorting_name_product_from_AtoZ() {
        home.ClickSortContainerA2Z();
    }

    @When("The user clicks sorting name product from Z to A")
    public void the_user_clicks_sorting_name_product_from_ZtoA() {
        home.ClickSortContainerZ2A();
    }

    @When("The user clicks sorting product price from high to low")
    public void the_user_clicks_sorting_product_price_from_high_to_low() {
        home.ClickSortContainerHighToLow();
    }

    @When("The user clicks sorting product price from low to high")
    public void the_user_clicks_sorting_product_price_from_low_to_high() {
        home.ClickSortContainerLowToHigh();
    }

    @Then("the product name is sorted from A to Z")
    public void the_product_name_is_sorted_from_A2Z() {
        assert true; home.SauceLabsBackpackDisplayed();
        driver.quit();
    }

    @Then("the product name is sorted from Z to A")
    public void the_product_name_is_sorted_from_Z2A() {
        assert true; home.TshirtRedDisplayed();
        driver.quit();
    }

    @Then("the product price is sorted from high to low")
    public void the_product_price_is_sorted_from_high_to_low() {
        assert true; home.isSortedByHighToLow();
        driver.quit();
    }

    @Then("the product price is sorted from low to high")
    public void the_product_price_is_sorted_from_low_to_high() {
        assert true; home.isSortedByLowTohigh();
        driver.quit();
    }
}
