package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class TestBase {

    protected WebDriver driver;

    protected void createChromeDriver() {

        Map<String, Object> prefs = new HashMap<>();
        // preferences can be added here

        ChromeOptions chromeOptions = new ChromeOptions();
        // options can be created here

        // preferences merged to options
        chromeOptions.setExperimentalOption("prefs", prefs);

        // driver with options created
        driver = new ChromeDriver(chromeOptions);
    }

    @AfterMethod
    public void tearDownMethod() {
        if (driver != null) driver.quit();
    }

    @AfterSuite
    public void tearDownSuite() {
        if (driver != null) driver.quit();
    }
}
