package Steps;

import pages.*;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class LOG_01_Steps {

    WebDriver driver;
    LoginPage login;
    HomePage home;

    @Given("The user is on the login page")
    public void the_user_is_on_the_login_page() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        login = new LoginPage(driver);
        home = new HomePage(driver);
    }

    @When("The user enters username {string}")
    public void the_user_enters_username(String username) {
//        login = new LoginPage(driver);
        login.InputUsername(username);
    }

    @When("The user enters password {string}")
    public void the_user_enters_password(String password) {
//        login = new LoginPage(driver);
        login.InputPassword(password);
    }

    @When("The user clicks the login button")
    public void the_user_clicks_the_login_button() {
        login.ClickLoginButton();
    }

    @When("The user clicks the menu button")
    public void the_user_clicks_the_menu_button() {
        home.ClickMenuButton();
    }

    @When("The user clicks the logout button")
    public void the_user_clicks_the_logout_button() {
        home.ClickLogoutButton();
    }

    @Then("the user directed to the home page")
    public void the_user_directed_to_the_home_page() {
        Assert.assertEquals(home.getTextDashboard(),"Swag Labs");
        driver.quit();
    }

    @Then("the user back to the login page")
    public void the_user_back_to_the_login_page() {
        assert true; login.LoginButtonDisplayed();
        driver.quit();
    }

    @Then("the user get error message")
    public void the_user_get_error_mesage() {
        assert true; login.ErrorMessageDisplayed();
        driver.quit();
    }

    @Then("the user get error username message")
    public void the_user_get_error_username_mesage() {
        assert true; login.ErrorUsernameMessageDisplayed();
        driver.quit();
    }

    @Then("the user get error password message")
    public void the_user_get_error_password_mesage() {
        assert true; login.ErrorPasswordMessageDisplayed();
        driver.quit();
    }

}
