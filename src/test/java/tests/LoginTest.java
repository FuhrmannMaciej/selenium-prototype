package tests;

import base.BaseTest;
import core.config.ConfigReader;
import core.driver.DriverFactory;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void shouldLoginSuccessfully() {

        String url = ConfigReader.get("base.url");

        LoginPage loginPage = new LoginPage(DriverFactory.getDriver());

        loginPage
                .open(url)
                .enterUsername("user")
                .enterPassword("password")
                .clickLogin();

    }
}