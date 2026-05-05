package pages;

import core.utils.WaitHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;

    private By usernameInput = By.id("username");
    private By passwordInput = By.id("password");
    private By loginButton = By.id("login");

    private WaitHelper wait;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WaitHelper(driver, 10);
    }

    public void clickLogin() {
        wait.waitForClickable(loginButton).click();
    }

    public LoginPage open(String url) {
        driver.get(url);
        return this;
    }

    public LoginPage enterUsername(String username) {
        wait.waitForVisibility(usernameInput).sendKeys(username);
        return this;
    }

    public LoginPage enterPassword(String password) {
        wait.waitForVisibility(passwordInput).sendKeys(password);
        return this;
    }
}
