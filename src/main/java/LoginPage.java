import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by stephenwa on 28/01/15.
 */
public class LoginPage {

    private WebDriver driver;
    private WebDriverWait wait;

    public LoginPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public HomePage loginIntoSite(String username, String password) {
        wait.until(ExpectedConditions.elementToBeClickable(By.id("username"))).sendKeys(username);
        wait.until(ExpectedConditions.elementToBeClickable(By.name("password"))).sendKeys(password);
        wait.until(ExpectedConditions.elementToBeClickable(By.id("submitButton"))).click();
        return new HomePage(driver, wait);
    }
}
