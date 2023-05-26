package withoutPageFactory.steps;

import io.qameta.allure.Step;
import org.testng.Assert;
import withoutPageFactory.pages.OnlyCaveaSelenidePage;

import static com.codeborne.selenide.Selenide.$;

public class OnlyCaveaSelenideSteps {
    public String nameOfTheMovie;

    OnlyCaveaSelenidePage onlyCaveaSelenidePage = new OnlyCaveaSelenidePage();


    @Step
    public OnlyCaveaSelenideSteps compareNames(){
        nameOfTheMovie = onlyCaveaSelenidePage.movieNameOnPage.getText();
        return this;
    }

    @Step
    public OnlyCaveaSelenideSteps selectingCaveaEast(){
        onlyCaveaSelenidePage.selectingCaveaSection.click();
        return this;
    }
    @Step
    public OnlyCaveaSelenideSteps selectingLastDay(){
        onlyCaveaSelenidePage.lastDay.click();
        return this;
    }
    @Step
    public OnlyCaveaSelenideSteps selectingTheLastOption(){
        onlyCaveaSelenidePage.lastOption.click();
//        $(".footer.container").scrollIntoView(true);
        return this;
    }
    @Step
    public OnlyCaveaSelenideSteps validatingNames(){
        Assert.assertEquals(nameOfTheMovie, onlyCaveaSelenidePage.movieNameOnPage.getText());
        return this;
    }

}
