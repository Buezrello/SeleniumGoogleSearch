package pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FirstPage {

    private WebDriver driver;

    @FindBy(name = "q")
    private WebElement txtSearch;
    @FindBy(xpath = "//*[@id='tsf']/div[2]/div[1]/div[3]/center/input[@name='btnI']")
    private WebElement btnFeelLucky;

    public FirstPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    public void enterSearchTextAndCancelAutoSuggestions(String text) {
        txtSearch.clear();
        txtSearch.sendKeys(text);

        Actions action = new Actions(driver);
        action.sendKeys(Keys.ESCAPE).build().perform();
    }

    public void clickFillLuckyBtn() {
        btnFeelLucky.click();
    }
}
