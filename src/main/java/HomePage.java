import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by stephenwa on 28/01/15.
 */
public class HomePage {

    private WebDriver driver;
    private WebDriverWait wait;

    public HomePage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public String getHomePageTitle() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("homePageTitle"))).getText().trim();
    }
}
