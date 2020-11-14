package tests.scenarious;

import constants.SearchPageConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pom.FirstPage;
import tests.TestBase;

public class GoogleSearch extends TestBase {

    protected void searchSeleniumWord() {

        String url = "https://www.google.com";
        String searchText = "Selenium";
        String resultText = "Selenium WebDriver";

        // go to the title page
        driver.get(url);

        // create a page object
        FirstPage firstPage = new FirstPage(driver);

        // enter a search test
        firstPage.enterSearchTextAndCancelAutoSuggestions(searchText);

        // search the text
        firstPage.clickFillLuckyBtn();

        WebDriverWait wait = new WebDriverWait(driver, 3);
        wait.until(ExpectedConditions.visibilityOfElementLocated(SearchPageConstants.seleniumSearchResult));

        Assert.assertTrue(driver.getPageSource().contains(searchText),
                String.format("The text %s not found on a search resuly page", resultText));

    }
}
