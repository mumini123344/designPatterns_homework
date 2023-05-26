package withPageFactory.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class OnlyCaveaPage {
    WebDriver driver;

    public OnlyCaveaPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "ui-id-5")
    WebElement caveaSelection;

    @FindBys({
            @FindBy(id = "384933"),
            @FindBy(className = "cinema-title")
    })
    WebElement cinemaTitle;

    @Step
    public OnlyCaveaPage selectingCavea() {
        Actions actions = new Actions(driver);
        actions.moveToElement(caveaSelection).perform();
        return this;
    }

    @Step
    public OnlyCaveaPage clickingCavea() {
        caveaSelection.click();
        return this;
    }

    @Step
    public OnlyCaveaPage checkingCaveaOptions() {
        Assert.assertEquals("კავეა ისთ ფოინთი", cinemaTitle.getText());
        return this;
    }


}
