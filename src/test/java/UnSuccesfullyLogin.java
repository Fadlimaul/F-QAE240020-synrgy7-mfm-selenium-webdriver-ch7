import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class UnSuccesfullyLogin {
    WebDriver driver;
    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = WebDriverManager.chromedriver().create();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
    }
    @Test
    public void LoginUnsuccesfully() {
        LoginPage login = new LoginPage(driver);
        HomePage home = new HomePage(driver);
        login.InputUsername("aaa");
        login.InputPassword("aaa");
        login.ClickLoginButton();

        Assert.assertEquals(home.getCurrentUrl(), "https://www.saucedemo.com/");
        Assert.assertTrue(login.ErrorMessageDisplayed());
        Assert.assertTrue(login.WrongLogoDisplayed());
    }
    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
