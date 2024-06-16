import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class SortingItem {
    WebDriver driver;
    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = WebDriverManager.chromedriver().create();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
    }
    @Test
        public void ItemSorting() {
            LoginPage login = new LoginPage(driver);
            HomePage home = new HomePage(driver);

            login.InputUsername("standard_user");
            login.InputPassword("secret_sauce");
            login.ClickLoginButton();
            home.ClickSortContainer();

        Assert.assertTrue(home.isSortedByHighToLow(), "Items are not sorted by high to low price");
        }
    @AfterClass
    public void tearDown() {
        driver.quit();
        }
}
