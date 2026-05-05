package base;

import core.config.ConfigReader;
import core.driver.DriverFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    @BeforeMethod
    public void setUp() {
        String browser = ConfigReader.get("browser");

        DriverFactory.initDriver(browser);
        DriverFactory.getDriver().manage().window().maximize();

    }

    @AfterMethod
    public void tearDown() {
        DriverFactory.quitDriver();
    }
}
