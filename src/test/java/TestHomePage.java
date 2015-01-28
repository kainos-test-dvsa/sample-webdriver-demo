import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by stephenwa on 28/01/15.
 */
public class TestHomePage {

    private WebDriver driver;
    private WebDriverWait wait;
    private final int WEB_DRIVER_TIMEOUT_IN_SECONDS = 10;

    @BeforeMethod
    public void beforeTest() {
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, WEB_DRIVER_TIMEOUT_IN_SECONDS);

        //Set the url for the web driver
        driver.get("http://www.google.com");
    }

    @AfterMethod
    public void afterTest() {
        driver.quit();
    }

    @Test
    public void testLoginToSite() {
        LoginPage loginPage = new LoginPage(driver, wait);
        HomePage homePage = loginPage.loginIntoSite("user1", "password1");
        Assert.assertEquals("Check the homepage title", homePage.getHomePageTitle(), "Welcome to the Jungle");
    }
}
