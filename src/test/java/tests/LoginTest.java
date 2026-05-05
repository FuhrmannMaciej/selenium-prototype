package tests;

import base.BaseTest;
import core.driver.DriverFactory;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void shouldLoginSuccessfully() {

        LoginPage loginPage = new LoginPage(DriverFactory.getDriver());

        loginPage
                .open("https://example.com")
                .enterUsername("user")
                .enterPassword("password")
                .clickLogin();

        // Assertion here
    }
}