package withPageFactory.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MoviePage {
    WebDriver driver;


    @FindBy(xpath = "//body/div[@class='container cinema_container']/div[1]")
    public WebElement firstMovie;

    @FindBy(xpath = "(//p[contains(text(),'ყიდვა')])")
    public WebElement buyButton;

    public MoviePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @Step
    public MoviePage hoverMovie() {
        Actions actions = new Actions(driver);
        actions.moveToElement(firstMovie).perform();
        return this;
    }

    @Step("Clicking on first movie")
    public MoviePage clickFirstMovie() {
        buyButton.click();
        return this;
    }

    @Step
    public MoviePage ScrollToObject() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 500)");
        return this;
    }
}
