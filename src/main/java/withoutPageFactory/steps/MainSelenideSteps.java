package withoutPageFactory.steps;


import io.qameta.allure.Step;
import withoutPageFactory.pages.MainSelenidePage;

public class MainSelenideSteps {
    MainSelenidePage mainPage = new MainSelenidePage();

    @Step
    public MainSelenideSteps hovering() {
        mainPage.cookie.hover();
        return this;
    }

    @Step
    public MainSelenideSteps clickCookie() {
        mainPage.acceptCookie.click();
        return this;
    }

    @Step
    public MainSelenideSteps clickMovies() {
        mainPage.movie.click();
        return this;
    }
}
