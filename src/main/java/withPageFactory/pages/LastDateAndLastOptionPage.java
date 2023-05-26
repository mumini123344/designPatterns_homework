package withPageFactory.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

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
    public WebElement lastDay;

    @FindBy(xpath = "//div[contains(@class,'ui-tabs-panel')][@aria-expanded='true']/div/div[@aria-hidden = 'false'][last()]/a")
    public List<WebElement> lastOption;

    @FindBys({
            @FindBy(xpath = "//*[@id=\"body\"]/div[5]"),
            @FindBy(xpath = "//*[@id=\"body\"]/div[5]/div[1]")

    })
    public WebElement popup;
    @Step
    public LastDateAndLastOptionPage compareMovieNames() {
        nameOfMovie = movieNameOnPage.getText();
        return this;
    }

    @Step
    public LastDateAndLastOptionPage selectingLastDay() {
        lastDay.click();
        return this;

    }

    @Step("Closing advertise popup")
    public LastDateAndLastOptionPage advertise(){
        popup.click();
        return this;
    }

    @Step
    public LastDateAndLastOptionPage selectingLastOption() {
        lastOption.get(lastOption.size() - 1).click();
        return this;
    }

    @Step
    public void validate() {
        Assert.assertEquals(nameOfMovie, movieNameOnPage.getText());
    }
}
