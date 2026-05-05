package pages;

import core.utils.WaitHelper;
import core.config.ConfigReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public abstract class BasePage {

    protected WebDriver driver;
    protected WaitHelper wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WaitHelper(driver);
    }

    protected void click(By locator) {
        try {
            wait.waitForClickable(locator).click();
        } catch (Exception e) {
            throw new RuntimeException("Failed to click element: " + locator, e);
        }
    }

    protected void inputText(By locator, String text) {
        WebElement element = wait.waitForVisibility(locator);
        element.clear();
        element.sendKeys(text);
    }

    protected String getText(By locator) {
        return wait.waitForVisibility(locator).getText();
    }

    protected boolean isDisplayed(By locator) {
        return wait.waitForVisibility(locator).isDisplayed();
    }

    protected void openUrl(String url) {
        driver.get(url);
    }
}