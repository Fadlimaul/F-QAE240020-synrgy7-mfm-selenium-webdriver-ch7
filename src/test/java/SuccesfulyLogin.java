import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class SuccesfulyLogin {
    WebDriver driver;
    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = WebDriverManager.chromedriver().create();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
    }
    @Test
    public void LoginSuccesfully() {
        LoginPage login = new LoginPage(driver);
        HomePage home = new HomePage(driver);

        login.InputUsername("standard_user");
        login.InputPassword("secret_sauce");
        login.ClickLoginButton();

        Assert.assertEquals(home.getCurrentUrl(), "https://www.saucedemo.com/inventory.html");
        Assert.assertEquals(home.getTextDashboard(), "Swag Labs");
        Assert.assertEquals(home.getTextFooter(), "© 2024 Sauce Labs. All Rights Reserved. Terms of Service | Privacy Policy");
    }
    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
