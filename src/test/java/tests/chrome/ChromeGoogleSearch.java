package tests.chrome;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tests.scenarious.GoogleSearch;

import java.net.URISyntaxException;

import static helpers.Miscellaneous.osName;

public class ChromeGoogleSearch extends GoogleSearch {

    @BeforeClass(alwaysRun = true)
    public void setUpClass() throws URISyntaxException {
//        if (osName().equals("windows")) {
//            System.setProperty("webdriver.chrome.driver",
//                    ClassLoader.getSystemResource("drivers/chromedriver.exe").toURI().toString());
//        } else if (osName().equals("unix")) {
//            System.setProperty("webdriver.chrome.driver",
//                    ClassLoader.getSystemResource("drivers/chromedriver").toURI().toString());
//        }

        WebDriverManager.chromedriver().setup();
    }

    @BeforeMethod(alwaysRun = true)
    public void setUpMethod() {
        createChromeDriver();
    }

    @Test
    public void testSearchSeleniumWord() {
        searchSeleniumWord();
    }
}
