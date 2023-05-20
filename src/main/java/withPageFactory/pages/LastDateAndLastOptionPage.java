package withPageFactory.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LastDateAndLastOptionPage {
    WebDriver driver;

    public String nameOfMovie;


    public LastDateAndLastOptionPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class = 'movie_first_section']//p[@class='name']")
    public WebElement movieNameOnPage;

    @FindBy(xpath = "//div[contains(@class,'ui-tabs-panel')][@aria-expanded='true']/div/ul/li[last()]")
    WebElement lastDay;

    @FindBy(xpath = "//div[contains(@class,'ui-tabs-panel')][@aria-expanded='true']/div/div[@aria-hidden = 'false'][last()]")
    WebElement lastOption;



    public LastDateAndLastOptionPage compareMovieNames() {
        nameOfMovie = movieNameOnPage.getText();
        return this;
    }

    public LastDateAndLastOptionPage selectingLastDay() {
        lastDay.click();
        return this;

    }

    public LastDateAndLastOptionPage selectingLastOption() {
        lastOption.click();
        return this;
    }

    public LastDateAndLastOptionPage validate() {
        Assert.assertEquals(nameOfMovie, movieNameOnPage.getText());
        return this;
    }
}
