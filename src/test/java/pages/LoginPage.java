package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    private By usernameInput = By.id("username");
    private By passwordInput = By.id("password");
    private By loginButton = By.id("login");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage open(String url) {
        openUrl(url);
        return this;
    }

    public LoginPage enterUsername(String username) {
        inputText(usernameInput, username);
        return this;
    }

    public LoginPage enterPassword(String password) {
        inputText(passwordInput, password);
        return this;
    }

    public void clickLogin() {
        click(loginButton);
    }
}