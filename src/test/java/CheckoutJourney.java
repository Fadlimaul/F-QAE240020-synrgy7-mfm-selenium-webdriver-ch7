import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.*;

public class CheckoutJourney {
    WebDriver driver;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = WebDriverManager.chromedriver().create();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
    }
    @Test
    public void CheckoutJourney() {
        LoginPage login = new LoginPage(driver);
        HomePage home = new HomePage(driver);
        CartPage cart = new CartPage(driver);
        COS1Page cos1 = new COS1Page(driver);
        COS2Page cos2 = new COS2Page(driver);
        CCPage cc = new CCPage(driver);

        login.InputUsername("standard_user");
        login.InputPassword("secret_sauce");
        login.ClickLoginButton();
        home.ClickATC1Button();
        home.ClickATC2Button();
        home.ClickCartButton();
        cart.ClickCheckoutButton();
        cos1.InputFirstName("adul");
        cos1.InputLastName("pesek");
        cos1.InputPostalCode("666");
        cos1.ClickContinueButton();
        cos2.ClickFinishButton();

        Assert.assertEquals(cc.getCurrentUrl(), "https://www.saucedemo.com/checkout-complete.html");
        Assert.assertEquals(cc.getCheckOutTitle(), "Checkout: Complete!");
        Assert.assertEquals(cc.getCompleteHeader(), "Thank you for your order!");
}
    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
