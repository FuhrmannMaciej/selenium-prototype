package core.utils;

import core.config.ConfigReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class WaitHelper {

    private WebDriverWait wait;

    public WaitHelper(WebDriver driver) {

        int timeout = Integer.parseInt(ConfigReader.get("timeout"));

        this.wait = new WebDriverWait(
                driver,
                java.time.Duration.ofSeconds(timeout)
        );
    }

    public WebElement waitForVisibility(By locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public WebElement waitForClickable(By locator) {
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public boolean waitForUrlContains(String fraction) {
        return wait.until(ExpectedConditions.urlContains(fraction));
    }
}
